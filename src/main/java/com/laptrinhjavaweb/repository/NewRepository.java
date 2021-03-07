package com.laptrinhjavaweb.repository;

import com.laptrinhjavaweb.entities.NewEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NewRepository extends JpaRepository<NewEntity,Long> {
    NewEntity findOneById(Long id);
}
