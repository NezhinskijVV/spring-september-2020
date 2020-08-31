
public class Programmer {
    private Computer computer;

    public Programmer(Computer computer) {
        this.computer = computer;
    }

    public Programmer() {
        System.out.println("Programmer empty constructor");
    }


    public void setComputer(Computer computer) {
        System.out.println("Setter");
        this.computer = computer;
    }

    public String helloWorld() {
        return computer.getBrand() + ": 'Hello world!'";
    }
}