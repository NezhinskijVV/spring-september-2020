import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import ru.itsjava.Computer;
import ru.itsjava.Programmer;

@DisplayName("Класс Programmer должен:")
public class ProgrammerTest {


    @DisplayName(" корректно работает метод hello world")
    @Test
    public void shouldCorrectWorkingMethodHelloWorld() {
        Computer computer = Mockito.mock(Computer.class);
        Programmer programmer = new Programmer(computer);
    }


    @DisplayName(" корректно работает конструктор")
    @Test
    public void shouldCorrectConstructor() {
        Computer computer = Mockito.mock(Computer.class);
        Programmer programmer = new Programmer(computer);

        Mockito.when(computer.getBrand()).thenReturn("Apple");
        System.out.println(computer.getBrand());
        Assertions.assertNotNull(programmer);
    }
}
