public class Main {
    public static void main(String[] args) {
        //Task 1
        System.out.println("Задача 1");
        int[] arr = new int[5];
        arr[0] = 1000;
        arr[1] = 1500;
        arr[2] = 2000;
        arr[3] = 1000;
        arr[4] = 1500;
        int sum = 0;
        for (int element : arr) {
            sum = sum + element;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей.");
        System.out.println();

        //Task 2
        System.out.println("Задача 2");
        int[] arrayMinAndMax = new int[5];
        arrayMinAndMax[0] = 12000;
        arrayMinAndMax[1] = 15000;
        arrayMinAndMax[2] = 10000;
        arrayMinAndMax[3] = 11000;
        arrayMinAndMax[4] = 13000;
        int min = arrayMinAndMax[0];
        for (int element : arrayMinAndMax) {
            if (element < min) {
                min = element;
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + min + " рублей.");
        int max = arrayMinAndMax[0];
        for (int element: arrayMinAndMax) {
            if (element > max) {
                max = element;
            }
        }
        System.out.println("Максимальная сумма трат за неделю составила " + max + " рублей.");
        System.out.println();

        //Task 3
        System.out.println("Задача 3");
        int[] arrayAverage = new int[5];
        arrayAverage[0] = 12000;
        arrayAverage[1] = 13000;
        arrayAverage[2] = 10000;
        arrayAverage[3] = 9000;
        arrayAverage[4] = 15000;
        float average;
        float total = 0f;
        for (int element : arrayAverage) {
            total = total + element;
        }
        average = total / arrayAverage.length;
        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей.");
        System.out.println();

        //Task 4
        System.out.println("Задача 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
        System.out.println();


    }
}