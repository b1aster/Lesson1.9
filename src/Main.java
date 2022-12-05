public class Main {
    public static void main(String[] args) {

        int[] arr = generateRandomArray();

        // Задача 1
        int summary = 0;

        for (final int current : arr)
            summary += current;

        System.out.println("Сумма трат за месяц составила " + summary + " рублей");

        // Разделитель
        System.out.println();

        // Задача 2
        int min = arr[0];
        int max = arr[0];

        for (final int current : arr) {
            min = (min < current) ? min : current;
            max = (max > current) ? max : current;
        }

        System.out.println("Минимальная сумма трат за день составила " + min + " рублей. Максимальная сумма трат за день составила " + max + " рублей");
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