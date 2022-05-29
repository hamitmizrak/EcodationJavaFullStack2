package com.hamitmizrak.project.mvcdata;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface _3_ICustomerRepository extends JpaRepository<_2_CustomerEntity,Long> {
}
