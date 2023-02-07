package com.ohashi.hexagonalcourse.config;

import com.ohashi.hexagonalcourse.adapters.out.FindAddressByZipCodeAdapter;
import com.ohashi.hexagonalcourse.adapters.out.UpdateCustomerAdapter;
import com.ohashi.hexagonalcourse.application.core.usecase.FindCustomerByIdUseCase;
import com.ohashi.hexagonalcourse.application.core.usecase.UpdateCustomerUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UpdateCustomerConfig {

    @Bean
    public UpdateCustomerUseCase updateCustomerUseCase(
            FindCustomerByIdUseCase findCustomerByIdAdapter,
            FindAddressByZipCodeAdapter findAddressByZipCodeAdapter,
            UpdateCustomerAdapter updateCustomerAdapter
    ) {
        return new UpdateCustomerUseCase(findCustomerByIdAdapter, findAddressByZipCodeAdapter, updateCustomerAdapter);
    }
}
