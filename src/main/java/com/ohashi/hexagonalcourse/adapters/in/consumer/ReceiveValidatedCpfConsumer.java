package com.ohashi.hexagonalcourse.adapters.in.consumer;

import com.ohashi.hexagonalcourse.adapters.in.consumer.mapper.CustomerMessageMapper;
import com.ohashi.hexagonalcourse.adapters.in.consumer.message.CustomerMessage;
import com.ohashi.hexagonalcourse.application.ports.in.UpdateCustomerInputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class ReceiveValidatedCpfConsumer {

    @Autowired
    private UpdateCustomerInputPort updateCustomerInputPort;

    @Autowired
    private CustomerMessageMapper customerMessageMapper;

    @KafkaListener(topics = "tp-cpf-validated", groupId = "ohashi")
    public void receive(CustomerMessage customerMessage) {
        var customer = customerMessageMapper.toCustomer(customerMessage);
        updateCustomerInputPort.update(customer, customerMessage.getZipCode());
    }
}
