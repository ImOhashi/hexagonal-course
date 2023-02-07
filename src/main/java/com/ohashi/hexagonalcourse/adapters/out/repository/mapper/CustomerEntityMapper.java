package com.ohashi.hexagonalcourse.adapters.out.repository.mapper;

import com.ohashi.hexagonalcourse.adapters.out.repository.entity.CustomerEntity;
import com.ohashi.hexagonalcourse.application.core.domain.Customer;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerEntityMapper {

    CustomerEntity toCustomerEntity(Customer customer);

    Customer toCustomer(CustomerEntity customerEntity);
}
