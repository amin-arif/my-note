# **Spring Short Note**

## 1. What is Spring Bean?

> In Spring, the objects that form the backbone of your application and that are managed by the Spring IoC container are called beans. A bean is an object that is instantiated, assembled, and otherwise managed by a Spring IoC container.

</br>

## 2. What is Spring IoC Container?

> Simply put, Inversion of Control (IoC) is a process in which an object defines its dependencies without creating them. This object delegates the job of constructing such dependencies to an IoC container. 

</br>

## 3. @PostConstruct and @PreDestroy

> **@PostConstruct:** tells Spring to run the function after the bean’s properties were initialized. A method with @PostConstruct will run even there is nothing to initialize. (Behavior like constructor)
>
> **@PreDestroy:** A method annotated with @PreDestroy runs only once, just before Spring removes our bean from the application context. (Behavior like destructor)
>
> Both @PostConstruct and @PreDestroy can have any access level, but can not be static.

</br>

## 4. What is Hibernate?

> Hibernate is an implementation of JPA

</br>

## 5. Spring Context

> When a spring application run, all dependent objects of the application are loaded or created into spring context (Bean created).

</br>

## 6. Dependency Injection

> Dependency Injection (DI) is a design technique that removes dependencies from computer code, making the application easier to maintain and test. 
>
> It makes programming code loosely coupled.
>
> Three types of dependency injections:

```txt
i. Field Injection
ii. Constructor Injection
iii. Setter Injection
```

```java
// Field Injection example
@Autowired
EmpRepo epmRepo;

// Constructor Injection example
EmpRepo epmRepo;
@Autowired
public EmpConstructor(EmpRepo epmRepo) {
	this.empRepo = empRepo;
}

// Setter Injection example
EmpRepo epmRepo;
@Autowired
public void setEmpRepo(EmpRepo epmRepo) {
	this.empRepo = empRepo;
}
```

</br>

## 7. Implemetation Cofiguration

> How Spring knows which implementation to be inject

```txt
i. @Primary
ii. @Qualifier("empRepoImpl2")
```

</br>

## 8. Stereotype Annotations

> Stereotype annotations are used to create Spring beans automatically in the application context.
> [Read more](https://www.geeksforgeeks.org/spring-stereotype-annotations/)

```txt
1. @Component
2. @Service
3. @Repository
4. @Controller
```

</br>

## 9. Spring Boot Actuator

> Spring Boot Actuator Endpoints lets us monitor and interact with our application. 
>
> It is a Spring Boot sub-module and production ready features (without implement any production grade tools).
>
> It uses HTTP endpoints to expose operational information about any running application.
>
> Using this library, we get monitoring metrics like health metrices, understanding traffic, or the state of our database etc.
>
> [Read more](https://www.digitalocean.com/community/tutorials/spring-boot-actuator-endpoints)

</br>

## 10. Further Topic
