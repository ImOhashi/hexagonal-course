package com.ohashi.hexagonalcourse.application.ports.out;

import com.ohashi.hexagonalcourse.application.core.domain.Customer;

import java.util.Optional;

public interface FindCustomerByIdOutputPort {

    Optional<Customer> find(String id);
}
