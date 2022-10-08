public class Main {
    public static void main(String[] args) {

        //Циклы. часть 2

        //task1
        //С помощью цикла while посчитайте, сколько месяцев потребуется, чтобы накопить 2 459 000 рублей при условии,
        // что первоначально мы имеем 0 рублей и готовы откладывать по 15 тысяч рублей.
        System.out.println("Задание 1.");
        int amount=15_000;
        int total=0;
        int i=0;
        while (total <=2_459_000) {
            total = total + total / 100;
            total = total + amount;
            total++;
            i++;
            System.out.println("Месяц " + i + " , сумма накоплений равна " + total + " рублей.");
        }
        }
    }
