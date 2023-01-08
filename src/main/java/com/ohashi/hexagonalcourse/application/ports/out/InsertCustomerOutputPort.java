package com.ohashi.hexagonalcourse.application.ports.out;

import com.ohashi.hexagonalcourse.application.core.domain.Customer;

public interface InsertCustomerOutputPort {

    void insert(Customer customer);
}
