package com.ohashi.hexagonalcourse.adapters.out.repository;

import com.ohashi.hexagonalcourse.adapters.out.repository.entity.CustomerEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRespository extends MongoRepository<CustomerEntity, String> {
}
