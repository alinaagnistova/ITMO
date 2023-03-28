package ru.itmo.lab2;


import ru.itmo.lab2.pokemons.*;
import ru.ifmo.se.pokemon.Battle;

public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();
        Togedemaru togedemaru = new Togedemaru("Владимир", 1);
        Swadloon swadloon = new Swadloon("Агафья", 1);
        Surskit surskit = new Surskit("Есения", 1);
        Sewaddle sewaddle = new Sewaddle("Радомир", 1);
        Masquerain masquerain = new Masquerain("Добрыня", 1);
        Leavanny leavanny = new Leavanny("Кристель", 1);

        b.addAlly(togedemaru);
        b.addAlly(swadloon);
        b.addAlly(surskit);
        b.addFoe(sewaddle);
        b.addFoe(masquerain);
        b.addFoe(leavanny);
        b.go();
    }
}


