public class Main {
    public static void main(String[] args) {
        java.util.Random random = new java.util.Random();
        int[] arr = new int [30];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
            sum += arr[i];
            System.out.println("Сумма за месяц" + sum + " рублей");
        }
        int maxMany = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >maxMany) {
                maxMany=arr[i];
                System.out.println("Макс сумма в месяц "+ maxMany);
            }
        }
        int minMany= 1;
        for (int i = 0; i < arr.length; i--) {
            if (arr[i]> minMany){
                minMany=arr[i];
                System.out.println("Мин "+ minMany);
            }

        }
        }
            }