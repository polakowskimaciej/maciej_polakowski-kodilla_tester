import java.util.Random;

public class RandomNumbers {
    public int getCountOfRandomNumberuntill500(int max) {
        Random random = new Random();
        int result = 0;
        int sum = 0;
        while (sum < max) {
            int temp = random.nextInt(30);
            sum = sum + temp;
            result++;
        }
        return (result);
    }

    private int getSmallest() {
        int counted = getCountOfRandomNumberuntill500(500);
        for (int i = 0; i < counted; i++) {
            int min = counted(0);
            if (counted[i] < min) {
                min = counted[i];
            }
            return min;
        }
    }

    private int getBiggest() {
        int counted = getCountOfRandomNumberuntill500(500);
        for (int i = 0; i < counted; i++) {
            int max = counted(i);
            if (counted[i] > max) {
                max = counted[i];
            }
            return max;
        }
    }

    public static void main(String[] args) {
        int result = getCountOfRandomNumberuntill500(500);
        System.out.println(result);
    }
}