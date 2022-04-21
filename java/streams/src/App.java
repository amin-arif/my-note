import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class App {
    public static Fruit[] fruits = {
        new Fruit("Apple", 1),
        new Fruit("Banana", 1.5),
        new Fruit("Mango", 2)
    };

    public static void main(String[] args) throws Exception {
        List<Fruit> fruitList = Arrays.asList(fruits);

        System.out.println(Stream.of(fruits[0]));
    }
}
