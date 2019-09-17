import java.util.ArrayList;
import java.util.List;

public class Hippodrome {
    public static void main(String[] args) throws InterruptedException {
        game = new Hippodrome(new ArrayList<>());
        game.horses.add(new Horse("Sony", 3.0, 0.0));
        game.horses.add(new Horse("Omka", 3.0, 0.0));
        game.horses.add(new Horse("Gnom", 3.0, 0.0));
        game.run();
    }

    private List<Horse> horses;
    static Hippodrome game;
    public void move(){
        for (int i = 0; i <horses.size() ; i++) {
            Horse horse = horses.get(i);
            horse.move();
        }

    }
    public void print(){
        for (int i = 0; i <horses.size() ; i++) {
            Horse horse = horses.get(i);
            horse.print();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println();
        }

    }
    public void run() throws InterruptedException {
        for (int i = 0; i < 100 ; i++) {
            move();
            print();
            Thread.sleep(200);

        }
    }

    public Hippodrome(List<Horse> horses) {
        this.horses = horses;
    }

    public List<Horse> getHorses() {
        return horses;
    }
}
