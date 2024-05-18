public class Main {
    public static void main(String[] args) {
        int[] meaning = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        evenParity(meaning);
    }


    public static int evenParity(int[] numbers) {

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.println("Число " + numbers[i] + " четное!");
            } else {
                System.out.println("Число " + numbers[i] + " нечетное!");
            }
        }
        return 0;
    }

}