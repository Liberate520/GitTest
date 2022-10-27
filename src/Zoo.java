import java.util.List;
import java.util.Random;

public class Zoo extends Thread{
    List<Speakable> list;

    public Zoo(List<Speakable> list) {
        this.list = list;
    }

    @Override
    public void run() {

        while (true){
            Random random = new Random();
            Speakable speakable = list.get(random.nextInt(list.size()));
            speakable.speak();
        }
    }
}
