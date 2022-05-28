package com.hamitmizrak.springboot.data.impl;

import com.hamitmizrak.springboot.data.ProductEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProduct extends CrudRepository<ProductEntity,Long> {
}
