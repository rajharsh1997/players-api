package com.example.players_api.controller;

import com.example.players_api.dto.PlayerResponse;
import com.example.players_api.model.Player;
import com.example.players_api.service.PlayerService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class PlayerControllerTest {

    @Mock
    private PlayerService playerService;

    @InjectMocks
    private PlayerController playerController;

    private List<Player> mockPlayers;

    @BeforeEach
    void setUp() {
        mockPlayers = new ArrayList<>();
        mockPlayers.add(new Player(1L, "Ronaldo", "Cristiano"));
        mockPlayers.add(new Player(2L, "Messi", "Lionel"));
        mockPlayers.add(new Player(3L, "Neymar", "Jr"));
    }

    @Test
    void testGetPlayersWithEmptyList() {
        when(playerService.getAllPlayers()).thenReturn(new ArrayList<>());

        ResponseEntity<List<PlayerResponse>> response = playerController.getPlayers(true);

        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertNotNull(response.getBody());
        assertTrue(response.getBody().isEmpty());
    }

    @Test
    void testGetPlayersDefaultParameter_ShouldReturnNonAdminView() {
        when(playerService.getAllPlayers()).thenReturn(mockPlayers);

        ResponseEntity<List<PlayerResponse>> response = playerController.getPlayers(false);

        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertNotNull(response.getBody());
        assertEquals(3, response.getBody().size());

        for (PlayerResponse player : response.getBody()) {
            assertNotNull(player.getFirstName());
            assertNull(player.getLastName());
        }
    }

    @Test
    void testGetPlayersResponseStructure() {
        when(playerService.getAllPlayers()).thenReturn(mockPlayers);

        ResponseEntity<List<PlayerResponse>> response = playerController.getPlayers(true);

        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertNotNull(response.getBody());

        for (PlayerResponse player : response.getBody()) {
            assertNotNull(player.getFirstName());
            assertNotNull(player.getLastName());
        }
    }
}
