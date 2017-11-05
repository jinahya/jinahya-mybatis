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

/**
 * An interface for type conversion.
 *
 * @author Jin Kwon &lt;onacit at gmail.com&gt;
 * @param <X> entity attribute type parameter
 * @param <Y> database column type parameter
 */
public interface TypeConverter<X, Y> {

    /**
     * Converts a column value to an attribute value.
     *
     * @param columnValue the column value to convert
     * @return a converted attribute value.
     */
    X toAttributeType(Y columnValue);

    /**
     * Converts a attribute value to a column value.
     *
     * @param attributeValue the attribute value to convert
     * @return a converted column value.
     */
    Y toColumnType(X attributeValue);
}
