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

        // Разделитель
        System.out.println();

        // Задача 3

        // Вариант 1
        //float average = (float) summary / arr.length;

        // Вариант 2
        int total = 0;

        for (final int current : arr)
            total += current;

        float average = (float) total / arr.length;

        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей");

        // Разделитель
        System.out.println();

        // Задача 4
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        for (int idx = reverseFullName.length-1; idx >= 0; idx--)
            System.out.print(reverseFullName[idx]);

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