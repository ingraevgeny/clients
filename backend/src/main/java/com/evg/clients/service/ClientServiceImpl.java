package com.evg.clients.service;

import com.evg.clients.dao.ClientsDao;
import com.evg.clients.model.Client;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ClientServiceImpl implements ClientService {

    private final ClientsDao clientsDao;

    @Override
    public Client createClient(Client client) {
        return clientsDao.save(client);
    }

    @Override
    public List<Client> createAllClients(List<Client> clients) {
        return clientsDao.saveAll(clients);
    }

    @Override
    public List<Client> getAll() {
        return clientsDao.findAll();
    }

}
