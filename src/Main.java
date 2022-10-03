public class Main {
    public static void main(String[] args) {
        // Циклы. Часть 1. Домашнее задание 3. Задание 2
        System.out.println("Циклы. Часть 1. Домашнее задание 3. Задание 2");
        int salary = 29000;
        int total = 0;
        for (int i = 1; i < 12; i = i + 1) {
            total = total + total/100;
            total = total + salary;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }
    }
}