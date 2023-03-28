package ru.itmo.lab3.interfaces;

import ru.itmo.lab3.error.IncorrectBodyException;

public interface Seeable {
    void see() throws IncorrectBodyException;
}
