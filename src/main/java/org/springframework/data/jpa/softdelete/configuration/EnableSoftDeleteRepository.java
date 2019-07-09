package org.springframework.data.jpa.softdelete.configuration;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.jpa.softdelete.repository.SoftDeleteRepositoryFactoryBean;

import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@EnableJpaRepositories(repositoryFactoryBeanClass = SoftDeleteRepositoryFactoryBean.class)
public @interface EnableSoftDeleteRepository {
}
