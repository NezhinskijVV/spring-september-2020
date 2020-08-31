import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

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

        Assertions.assertNotNull(programmer);
    }
}
