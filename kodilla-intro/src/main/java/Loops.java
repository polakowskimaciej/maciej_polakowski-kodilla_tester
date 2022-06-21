public class Loops {
    public static void main(String args[]) {
        int[] numbers = new int[4];
        numbers[0] = 10;
        numbers[1] = 10;
        numbers[2] = 20;
        numbers[3] = 20;
        sumNumbers(numbers);
    }

    private static int sumNumbers(int[] numbers2) {
        int result = 0;
        for (int i = 0; i < numbers2.length; i++) {
            result = result + numbers2[i];
        }
        System.out.print(result);
        return result;
    }
}
