package ru.itmo.lab2.pokemons;

import ru.itmo.lab2.moves.sewaddle.DoubleTeam;
import ru.itmo.lab2.moves.sewaddle.Facade;
import ru.ifmo.se.pokemon.*;

public class Sewaddle extends Pokemon {
    public Sewaddle(String name, int level){
        super(name, level);
        super.setType(Type.BUG, Type.GRASS);
        super.setStats(45, 53, 70, 40, 60, 42);
        Facade facade = new Facade(70, 100);
        DoubleTeam doubleTeam = new DoubleTeam(0,0);
        super.setMove(facade, doubleTeam);



    }
}
