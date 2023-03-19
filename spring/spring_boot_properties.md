# **Spring Boot Properties**

</br>

1. **Enable spring secutity**

        spring.security.user.name=arif
        spring.security.user.password=arif

2. **Set custom server port**

        server.port=9999

3. **Actuator configurations**

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

4. **Further topic**
