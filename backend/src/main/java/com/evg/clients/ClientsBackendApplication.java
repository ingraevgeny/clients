package com.evg.clients;

import com.evg.clients.model.Client;
import com.evg.clients.service.ClientService;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

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
      List<Client> clients = ignoringObjectMapper.readValue(
          """
              [
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
                  },
                  {
                    "firstName": "George",
                    "lastName": "Trump",
                    "fullName": "George Trump",
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
                  },
                  {
                    "firstName": "Lenny",
                    "lastName": "Kratzer",
                    "fullName": "Lenny Kratzer",
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
                  },
                  {
                    "firstName": "Mike",
                    "lastName": "Portnoy",
                    "fullName": "Mike Portnoy",
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
              ]
              """, new TypeReference<List<Client>>() {
          });
      clientService.createAllClients(clients);
    };
  }
}
