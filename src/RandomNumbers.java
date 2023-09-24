import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println(random.nextInt(6) + 1);
        System.out.println(random.nextInt());
        System.out.println(random.nextDouble());
        System.out.println(random.nextBoolean());

    }
}
