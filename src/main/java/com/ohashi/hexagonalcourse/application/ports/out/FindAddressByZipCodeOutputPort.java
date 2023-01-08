package com.ohashi.hexagonalcourse.application.ports.out;

import com.ohashi.hexagonalcourse.application.core.domain.Address;

public interface FindAddressByZipCodeOutputPort {

    Address find(String zipCode);
}
