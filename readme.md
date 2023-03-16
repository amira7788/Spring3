# logging levels for more to less:
- Trace+=
- debug+=
- info+=
- warning+=
- error+=
- off
---
# to add level on profile
```
logging.level.org.springframework=debug
spring.profiles.active=dev
```

---
- to create a link with configuration properties you need to creat a bean class with 
`@ConfigurationProperties(prefix = "currency-service")`

---
# Spring boot Actuator :
Monitor and manage your application in your production
provides a number of endponts as:
- beans
- health
- metrics
- mappings
- ...
--- 
# Actuator 
adding in pom.xml
```
<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-actuator</artifactId>
</dependency>
```
/actuator to access all
adding all metrics access in your project
  ` management.endpoints.web.exposure.include=* //health,metrics`
- 
--- 
Spring framework: it's all about Dependency Injection:
 - @Component, @Autowired, component Scan ...
 - spring modules ans spring projects extend spring echo system
 - spring MVC: befor struts it's a spring module simplify web apps and rest api
   - Building web applications with struts was very complex
   - @Controller, RestController, RequestMapping
 - Spring Boot: its a srping project 
   - Starter Projects
   - Auto configuration
   - Enable NFR Non functional Requirements
     - Actuator
     - Embedded Server: no need for separate application servers
     - Logging and error handling
     - profiles and configurationProperties
---
# spring boot
- production ready + quickly

- @SpringBootApplication annotation is a combination of 3 annotations: @SpringBootConfiguration + @EnableAutoConfiguration + @ComponentScan

- spring actuator: manage and metrics app in production
- Spring MVC it is a module of spring to create web and REST API application on a spring boot project 


