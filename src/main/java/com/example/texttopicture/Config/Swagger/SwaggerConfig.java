package com.example.texttopicture.Config.Swagger;



import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springdoc.core.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/*
* 문서 자동화 Swagger 설정 클래스
* */

@Configuration
public class SwaggerConfig {

    @Bean
    public GroupedOpenApi publicApi() {
        return GroupedOpenApi.builder()
                .group("v1-definition")
                .pathsToMatch("/api/testapi/**")
                .build();
    }


    @Bean
    public OpenAPI OpenApiInfo() {
        Info info = new Info()
                .title("TextToPicture")
                .description("TextToPicture 프로젝트의 API 명세서입니다")
                .version("v0.0.1");

        return new OpenAPI()
                .info(info);
    }
}
