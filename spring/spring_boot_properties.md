# **Spring Boot Properties**

</br>

### 1. **Enable spring secutity**

```properties
spring.security.user.name=arif
spring.security.user.password=arifpass
```

### 2. **Set custom server port**

```properties
server.port=9999
```

### 3. **Actuator configurations**

```properties
# Enable all actuator features
management.endpoints.web.exposure.include=*

# Enable specific actuator features
management.endpoints.web.exposure.include=health,info,env,beans

# Customize Actuator endpoints base path
management.endpoints.web.base-path=/act

# custom info properties
info.app.name=Spring Actuator Example
info.app.java.version=10
info.app.type=Spring Boot
```

### 4. **Spring Boot JDBC connection**

```properties
# Connect to Postgres database
spring.datasource.url=jdbc:postgresql://localhost:5432/springbootdb
# Connect to MySQL database
spring.datasource.url=jdbc:mysql://localhost:3306/springbootdb  

# Set database username
spring.datasource.username=root  

# Set database password
spring.datasource.password=dbPass
```

### 5. **JPA & Hibernate properties**

```properties
# Show JPA sql queries in log
spring.jpa.show-sql=true

# Show queries in user friendly format in log
spring.jpa.properties.hibernate.format_sql=true

## DDL Generation
spring.jpa.hibernate.ddl-auto=validate

# The dialect specifies the type of database used in hibernate
# so that hibernate generate appropriate type of SQL statements.
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQL81Dialect
```

[learn more about these the DDL Generation properties](https://stackoverflow.com/questions/42135114/how-does-spring-jpa-hibernate-ddl-auto-property-exactly-work-in-spring)

### 6. **Further topic**
