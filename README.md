jinahya-mybatis
===============

A set of extended classes for MyBatis.

## `...batis.type`

### `TypeConverter<X, Y>`

An interface for converting attributes to/from columns.

```java
public class DateMillisConverter implements TypeConverter<Date, Long> {

    @Override
    public Date toAttributeType(final Long columnValue) {
        return ofNullable(columnValue).map(Date::new).orElse(null);
    }
    
    @Override
    public Long toAttributeType(final Date attributeValue) {
        return ofNullable(attributeValue).map(Date::getTime).orElse(null);
    }
}
```

### `TypeAdapter<T extends TypeConverter<X, Y>, X, Y>`

A class extends `BaseTypeHandler<X>` and implements methods using a `TypeConverter<X, Y>`.

```java
@MappedJdbcTypes(JdbcType.BIGINT)
public class DateMillisAdapter extends TypeAdapter<DateMillisConverter, Date, Long> {

    public DateMillisAdapter() {
        super(DateMillisConverter.class);
    }
    
    // override if you need to
    //public void setNonNullParameter(final PreparedStatement ps, final int i,
    //                                final X parameter, final JdbcType jdbcType)
    //public X getNullableResult(final ResultSet rs, final String columnName)
    //public X getNullableResult(final ResultSet rs, final int columnIndex)
    //public X getNullableResult(final CallableStatement cs,
    //                           final int columnIndex)
}
```
