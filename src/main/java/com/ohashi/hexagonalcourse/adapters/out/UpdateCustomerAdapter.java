package com.ohashi.hexagonalcourse.adapters.out;

import com.ohashi.hexagonalcourse.adapters.in.controller.mapper.CustomerMapper;
import com.ohashi.hexagonalcourse.adapters.out.repository.CustomerRespository;
import com.ohashi.hexagonalcourse.adapters.out.repository.mapper.CustomerEntityMapper;
import com.ohashi.hexagonalcourse.application.core.domain.Customer;
import com.ohashi.hexagonalcourse.application.ports.out.UpdateCustomerOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UpdateCustomerAdapter implements UpdateCustomerOutputPort {

    @Autowired
    private CustomerRespository customerRespository;

    @Autowired
    private CustomerEntityMapper customerEntityMapper;

    @Override
    public void update(Customer customer) {
        var customerEntity = customerEntityMapper.toCustomerEntity(customer);
        customerRespository.save(customerEntity);
    }
}
