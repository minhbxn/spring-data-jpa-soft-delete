package org.springframework.data.jpa.softdelete.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.support.JpaRepositoryFactoryBean;

import java.io.Serializable;

public class SoftDeleteRepositoryFactoryBean<R extends JpaRepository<T, ID>, T, ID extends Serializable>
        extends JpaRepositoryFactoryBean<R, T, ID> {

    public SoftDeleteRepositoryFactoryBean(Class<? extends R> repositoryInterface) {
        super(repositoryInterface);
    }


}
