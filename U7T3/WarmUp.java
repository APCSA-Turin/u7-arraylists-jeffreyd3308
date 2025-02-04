package U7T3;
import java.util.ArrayList;

public class WarmUp {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<String>();        
        words.add("candle");
        words.add("dandelion");
        words.add("eagle");
        words.add("garage");
        words.add("hamburger");
        words.add("imitate");
        words.add("jello");

        for (int i = 0; i < words.size(); i++) {
            if (words.get(i).substring(0, 1).equals("h")) {
                break;
            }
            System.out.println(words.get(i));
        }
    }
}
