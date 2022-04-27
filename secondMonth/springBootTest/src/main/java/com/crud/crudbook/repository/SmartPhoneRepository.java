package com.crud.crudbook.repository;

import com.crud.crudbook.entity.SmartPhone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SmartPhoneRepository extends JpaRepository<SmartPhone, Long> {
}
