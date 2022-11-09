package br.com.tiagopedroso.resth2databaseserver.controller;

import io.swagger.v3.oas.annotations.Hidden;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RootController {

    @Hidden
    @GetMapping
    String show() {
        return """
                <!DOCTYPE html>
                <html lang="pt-BR">
                <head>
                    <meta charset="UTF-8">
                    <style>
                    body {
                        background-color: black;
                        color: white;
                        font-family: Arial;
                    }
                    a {
                        text-decoration: none;
                    }
                    a:link, a:visited, a:active {
                        color: rgb(0, 255, 64);
                    }                    
                    a:hover {
                        color: rgb(0, 255, 149);
                    }
                    </style>                    
                </head>
                <body>
                <pre>
                THE REST H2 DATABASE SERVER
                     
                           )  (
                          (   ) )
                           ) ( (
                         _______)_
                      .-'---------|
                     ( C| |_| --+ |
                      '-. | |  /_ |
                        '_________'
                         '-------'
                     
                   2022-11-09, supertsp
                </pre>
                <a href="./swagger-ui.html">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; Swagger API Doc</a><br>
                <a href="./h2-console/">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; H2 Console</a>
                </body>
                </html>
                """;
    }

}
