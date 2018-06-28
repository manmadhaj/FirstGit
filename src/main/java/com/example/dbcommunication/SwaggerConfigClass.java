package com.example.dbcommunication;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfigClass {
	
	@Bean
	public Docket dbConfigSwagger(){
		return new Docket(DocumentationType.SWAGGER_2).select().apis(RequestHandlerSelectors.basePackage("com.example.dbcommunication.controller")).paths(PathSelectors.any()).build().apiInfo(swaggerMetadata());
	}
	private ApiInfo swaggerMetadata(){
		String title="db communication module";
		String description="To communicate with db to perform some CRUD operations";
		String version="1.0-SNAP-SHOT";
		String termsOfServiceUrl="WWW.Dru.care/tc.html";
		Contact contact=new Contact("Call-@-Developer","WWW.Dru.care/Home.html","help@Dru.care.com");
		String license="Drucare License";
		String licenseUrl="WWW.license.drucare.html";
		return new ApiInfo(title, description, version, termsOfServiceUrl, contact, license, licenseUrl); 
	}
	
}
