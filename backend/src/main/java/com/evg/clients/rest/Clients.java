package com.evg.clients.rest;

import com.evg.clients.model.Client;
import com.evg.clients.service.ClientService;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;

@RestController
@RequestMapping("/clients")
@AllArgsConstructor
public class Clients {

    private final ClientService clientService;
    private final ObjectMapper ignoringObjectMapper;

    @GetMapping("/info")
    public String getInfo() {
        return "This is a Clients Microservice";
    }

    @PutMapping("/createClient")
    public ResponseEntity<String> createClient(@RequestBody Client client) {
        try {
            return new ResponseEntity<>("Created Client: " +
                    ignoringObjectMapper.writeValueAsString(clientService.createClient(client)), HttpStatus.OK );
         } catch (Exception e) {
            return new ResponseEntity<>("Client was not created: " + Arrays.toString(e.getStackTrace()), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/getAll")
    public ResponseEntity<String> getAll() {
        try {
            return new ResponseEntity<>(
                    ignoringObjectMapper.writeValueAsString(clientService.getAll()), HttpStatus.OK );
        } catch (Exception e) {
            return new ResponseEntity<>(Arrays.toString(e.getStackTrace()), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
