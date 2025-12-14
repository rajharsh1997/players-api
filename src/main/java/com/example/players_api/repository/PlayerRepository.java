package com.example.players_api.repository;

import com.example.players_api.model.Player;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public class PlayerRepository {
    public List<Player> findAll() {
        return Arrays.asList(
                new Player(1L, "Sachin", "Ten"),
                new Player(2L, "Hamza", "Mir"),
                new Player(3L, "Cristiano", "Ronaldo"),
                new Player(4L, "Lionel", "Messi"),
                new Player(5L, "Neymar", "Jr"),
                new Player(6L, "Kylian", "Mbappé"),
                new Player(7L, "Erling", "Haaland"),
                new Player(8L, "Vinícius", "Júnior"),
                new Player(9L, "Jude", "Bellingham"),
                new Player(10L, "Phil", "Foden"),
                new Player(11L, "Harry", "Kane"),
                new Player(12L, "Sergio", "Agüero"),
                new Player(13L, "Neymar", "Santos"),
                new Player(14L, "Karim", "Benzema"),
                new Player(15L, "Robert", "Lewandowski"),
                new Player(16L, "Luka", "Modrić"),
                new Player(17L, "Toni", "Kroos"),
                new Player(18L, "Casemiro", "Silva"),
                new Player(19L, "Sergio", "Busquets"),
                new Player(20L, "Xavi", "Hernández"),
                new Player(21L, "Andrés", "Iniesta"),
                new Player(22L, "David", "Beckham"),
                new Player(23L, "Wayne", "Rooney"),
                new Player(24L, "Paul", "Scholes"),
                new Player(25L, "Roy", "Keane"),
                new Player(26L, "Zinedine", "Zidane"),
                new Player(27L, "Ronaldinho", "Gaúcho"),
                new Player(28L, "Pelé", "Silva"),
                new Player(29L, "Diego", "Maradona"),
                new Player(30L, "Johan", "Cruyff"),
                new Player(31L, "Franz", "Beckenbauer"),
                new Player(32L, "Pelé", "dos Santos"),
                new Player(33L, "Gerd", "Müller"),
                new Player(34L, "Eusébio", "Silva"),
                new Player(35L, "Gianni", "Rivera"),
                new Player(36L, "Luis", "Suárez"),
                new Player(37L, "Alexis", "Sánchez"),
                new Player(38L, "Arturo", "Vidal"),
                new Player(39L, "Charles", "Aránguiz"),
                new Player(40L, "Jean", "Beausejour"),
                new Player(41L, "Claudio", "Bravo"),
                new Player(42L, "Mauricio", "Isla"),
                new Player(43L, "Marcelo", "Bielsa"),
                new Player(44L, "Ricardo", "Gareca"),
                new Player(45L, "Jorge", "Sampaoli"),
                new Player(46L, "Tata", "Martino"),
                new Player(47L, "Juan", "Pizzi"),
                new Player(48L, "Fabio", "Cannavaro"),
                new Player(49L, "Andriy", "Shevchenko"),
                new Player(50L, "Thiago", "Silva"),
                new Player(51L, "Sergio", "Ramos"),
                new Player(52L, "Piqué", "Bernabéu"));
    }
}
