package com.contactsunny.poc.spring_boot_api_docker_poc.controllers;

import com.contactsunny.poc.spring_boot_api_docker_poc.dtos.ResponseDTO;
import org.apache.logging.log4j.util.Strings;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.HttpStatus.OK;

@RestController
@RequestMapping(value = "/hello", produces = "application/json")
public class HelloWorldController {

    @GetMapping
    public ResponseEntity<ResponseDTO> helloWorldMethod(
        @RequestParam(name = "name", required = false) String name
    ) {
        if (Strings.isEmpty(name) || Strings.isBlank(name)) {
            name = "World";
        }

        ResponseDTO responseDTO = new ResponseDTO();
        responseDTO.setMessage("Hello, " + name);

        return new ResponseEntity<>(responseDTO, OK);
    }
}
