import java.util.Random;

public class RandomNumbers {
    public static int getCountOfRandomNumberuntill500(int max) {
        Random random = new Random();
        int result = 0;
        int sum = 0;
        int biggest = 0;
        int min = 30;
        while (sum < max) {
            int temp = random.nextInt(30);
            sum = sum + temp;

            if (temp > biggest) {
                biggest = temp;
            }
            if (temp < min) {
                min = temp;
            }
            result++;
        }
        return (result);
    }

    public static void main(String[] args) {
        int result = getCountOfRandomNumberuntill500(500);
        System.out.println(result);
    }
}