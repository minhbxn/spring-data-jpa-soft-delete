package org.springframework.data.jpa.softdelete.repository;

import org.springframework.data.jpa.repository.support.JpaEntityInformation;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;

import javax.persistence.EntityManager;
import java.io.Serializable;

public class SoftDeleteJPARepositoryImpl<T, ID extends Serializable> extends SimpleJpaRepository<T, ID>
        implements SoftDeleteJPARepository<T, ID> {

    public SoftDeleteJPARepositoryImpl(JpaEntityInformation<T, ?> entityInformation,
                                       EntityManager entityManager) {
        super(entityInformation, entityManager);
    }

    @Override
    public void deleteById(ID id) {
        super.deleteById(id);
    }

    @Override
    public void delete(T entity) {
        super.delete(entity);
    }

    @Override
    public void deleteAll(Iterable<? extends T> entities) {
        super.deleteAll(entities);
    }

    @Override
    public void deleteInBatch(Iterable<T> entities) {
        super.deleteInBatch(entities);
    }

    @Override
    public void deleteAll() {
        super.deleteAll();
    }

    @Override
    public void deleteAllInBatch() {
        super.deleteAllInBatch();
    }
}
