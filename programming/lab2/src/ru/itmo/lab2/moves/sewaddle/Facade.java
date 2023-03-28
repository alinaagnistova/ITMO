package ru.itmo.lab2.moves.sewaddle;

import ru.ifmo.se.pokemon.*;

public class Facade extends PhysicalMove {
    public Facade(double pow, double acc) {
        super(Type.NORMAL, pow, acc);
    }
    @Override
    protected void applyOppDamage(Pokemon def, double damage) {
        Status PokemonCondition = def.getCondition();
        if (PokemonCondition.equals(Status.BURN) || PokemonCondition.equals(Status.PARALYZE) || PokemonCondition.equals(Status.POISON)) {
            def.setMod(Stat.HP, (int) Math.round(damage) * 2);
        }
    }

    @Override
    protected String describe(){
        String[] pieces = this.getClass().toString().split("\\.");
        return "применил " + pieces[pieces.length-1];
    }
}

