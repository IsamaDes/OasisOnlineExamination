package com.example.onlineexamination.config;

import com.example.onlineexamination.OnlineExaminationApplication;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import org.springframework.context.annotation.Configuration;



    @Configuration
    @OpenAPIDefinition (info = @Info(description = "Online Examination App",
            title = "Onine Examination Restful Api",
            version = "v1"))
    @SecurityScheme( name = "Bearer Authentication",
    type = SecuritySchemeType.HTTP,
    bearerFormat = "Jwt",
    scheme = "Bearer"
    )

    public class ApiConfig {
}
