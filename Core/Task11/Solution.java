
import java.util.Date;

/* 
Поговорим о музыке
 */
public class Solution {

    public static int delay = 1000;

    public static void main(String[] args) {
        Thread violin = new Thread(new Violin("Player"));
        violin.start();
    }

    public static void sleepNSeconds(int n) {
        try {
            Thread.sleep(n * delay);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public interface MusicalInstrument extends Runnable {

        Date startPlaying();

        Date stopPlaying();
    }

    public static class Violin implements MusicalInstrument {

        private final String owner;

        @Override
        public void run() {
            Date start = startPlaying();
            sleepNSeconds(1);
            Date stop = stopPlaying();
            Date delta = new Date(stop.getTime() - start.getTime());
            // delta in miliseconds
            System.out.println("Playing " + delta.getTime() + " ms");
        }

        public Violin(String owner) {
            this.owner = owner;
        }

        @Override
        public Date startPlaying() {
            System.out.println(this.owner + " is starting to play");
            return new Date();
        }

        @Override
        public Date stopPlaying() {
            System.out.println(this.owner + " is stopping playing");
            return new Date();
        }
    }
}
