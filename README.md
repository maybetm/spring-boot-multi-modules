## Spring boot multi modules project example 

## How to build?
Run `mvn package` in root directory.  
On result, we have archive, includes a folder with dependency  jars *(lib folder)* and _spring-boot-multi-modules.jar_ 

<details>
  <summary>Artifact tree</summary>

  ```shell
    spring-boot-multi-modules
    │   spring-boot-multi-modules.jar
    └───lib
        antlr-2.7.7.jar
        aspectjweaver-1.9.6.jar
        byte-buddy-1.10.17.jar
        checker-qual-3.5.0.jar
        classmate-1.5.1.jar
        data-transport-2.0-SNAPSHOT.jar
        db-service-1.0-SNAPSHOT.jar
        dom4j-2.1.3.jar
        hibernate-commons-annotations-5.1.0.Final.jar
        hibernate-core-5.4.22.Final.jar
        HikariCP-3.4.5.jar
        istack-commons-runtime-3.0.11.jar
        jackson-annotations-2.11.3.jar
        jackson-core-2.11.3.jar
        jackson-databind-2.11.3.jar
        jackson-datatype-jdk8-2.11.3.jar
        jackson-datatype-jsr310-2.11.3.jar
        jackson-module-parameter-names-2.11.3.jar
        jakarta.activation-1.2.2.jar
        jakarta.annotation-api-1.3.5.jar
        jakarta.el-3.0.3.jar
        jakarta.persistence-api-2.2.3.jar
        jakarta.transaction-api-1.3.3.jar
        jakarta.xml.bind-api-2.3.3.jar
        jandex-2.1.3.Final.jar
        javassist-3.24.0-GA.jar
        jaxb-runtime-2.3.3.jar
        jboss-logging-3.4.1.Final.jar
        jul-to-slf4j-1.7.30.jar
        log4j-api-2.13.3.jar
        log4j-to-slf4j-2.13.3.jar
        logback-classic-1.2.3.jar
        logback-core-1.2.3.jar
        postgresql-42.2.18.jar
        slf4j-api-1.7.30.jar
        snakeyaml-1.26.jar
        spring-aop-5.2.10.RELEASE.jar
        spring-aspects-5.2.10.RELEASE.jar
        spring-beans-5.2.10.RELEASE.jar
        spring-boot-2.3.5.RELEASE.jar
        spring-boot-autoconfigure-2.3.5.RELEASE.jar
        spring-boot-starter-2.3.5.RELEASE.jar
        spring-boot-starter-aop-2.3.5.RELEASE.jar
        spring-boot-starter-data-jpa-2.3.5.RELEASE.jar
        spring-boot-starter-jdbc-2.3.5.RELEASE.jar
        spring-boot-starter-json-2.3.5.RELEASE.jar
        spring-boot-starter-logging-2.3.5.RELEASE.jar
        spring-boot-starter-tomcat-2.3.5.RELEASE.jar
        spring-boot-starter-web-2.3.5.RELEASE.jar
        spring-context-5.2.10.RELEASE.jar
        spring-core-5.2.10.RELEASE.jar
        spring-data-commons-2.3.5.RELEASE.jar
        spring-data-jpa-2.3.5.RELEASE.jar
        spring-expression-5.2.10.RELEASE.jar
        spring-jcl-5.2.10.RELEASE.jar
        spring-jdbc-5.2.10.RELEASE.jar
        spring-orm-5.2.10.RELEASE.jar
        spring-tx-5.2.10.RELEASE.jar
        spring-web-5.2.10.RELEASE.jar
        spring-webmvc-5.2.10.RELEASE.jar
        tomcat-embed-core-9.0.39.jar
        tomcat-embed-websocket-9.0.39.jar
        txw2-2.3.3.jar
        web-api-1.0-SNAPSHOT.jar
  ```
</details>

****

## How to run?  
Run `spring-boot-multi-modules.jar` in `application` module. 

>**Example:**  
>java -jar spring-boot-multi-modules.jar
***

## What problem does this structure solve?
Comparing with packages structure, multi modules project very simple keep parallel develop.
We have more possibilities for reusing, testing and supporting  

## Application structure
- `app` - directories for configuration files, dockerfile, shell, and any files for develop environment.
- `app/assembly` - configurer files for build project.
- `app/bin` - shell scrips for start application.
- `application` - This is main project module. Responsible for assembling the configuration and run the application`(maven profiles, application.yml and etc)`.
- `application-bom` - This module is responsible for managing versions of project modules.
- `data-transport` - Communication with other applications over rest, rpc and other`(Get data over feign client or sring rest template and etc)`.
- `db-service` - Persistence layer`(persistence, spring-data-jpa, spring jdbc, migration pligins, migration sql scripts and etc)`.
- `web-api` - Application api`(Swager, RestController, WebSocket and etc)`.
