package com.example.players_api.service;


import com.example.players_api.model.Player;
import com.example.players_api.repository.PlayerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerService {
    //Constructor Injection

    private final PlayerRepository repo;

    public PlayerService(PlayerRepository repo){
        this.repo = repo;
    }
    public List<Player> getAllPlayers() {
        return repo.findAll();
    }

}
