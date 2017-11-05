/*
 * Copyright 2017 Jin Kwon &lt;onacit at gmail.com&gt;.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.jinahya.mybatis.type;

import static java.util.Objects.requireNonNull;

public abstract class TypeConverter2<X, Y> implements TypeConverter<X, Y> {

    public TypeConverter2(final Class<X> attributeClass,
                          final Class<Y> columnClass) {
        super();
        this.attributeClass
                = requireNonNull(attributeClass, "attributeClass is null");
        this.columnClass = requireNonNull(columnClass, "columnClass is null");
    }

    // -------------------------------------------------------------------------
    /**
     * The type of entity attribute.
     */
    protected final Class<X> attributeClass;

    /**
     * The type of database column.
     */
    protected final Class<Y> columnClass;
}
