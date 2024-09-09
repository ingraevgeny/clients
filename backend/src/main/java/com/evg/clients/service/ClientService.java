package com.evg.clients.service;

import com.evg.clients.model.Client;

import java.util.List;

public interface ClientService {
    Client createClient(Client client);
    void createAllClients(List<Client> client);
    List<Client> getAll();
}
