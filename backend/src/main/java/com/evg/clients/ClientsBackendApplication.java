package com.evg.clients;

import com.evg.clients.model.Client;
import com.evg.clients.service.ClientService;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@AllArgsConstructor
public class ClientsBackendApplication {

    private final ObjectMapper ignoringObjectMapper;
    public static void main(String[] args) {
        SpringApplication.run(ClientsBackendApplication.class, args);
    }

    @Bean
    public CommandLineRunner demo(ClientService clientService) {
        return (args) -> {
            Client client = ignoringObjectMapper.readValue(
                    """
                            {
                              "firstName": "David",
                              "lastName": "Smith",
                              "fullName": "David Smith",
                              "address": [
                                {
                                  "fullAddress": "32, Manhattan st, New York, USA",
                                  "addressType": "Job"
                                },
                                {
                                  "fullAddress": "47, Brooklyn, New York, USA",
                                  "addressType": "Home"
                                }
                              ]
                            }
                            """, Client.class);
            clientService.createClient(client);
        };
    }
}
