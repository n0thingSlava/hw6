import java.util.Arrays;

public class Main {
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }
    //Задание 1
    public static void main(String[] args) {
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int i = 0; i < arr.length-1; i++) {
            sum += arr[i];
        }
        System.out.println("сумма трат за месяц " + sum + " рублей");
        //Задача №2
        int min = 0;
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] < arr[i + 1]) {
                min = min + arr[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила  " + min + "рублей");
        int max = 0;
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] > arr[i+1]) ;
            max=max+arr[i];
        }
        System.out.println("Максимальная сумма трат за день составила" + max + " рублей");
        //Задача №3
        double arrTwo = sum;
        System.out.println("Средняя сумма трат за месяц составила" + arrTwo / arr.length);
        //Задача №4
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        int length = 0;
        for (int i = length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}