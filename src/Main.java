public class Main {
    public static void main(String[] args) {

        int[] arr = generateRandomArray();


        // Задача 1
        int summary = 0;

        for (final int current : arr)
            summary += current;

        System.out.println("Сумма трат за месяц составила " + summary + " рублей");

    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}