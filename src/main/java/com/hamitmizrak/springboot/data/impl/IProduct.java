package com.hamitmizrak.springboot.data.impl;

import com.hamitmizrak.springboot.data.ProductEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IProduct extends CrudRepository<ProductEntity,Long> {
    // 1.)find  2.)EntityName 3.)By  4.)Entity Attribute
    List<ProductEntity> findProductEntityByProductName(String productName);

}
