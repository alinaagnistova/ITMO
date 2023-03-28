package ru.itmo.lab2.pokemons;

import ru.itmo.lab2.moves.surskit.IceBeam;
import ru.itmo.lab2.moves.surskit.QuickAttack;
import ru.itmo.lab2.moves.surskit.Rest;
import ru.ifmo.se.pokemon.*;


public class Surskit extends Pokemon {

    public Surskit(String name, int level) {
        super(name, level);
        super.setType(Type.BUG, Type.WATER);
        super.setStats(40, 30, 32, 50, 52, 65);
        IceBeam iceBeam = new IceBeam(90, 100);
        Rest rest = new Rest(0,0);
        QuickAttack quickAttack = new QuickAttack(40, 100, 1, 1);
        super.setMove(iceBeam, rest, quickAttack);

    }
}


