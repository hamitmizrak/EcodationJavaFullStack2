package com.hamitmizrak.project.mvcdata;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

//CRUD < JPaRepository < PagingAndSorting

@Repository
public interface _3_ICustomerRepository extends JpaRepository<_2_CustomerEntity,Long> {
}
