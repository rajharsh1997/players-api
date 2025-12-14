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

/**
 * Unit tests for PlayerController
 * Tests are organized using the Given-When-Then pattern for clarity
 */
@ExtendWith(MockitoExtension.class)
public class PlayerControllerTest {

    @Mock
    private PlayerService playerService;

    @InjectMocks
    private PlayerController playerController;

    private List<Player> mockPlayers;

    /**
     * Setup method to initialize test data before each test
     */
    @BeforeEach
    void setUp() {
        // Given: A list of mock players
        mockPlayers = new ArrayList<>();
        mockPlayers.add(new Player(1, "Ronaldo", "Cristiano"));
        mockPlayers.add(new Player(2, "Messi", "Lionel"));
        mockPlayers.add(new Player(3, "Neymar", "Jr"));
    }

    /**
     * Test: Given empty player list, When getPlayers called, Then return empty list
     * with OK status
     */
    @Test
    void givenEmptyPlayerList_whenGetPlayersIsCalled_thenReturnEmptyListWithOkStatus() {
        // Given: Service returns empty list
        when(playerService.getAllPlayers()).thenReturn(new ArrayList<>());

        // When: getPlayers is called with isAdmin=true
        ResponseEntity<List<PlayerResponse>> response = playerController.getPlayers(true);

        // Then: Verify response is OK and body is empty
        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertNotNull(response.getBody());
        assertTrue(response.getBody().isEmpty());
    }

    /**
     * Test: Given non-admin user, When getPlayers called, Then return players
     * without last names
     */
    @Test
    void givenNonAdminUser_whenGetPlayersIsCalled_thenReturnPlayersWithoutLastNames() {
        // Given: Service returns 3 mock players
        when(playerService.getAllPlayers()).thenReturn(mockPlayers);

        // When: getPlayers is called with isAdmin=false
        ResponseEntity<List<PlayerResponse>> response = playerController.getPlayers(false);

        // Then: Verify response contains 3 players with first names only
        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertNotNull(response.getBody());
        assertEquals(3, response.getBody().size());

        // Verify all players have first name but no last name
        for (PlayerResponse player : response.getBody()) {
            assertNotNull(player.getFirstName());
            assertNull(player.getLastName());
        }
    }

    /**
     * Test: Given admin user, When getPlayers called, Then return complete player
     * details
     */
    @Test
    void givenAdminUser_whenGetPlayersIsCalled_thenReturnCompletePlayerDetails() {
        // Given: Service returns 3 mock players
        when(playerService.getAllPlayers()).thenReturn(mockPlayers);

        // When: getPlayers is called with isAdmin=true
        ResponseEntity<List<PlayerResponse>> response = playerController.getPlayers(true);

        // Then: Verify response contains 3 players with both first and last names
        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertNotNull(response.getBody());

        // Verify all players have both first and last names
        for (PlayerResponse player : response.getBody()) {
            assertNotNull(player.getFirstName());
            assertNotNull(player.getLastName());
        }
    }
}
