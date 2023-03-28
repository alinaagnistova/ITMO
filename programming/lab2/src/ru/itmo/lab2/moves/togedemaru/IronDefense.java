package ru.itmo.lab2.moves.togedemaru;

import ru.ifmo.se.pokemon.*;

    public class IronDefense extends StatusMove {
        public IronDefense(double pow, double acc) { super(Type.STEEL, pow, acc); }

        @Override
        protected void applySelfEffects(Pokemon p){
            super.applySelfEffects(p);
            Effect EffectObject = new Effect().stat(Stat.DEFENSE, 2);
            p.addEffect(EffectObject);

        }
        @Override
        protected String describe(){
            String[] pieces = this.getClass().toString().split("\\.");
            return "применил " + pieces[pieces.length-1];
        }
    }


