import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Speakable> speakables = new ArrayList<>();
        speakables.add(new Cat());
        speakables.add(new Dog());
        Zoo zoo = new Zoo(speakables);
        zoo.start();
    }
}
