package com.example.players_api.repository;

import com.example.players_api.model.Player;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PlayerRepository {
    public List<Player> findAll() {
        List<Player> players = new ArrayList<>();

        players.add(new Player(1, "Sachin", "Ten"));
        players.add(new Player(2, "Hamza", "Mir"));
        players.add(new Player(3, "Cristiano", "Ronaldo"));
        players.add(new Player(4, "Lionel", "Messi"));
        players.add(new Player(5, "Neymar", "Jr"));
        players.add(new Player(6, "Kylian", "Mbappé"));
        players.add(new Player(7, "Erling", "Haaland"));
        players.add(new Player(8, "Vinícius", "Júnior"));
        players.add(new Player(9, "Jude", "Bellingham"));
        players.add(new Player(10, "Phil", "Foden"));
        players.add(new Player(11, "Harry", "Kane"));
        players.add(new Player(12, "Sergio", "Agüero"));
        players.add(new Player(13, "Neymar", "Santos"));
        players.add(new Player(14, "Karim", "Benzema"));
        players.add(new Player(15, "Robert", "Lewandowski"));
        players.add(new Player(16, "Luka", "Modrić"));
        players.add(new Player(17, "Toni", "Kroos"));
        players.add(new Player(18, "Casemiro", "Silva"));
        players.add(new Player(19, "Sergio", "Busquets"));
        players.add(new Player(20, "Xavi", "Hernández"));
        players.add(new Player(21, "Andrés", "Iniesta"));
        players.add(new Player(22, "David", "Beckham"));
        players.add(new Player(23, "Wayne", "Rooney"));
        players.add(new Player(24, "Paul", "Scholes"));
        players.add(new Player(25, "Roy", "Keane"));
        players.add(new Player(26, "Zinedine", "Zidane"));
        players.add(new Player(27, "Ronaldinho", "Gaúcho"));
        players.add(new Player(28, "Pelé", "Silva"));
        players.add(new Player(29, "Diego", "Maradona"));
        players.add(new Player(30, "Johan", "Cruyff"));
        players.add(new Player(31, "Franz", "Beckenbauer"));
        players.add(new Player(32, "Pelé", "dos Santos"));
        players.add(new Player(33, "Gerd", "Müller"));
        players.add(new Player(34, "Eusébio", "Silva"));
        players.add(new Player(35, "Gianni", "Rivera"));
        players.add(new Player(36, "Luis", "Suárez"));
        players.add(new Player(37, "Alexis", "Sánchez"));
        players.add(new Player(38, "Arturo", "Vidal"));
        players.add(new Player(39, "Charles", "Aránguiz"));
        players.add(new Player(40, "Jean", "Beausejour"));
        players.add(new Player(41, "Claudio", "Bravo"));
        players.add(new Player(42, "Mauricio", "Isla"));
        players.add(new Player(43, "Marcelo", "Bielsa"));
        players.add(new Player(44, "Ricardo", "Gareca"));
        players.add(new Player(45, "Jorge", "Sampaoli"));
        players.add(new Player(46, "Tata", "Martino"));
        players.add(new Player(47, "Juan", "Pizzi"));
        players.add(new Player(48, "Fabio", "Cannavaro"));
        players.add(new Player(49, "Andriy", "Shevchenko"));
        players.add(new Player(50, "Thiago", "Silva"));
        players.add(new Player(51, "Sergio", "Ramos"));
        players.add(new Player(52, "Piqué", "Bernabéu"));

        return players;
    }
}
