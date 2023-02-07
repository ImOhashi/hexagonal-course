package com.ohashi.hexagonalcourse.config;

import com.ohashi.hexagonalcourse.adapters.out.FindAddressByZipCodeAdapter;
import com.ohashi.hexagonalcourse.adapters.out.InsertCustomerAdapter;
import com.ohashi.hexagonalcourse.application.core.usecase.InsertCustomerUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InsertCustomerConfig {

    @Bean
    public InsertCustomerUseCase insertCustomerUseCase(
            FindAddressByZipCodeAdapter findAddressByZipCodeAdapter,
            InsertCustomerAdapter insertCustomerAdapter
    ) {
        return new InsertCustomerUseCase(findAddressByZipCodeAdapter, insertCustomerAdapter);
    }
}
