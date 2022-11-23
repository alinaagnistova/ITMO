package ru.itmo.lab2.pokemons;

import ru.itmo.lab2.moves.masquerain.StunSpore;
import ru.itmo.lab2.moves.surskit.IceBeam;
import ru.itmo.lab2.moves.surskit.QuickAttack;
import ru.itmo.lab2.moves.surskit.Rest;
import ru.ifmo.se.pokemon.Type;

public class Masquerain extends Surskit{
    public Masquerain(String name, int level) {
        super(name, level);
        super.setType(Type.BUG, Type.WATER);
        super.setStats(70, 60, 62, 100, 82, 80);
        IceBeam iceBeam = new IceBeam(90, 100);
        Rest rest = new Rest(0,0);
        StunSpore stunSpore = new StunSpore(0,75);
        QuickAttack quickAttack = new QuickAttack(40, 100, 1, 1);
        super.setMove(iceBeam, rest, stunSpore, quickAttack);

    }
}
