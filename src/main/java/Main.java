import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();

        for (int r : new Randoms(random,90, 100)) {
            System.out.println("Случайное число: " + r);
            if (r == 100) {
                System.out.println("Выпало число 100, давайте на этом закончим");
                break;
            }
        }
    }
}
