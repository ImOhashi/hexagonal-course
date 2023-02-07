package com.ohashi.hexagonalcourse.application.core.usecase;

import com.ohashi.hexagonalcourse.application.core.domain.Customer;
import com.ohashi.hexagonalcourse.application.ports.in.FindCustomerByIdInputPort;
import com.ohashi.hexagonalcourse.application.ports.out.FindCustomerByIdOutputPort;

public class FindCustomerByIdUseCase implements FindCustomerByIdInputPort {

    private final FindCustomerByIdOutputPort findCustomerByIdOutputPort;

    public FindCustomerByIdUseCase(FindCustomerByIdOutputPort findCustomerByIdOutputPort) {
        this.findCustomerByIdOutputPort = findCustomerByIdOutputPort;
    }

    @Override
    public Customer find(String id) {
        return findCustomerByIdOutputPort.find(id).orElseThrow(() -> new RuntimeException("Customer not found"));
    }
}
