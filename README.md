# spring-data-jpa-soft-delete

[![](https://jitpack.io/v/minhbxn/spring-data-jpa-soft-delete.svg)](https://jitpack.io/#minhbxn/spring-data-jpa-soft-delete)


## Maven dependency

```xml
<dependency>
    <groupId>com.github.minhbxn</groupId>
    <artifactId>spring-data-jpa-soft-delete</artifactId>
    <version>0.1</version>
</dependency>
```

## Getting started

### 1. Enable the use of `DataTablesRepository` factory

With either

```java
@Configuration
@EnableSoftDeleteRepository
public class ApplicationConfiguration {}
```