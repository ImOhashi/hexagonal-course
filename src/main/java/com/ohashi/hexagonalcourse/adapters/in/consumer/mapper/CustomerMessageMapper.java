package com.ohashi.hexagonalcourse.adapters.in.consumer.mapper;

import com.ohashi.hexagonalcourse.adapters.in.consumer.message.CustomerMessage;
import com.ohashi.hexagonalcourse.application.core.domain.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CustomerMessageMapper {

    @Mapping(target = "Address", ignore = true)
    Customer toCustomer(CustomerMessage customerMessage);
}
