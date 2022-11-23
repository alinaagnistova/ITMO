package ru.itmo.lab2.moves.surskit;

import ru.itmo.lab2.utils.CustomUtils;
import ru.ifmo.se.pokemon.*;

public class IceBeam extends SpecialMove {
    public IceBeam(double pow, double acc) { super(Type.ICE, pow, acc); }

    @Override
    protected void applyOppEffects(Pokemon p) {
        super.applyOppEffects(p);
        if (CustomUtils.chance(0.1)) {
            Effect.freeze(p);
        }
    }
    @Override
    protected String describe(){
        String[] pieces = this.getClass().toString().split("\\.");
        return "применил " + pieces[pieces.length-1];
    }
}


