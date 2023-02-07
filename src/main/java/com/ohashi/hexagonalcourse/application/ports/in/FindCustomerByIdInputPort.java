package com.ohashi.hexagonalcourse.application.ports.in;

import com.ohashi.hexagonalcourse.application.core.domain.Customer;

public interface FindCustomerByIdInputPort {

    Customer find(String id);
}
