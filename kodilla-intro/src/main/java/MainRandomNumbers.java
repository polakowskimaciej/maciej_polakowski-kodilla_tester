public class MainRandomNumbers {
    public static void main(String[] args) {
        RandomNumbers a = new RandomNumbers();
        int result = a.getCountOfRandomNumberuntill500(500);
        System.out.println(result);
        a.getBiggest();
        System.out.println(a.biggest);
        a.getMin();
        System.out.println(a.min);
    }
}
