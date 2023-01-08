package com.ohashi.hexagonalcourse.adapters.out.client.mapper;

import com.ohashi.hexagonalcourse.adapters.out.client.response.AddressResponse;
import com.ohashi.hexagonalcourse.application.core.domain.Address;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AddressResponseMapper {

    Address toAddress(AddressResponse addressResponse);
}
