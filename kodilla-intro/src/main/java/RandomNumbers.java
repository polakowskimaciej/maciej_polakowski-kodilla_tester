import java.util.Random;

public class RandomNumbers {
    int min = 30;
    int biggest = 0;

    int[] temps = new int[1000000];

    public int getCountOfRandomNumberuntill500(int max) {
        int result = 0;
        int sum = 0;
        Random random = new Random();
        while (sum < max) {
            int temp = random.nextInt(this.min) + 1;
            temps[result] = temp;
            System.out.println(temp);
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

    public int getBiggest() {
        return (biggest);
    }

    public int getMin() {
        return (min);
    }
}