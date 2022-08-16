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
        int arr1 = 0;
        for (int i = 0; i < arr.length; i++) {
            arr1 = arr1 + arr[i];
        }
        System.out.println("сумма трат за месяц " + arr1 + " рублей");
        //Задача №2
        int min = arr[0];
        int max = arr[29];
        for (int i = 0; i < arr1; i++) {
            if (arr[0] > min) ;
        }
        System.out.println("Минимальная сумма трат за день составила  " + min + "рублей");
        for (int i = 0; i < arr1; i++) {
            if (arr[29] < max) ;
        }
        System.out.println("Максимальная сумма трат за день составила" + max + " рублей");
        //Задача №3
        double arrTwo = arr1;
        System.out.println("Средняя сумма трат за месяц составила" + arrTwo / arr.length);
        //Задача №4
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        int[] temp = new int[reverseFullName.length];
        for (int i = 0; i < reverseFullName.length/2; i++) {
            temp[reverseFullName.length - 1 - i] = reverseFullName[i];
            System.out.print(temp);
        }
    }

            
        }


