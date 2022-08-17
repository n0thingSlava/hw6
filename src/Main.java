public class Main {
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;

    }

    //Задание 1
    public static void main(String[] args) {
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("сумма трат за месяц " + sum + " рублей");
        //Задача №2
        int min = arr[0];
        int max = arr.length-1;
        for (int i = 0; i < sum; i++) {
            if (arr[0] > min) ;
        }
        System.out.println("Минимальная сумма трат за день составила  " + min + "рублей");
        for (int i = 0; i < sum; i++) {
            if (arr[29] < max) ;
        }
        System.out.println("Максимальная сумма трат за день составила" + max + " рублей");
        //Задача №3
        double arrTwo = sum;
        System.out.println("Средняя сумма трат за месяц составила" + arrTwo / arr.length);
        //Задача №4
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        int length = 0;
        for (int element : reverseFullName) {
            length++;
        }
        for (int i = length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}