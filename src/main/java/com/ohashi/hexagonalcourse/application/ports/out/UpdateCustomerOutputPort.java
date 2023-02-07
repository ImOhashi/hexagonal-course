package com.ohashi.hexagonalcourse.application.ports.out;

import com.ohashi.hexagonalcourse.application.core.domain.Customer;

public interface UpdateCustomerOutputPort {

    void update(Customer customer);
}
