package ru.itsjava;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Programmer {
    private final Computer computer;

    public String helloWorld() {
        return computer.getBrand() + ": 'Hello world!'";
    }
}