package com.ohashi.hexagonalcourse.adapters.in.controller;

import com.ohashi.hexagonalcourse.adapters.in.controller.mapper.CustomerMapper;
import com.ohashi.hexagonalcourse.adapters.in.controller.request.CustomerRequest;
import com.ohashi.hexagonalcourse.adapters.in.controller.response.CustomerResponse;
import com.ohashi.hexagonalcourse.application.ports.in.FindCustomerByIdInputPort;
import com.ohashi.hexagonalcourse.application.ports.in.InsertCustomerInputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/v1/customers")
public class CustomerController {

    @Autowired
    private InsertCustomerInputPort insertCustomerInputPort;

    @Autowired
    private CustomerMapper customerMapper;

    @Autowired
    private FindCustomerByIdInputPort findCustomerByIdInputPort;

    @PostMapping
    public ResponseEntity<Void> insert(@Valid @RequestBody CustomerRequest customerRequest) {
        var customer = customerMapper.toCustomer(customerRequest);
        insertCustomerInputPort.insert(customer, customerRequest.getZipCode());
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<CustomerResponse> findById(@PathVariable final String id) {
        var customer = findCustomerByIdInputPort.find(id);
        var customerResponse = customerMapper.toCustomerResponse(customer);
        return ResponseEntity.ok().body(customerResponse);
    }
}
