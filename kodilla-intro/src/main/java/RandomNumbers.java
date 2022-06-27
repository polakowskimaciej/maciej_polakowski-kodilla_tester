import java.util.Random;

public class RandomNumbers {
    public static int getCountOfRandomNumberuntill500(int max) {
        Random random = new Random();
        int result = 0;
        int sum = 0;
        while (sum < max) {
            int temp = random.nextInt(30);
            sum = sum + temp;
            int biggest = 0;
            if (temp > biggest) {
                biggest = temp;
                return (biggest);
            }
            int min = 0;
            if (temp < min) {
                min = temp;
                return (min);
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