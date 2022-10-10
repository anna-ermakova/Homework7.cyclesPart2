public class Main {
    public static void main(String[] args) {

        //Домашнее задание 3

        //Задание 1
        //Мы решили написать астрономическое приложение, которое считает, когда над Землей пролетают кометы и
        // их можно будет увидеть. Для начала нам нужно посчитать траекторию движения кометы, которая пролетает рядом
        // с Землей каждый 79-й год, начиная с нулевого.
        //Нам нужно узнать, в каких годах комета пролетала рядом с Землей за последние 200 лет и когда мы увидим ее в следующий раз.
        //Условия задачи:
        //В консоль нужно вывести все годы за последние 200 лет, когда появлялась комета, а также следующий год ее появления.
        //Для вычисления периода можно создать две дополнительные переменные, которые содержат год за 200 лет
        // до текущего (из созданной ранее переменной) в качестве старта и 100 лет после в качестве завершения периода расчета.
        //В результате решения задачи в консоль должен вывестись следующий результат:
        //1896
        //1975
        //2054
        System.out.println("Задание 3.1.");
        int year = 2022;
        int lastYear = year - 200;
        int futureYear = year + 100;
        for (int i = lastYear; i < futureYear; ++i) {
            if (i % 79 == 0) {
                System.out.println(i);
            }
        }
        }
    }
