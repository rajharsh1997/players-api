package com.example.players_api.controller;

import com.example.players_api.dto.PlayerResponse;
import com.example.players_api.model.Player;
import com.example.players_api.service.PlayerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/players")
public class PlayerController {
    private final PlayerService service;

    public PlayerController(PlayerService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<PlayerResponse>> getPlayers(
            @RequestParam(name = "isAdmin", defaultValue = "false") boolean isAdmin) {

        List<Player> players = service.getAllPlayers();
        List<PlayerResponse> response = new ArrayList<>();

        for (Player p : players) {
            String lastName = null;
            if (isAdmin) {
                lastName = p.getLastName();
            }
            response.add(new PlayerResponse(p.getFirstName(), lastName));
        }

        return ResponseEntity.ok(response);
    }

    @GetMapping("/paginated")
    public ResponseEntity<List<PlayerResponse>> getPlayersPaginated(
            @RequestParam(name = "page", defaultValue = "0") int page,
            @RequestParam(name = "size", defaultValue = "10") int size,
            @RequestParam(name = "isAdmin", defaultValue = "false") boolean isAdmin) {

        List<Player> allPlayers = service.getAllPlayers();
        List<PlayerResponse> response = new ArrayList<>();

        // Calculate start and end indices
        int start = page * size;
        int end = Math.min(start + size, allPlayers.size());

        // Check if page is out of bounds
        if (start >= allPlayers.size()) {
            return ResponseEntity.ok(new ArrayList<>());
        }

        // Extract the page subset
        List<Player> pageData = allPlayers.subList(start, end);

        for (Player p : pageData) {
            String lastName = null;
            if (isAdmin) {
                lastName = p.getLastName();
            }
            response.add(new PlayerResponse(p.getFirstName(), lastName));
        }

        return ResponseEntity.ok(response);
    }

}
