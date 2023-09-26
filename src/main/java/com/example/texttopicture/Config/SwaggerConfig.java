package com.example.texttopicture.Config;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/*
* 문서 자동화 Swagger 설정 클래스
* */

@Configuration
@EnableSwagger2
public class SwaggerConfig {


    private ApiInfo SwaggerInfo() {
        return new ApiInfoBuilder()
                .title("API 시범 문서")
                .description("SWAGGER 테스트 문서")
                .version("1.0")
                .build();
    }


    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select() // 문서화할 API의 선택조건을 설정
                .apis(RequestHandlerSelectors.any()) // 컨트롤러 패키지 위치
                .paths(PathSelectors.any()) // 문서화를 할 API 경로
                .build().apiInfo(SwaggerInfo()); // API INFO
    }
}
