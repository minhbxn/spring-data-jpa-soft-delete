package org.springframework.data.jpa.softdelete.repository;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.io.Serializable;

@NoRepositoryBean
public interface SoftDeleteJPARepository<T, ID extends Serializable>
        extends PagingAndSortingRepository<T, ID>, JpaSpecificationExecutor<T> {

}
