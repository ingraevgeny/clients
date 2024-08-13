package com.evg.clients.dao;

import com.evg.clients.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientsDao extends JpaRepository<Client, Long> {
}
