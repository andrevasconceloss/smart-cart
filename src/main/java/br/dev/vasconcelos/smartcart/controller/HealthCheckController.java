package br.dev.vasconcelos.smartcart.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "Healthcheck")
@RestController
@RequestMapping(path = "/ping", produces = MediaType.APPLICATION_JSON_VALUE)
public class HealthCheckController {

    @ApiOperation(value = "Return OK if the application is running")
    @GetMapping
    HttpStatus ping() {
        return HttpStatus.OK;
    }
}
