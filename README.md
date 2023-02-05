## Java Industry Standard Frameworks:

> A Java industry standard framework is a pre-built collection of libraries and tools that provides a standardized 
> and reusable solution for a specific type of software development problem. It helps developers to build applications 
> faster, with less code and less complexity, by providing a set of common functionality and best practices. 
> The goal of a Java industry standard framework is to simplify software development by providing a set of well-established, 
> tested, and widely-used components and patterns that can be reused across multiple projects.

>    Some examples of Java industry standard frameworks include the Spring Framework, Hibernate, Struts, and Play Framework. <br>
>    These frameworks provide different functionality, such as Dependency Injection, Object-Relational Mapping, Model-View-Controller architecture, 
>    and Reactive programming, and are used for different types of software development, such as web applications, enterprise applications, and microservices.
>

### Spring Framework:
> Spring Framework is a lightweight, modular, and loosely coupled framework that provides a comprehensive programming and configuration model for modern Java-based enterprise applications.
>
> It is an open-source framework that provides a comprehensive infrastructure support for developing Java applications.
> Spring provides a range of features such as dependency injection, data access, transaction management, security, and more.
> It can be used to develop any Java application, including web applications, desktop applications, and mobile applications.
>> It is one of the most popular Java frameworks and is used by many large organizations, such as Netflix, Amazon, and eBay.
>
> Some of its features include Dependency Injection (DI), Aspect-Oriented Programming (AOP), and data access support.


Example:
```java
    @RestController
    public class CustomerController {
        @Autowired
        private CustomerService customerService;
        
        @GetMapping("/customers")
        public List<Customer> getCustomers() {
            return customerService.getCustomers();
        }
    }
```
```java
    @Service
    public class CustomerService {
        @Autowired
        private CustomerRepository customerRepository;
        
        public List<Customer> getCustomers() {
            return customerRepository.findAll();
        }
    }
```

### Hibernate Framework:

> It is a Java-based object-relational mapping (ORM) framework that provides a mechanism for mapping Java objects to relational database tables. 
> It eliminates the need to write SQL queries and provides a high-level API for performing database operations.
>
> It is an Object-Relational Mapping (ORM) framework that provides a simple 
> and efficient way to map Java objects to relational database tables and vice versa.

Example:
> To perform CRUD (create, read, update, delete) operations using Hibernate, 
> you can create a Entity class and use the EntityManager to perform operations.
```java
    @Entity
    @Table(name = "customers")
    public class User {
        @Id
        @GeneratedValue(strategy=GenerationType.IDENTITY)
        private Long id;
        
        @Column(name = "first_name")
        private String firstName;
    
        @Column(name = "last_name")
        private String lastName;
        
        // getters and setters
    }
```
```java
    public class UserDao {
        @PersistenceContext
        EntityManager entityManager;
        
        public void createUser(User user) {
            entityManager.persist(user);
        }
    
        public User findUserById(Long id) {
            return entityManager.find(User.class, id);
        }
        
        public void updateUser(User user) {
            entityManager.merge(user);
        }
        
        public void deleteUser(User user) {
            entityManager.remove(user);
        }
    }
```

---

## Java Web Services:
    
> A Java web service is a software system designed to support interoperable machine-to-machine interaction over a network. 
> It allows different applications and systems to communicate with each other using standardized protocols, such as HTTP and XML.
> Java web services are typically built using Java technology and can be consumed by other applications, 
> regardless of the programming language or platform they are built on.
> 
> A Java web service provides a specific functionality to client applications, and it is typically designed to be lightweight,
> fast, and scalable. It can be used to provide access to a database, perform calculations, or provide access to a business process. 
> Java web services are usually accessed using HTTP requests, and the data is exchanged using XML or JSON format.
> 
> Examples of Java web services include a stock quote service, a weather service, and a currency conversion service. 
> These services can be consumed by client applications, such as mobile apps, desktop applications, and web applications,
> to provide a specific functionality to the end user.


### RESTful Web Services:

> REST (Representational State Transfer) is a style of web architecture that provides a standard for creating web services.
 >RESTful web services are stateless, client-server based, and use HTTP methods such as GET, POST, PUT, and DELETE to perform operations.

Example: 

> To create a RESTful web service that returns a list of users, you can create a REST endpoint using the @RestController annotation and return a list of users.
```java
    @RestController
    public class UserController {
        private List<User> users = Arrays.asList(
        new User(1L, "John Doe", "john.doe@example.com"),
        new User(2L, "Jane Doe", "jane.doe@example.com")
    );
    
    @GetMapping("/users")
        public List<User> getUsers() {
            return users;
        }
    }
```

### SOAP Web Services: 
    
> SOAP (Simple Object Access Protocol) is a protocol for exchanging structured information in the implementation of web services.
> It provides a standard for creating web services that can be accessed over a network, such as the Internet.

Example: 
    
> To create a SOAP web service that returns the sum of two numbers, you can create a web service endpoint 
> using the @WebService annotation and use the @WebMethod annotation to define the operation.

```java
    @WebService
        public class Calculator {
        @WebMethod
        public int add(int a, int b) {
            return a + b;
        }
    }
```

### JAX-WS (Java API for XML Web Services):

> It is a Java API for creating web services and clients that communicate using XML.
> It allows developers to build web services using Java and provides a standard way of
> creating, publishing, and consuming web services.

Example:
```java
    @WebService
    public class CustomerService {
        @WebMethod
        public List<Customer> getCustomers() {
            // implementation
        }
    }
```

### JAX-RS (Java API for RESTful Web Services):
>
> It is a Java API for creating RESTful web services.
> It provides a standard way of building RESTful web services using Java and enables developers to easily create, deploy, and consume RESTful web services.

Example:
```java
    @Path("/customers")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public class CustomerResource {
        @GET
        public List<Customer> getCustomers() {
        // implementation
        }
    }
```

### Jersey:
> It is a RESTful web services framework for Java that provides support
> for JAX-RS APIs and serves as a JAX-RS (JSR 311 & JSR 339) Reference Implementation. 
> 
> Jersey provides it’s own API that extend the JAX-RS toolkit with additional features and utilities to further simplify RESTful service and client development. Jersey also exposes numerous extension SPIs so that developers may extend Jersey to best suit their needs.