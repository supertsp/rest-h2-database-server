package br.com.tiagopedroso.resth2databaseserver.config;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springdoc.core.GroupedOpenApi;
import org.springframework.context.annotation.Bean;

public class SwaggerConfig {

    /*
    Tips: Migrating from SpringFox
    https://springdoc.org/#migrating-from-springfox

    Swagger URL: http://localhost:8080/swagger-ui.html
     */

    @Bean
    public GroupedOpenApi publicApi() {
        return GroupedOpenApi.builder()
                .group("controller")
                .pathsToMatch("/public/**")
                .build();
    }

    @Bean
    public OpenAPI springShopOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("RestH2DatabaseServer")
                        .description("Simple H2 Database server to training SQL queries via Rest")
                        .version("1.0.0")
                        .license(new License()
                                .name("Apache 2.0")
                                .url("http://www.apache.org/licenses/LICENSE-2.0")
                        )
                )
                .externalDocs(new ExternalDocumentation()
                        .description("RestH2DatabaseServer - Source code")
                        .url("https://github.com/supertsp/rest-h2-database-server")
                );
    }

}
