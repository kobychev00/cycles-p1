public class Main {
    public static void main(String[] args) {
        //  Задача 1
        System.out.println("Задача 1");
        for (int i = 0; i < 10; i++) {
            System.out.println("Итерация цикла" + i);
        }
        //  Задача 2
        System.out.println("Задача 2");
        for (int i = 10; i > 0; i = i - 1) {
            System.out.println("Итерация цикла" + i);
        }
        //  Задача 3
        System.out.println("Задача 3");
        for (int i = 0; i < 17; i = i + 2) {
            System.out.println("Итерация цикла" + i);
        }
        //  Задача 4
        System.out.println("Задача 4");
        for (int i = 10; i > -10; i = i - 1) {
            System.out.println("Итерация цикла" + i);
        }
        //  Задача 5
        System.out.println("Задача 5");
        for (int i = 1904; i < 2097; i = i + 4) {
            System.out.println("Итерация цикла" + i);
        }
        //  Задача 6
        System.out.println("Задача 6");
        for (int i = 7; i < 99; i = i + 7) {
            System.out.println("Итерация цикла" + i);
        }
        //  Задача 7
        System.out.println("Задача 7");
        for (int i = 2; i < 513; i = i * 2) {
            System.out.println("Итерация цикла" + i);
        }
        //  урок 1.3
        System.out.println("урок 1.3");
        int salary = 65535;
        int total = 0;
        for (int i = 0; i < 13; i++) {
            total = total + total / 100;
            total = total + salary;
            System.out.println("Месяц " + i + " Итого " + total);
        }
        System.out.println(total);

        //  задача 8
        System.out.println("задача 8");
        int contribution = 29000;
        int total1 = 0;
        for (int i = 0; i < 13; i++) {
            total1 = total1 + contribution;
            System.out.println("Месяц " + i + " cумма накоплений равна " + total1);
        }
        //  задача 9
        System.out.println("задача 9");
        System.out.println("урок 1.3");
        int contribution1 = 29000;
        int total2 = 0;
        for (int i = 0; i < 13; i++) {
            total2 = total2 + total2 / 100;
            total2 = total2 + contribution1;
            System.out.println("Месяц " + i + " Итого " + total2);
        }
    }
}
