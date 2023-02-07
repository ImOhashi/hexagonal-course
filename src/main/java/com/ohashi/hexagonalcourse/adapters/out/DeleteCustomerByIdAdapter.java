package com.ohashi.hexagonalcourse.adapters.out;

import com.ohashi.hexagonalcourse.adapters.out.repository.CustomerRespository;
import com.ohashi.hexagonalcourse.application.ports.out.DeleteCustomerByIdOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DeleteCustomerByIdAdapter implements DeleteCustomerByIdOutputPort {

    @Autowired
    private CustomerRespository customerRespository;

    @Override
    public void delete(String id) {
        customerRespository.deleteById(id);
    }
}
