package U7T1;
import java.util.ArrayList;
import java.util.Arrays;

public class AnotherRunner {
    public static void main(String[] args) {
        Car[] carsArray = {new Car("model1", 24), new Car("model2", 3536), new Car("model3", 333)};
        ArrayList<Car> carList = new ArrayList<Car>(Arrays.asList(carsArray));
        System.out.println(carList);
    }
}
