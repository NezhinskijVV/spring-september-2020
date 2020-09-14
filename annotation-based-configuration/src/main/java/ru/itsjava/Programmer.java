package ru.itsjava;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Data
@Service
public class Programmer {
    private final Computer computer;

    @Autowired
    public Programmer(@Qualifier("myComp2") Computer computer) {
        this.computer = computer;
    }

    public String helloWorld() {
        return computer.getBrand() + ": 'Hello world!'";
    }
}