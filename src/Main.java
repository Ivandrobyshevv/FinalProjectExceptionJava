import controller.Controller;
import controller.IController;

public class Main {
    public static void main(String[] args) {
        IController controller = new Controller();
        controller.run();
    }
}