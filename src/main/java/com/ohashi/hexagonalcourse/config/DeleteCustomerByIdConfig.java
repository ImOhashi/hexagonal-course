package com.ohashi.hexagonalcourse.config;

import com.ohashi.hexagonalcourse.adapters.out.DeleteCustomerByIdAdapter;
import com.ohashi.hexagonalcourse.application.core.usecase.DeleteCustomerByIdUseCase;
import com.ohashi.hexagonalcourse.application.core.usecase.FindCustomerByIdUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DeleteCustomerByIdConfig {

    @Bean
    public DeleteCustomerByIdUseCase deleteCustomerByIdUseCase(
            FindCustomerByIdUseCase findCustomerByIdUseCase,
            DeleteCustomerByIdAdapter deleteCustomerByIdAdapter
    ) {
        return new DeleteCustomerByIdUseCase(findCustomerByIdUseCase, deleteCustomerByIdAdapter);
    }
}
