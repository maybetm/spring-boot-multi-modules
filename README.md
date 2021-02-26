## Spring boot multi modules project example 

## How to build?
Run `mvn package` in root directory.  
В результате получается архив содержащий folder with dependency jars *(lib folder)* and _spring-boot-multi-modules.jar_ 

## How to run?  
Run `spring-boot-multi-modules.jar` in `application` module. 

## What problem does this structure solve?
Comparing with packages structure, multi modules project very simple keep parallel develop.
We have more possibilities for 
По сравнению с пакетной структурой, в многомодульном проекте намного проще вести параллельную разработку.  
Появляется больше возможностей для переиспользования, тестирования и наращивания функционала.  

## Application structure
- `app` - directories for configuration files, dockerfile, shell, and any files for develop environment.
- `app/assembly` - configurer files for build project.
- `app/bin` - shell scrips for start application.
- `application` - This is main project module. отвечающий за сборку конфигурацию и запуск приложения`(maven profiles, application.yml and etc)`.
- `application-bom` - модуль отвечающий за управлением версиями модулей.
- `data-transport` - модуль для забора данных из какой-нибудь другой системы`(Get data over feign client or sring rest template and etc)`.
- `db-service` - модуль содержащий работу с базой данных`(persistence, spring-data-jpa, spring jdbc, migration pligins, migration sql scripts and etc)`.
- `web-api` - модуль может реализовать предоставление доступ к приложению поверх http`(RestController, WebSocket and etc)`.
