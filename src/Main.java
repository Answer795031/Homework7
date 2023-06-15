import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("Задача 1");

        /*
        С помощью цикла while посчитайте, сколько месяцев потребуется, чтобы накопить 2 459 000 рублей при условии,
        что первоначально мы имеем 0 рублей и готовы откладывать по 15 тысяч рублей.

        Результат программы должен быть выведен в консоль с тем количеством месяцев, которое необходимо для накопления данной суммы.
        Формат сообщения: «Месяц …, сумма накоплений равна … рублей» .
         */

        int salary = 15000;
        int total = 0;
        int month = 0;

        while (total <= 2459000) {
            total += salary;
            month += 1;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
        }

        System.out.println("Для того чтобы накопить 2459000 рублей необходимо " + month + " месяцев\n");
    }

    public static void task2() {
        System.out.println("Задача 2");

        /*
        Выведите в одну строку через пробел числа от 1 до 10 с помощью цикла while.

        На следующей строке выведите числа в обратном порядке от 10 до 1 с помощью цикла for.

        Для обоих циклов можно использовать как одну общую переменную, так и в каждом цикле свою.

        Не забудьте выполнить переход на новую строку между двумя циклами.

        В результате программы вывод должен получиться следующий:

        1 2 3 4 5 6 7 8 9 10

        10 9 8 7 6 5 4 3 2 1
         */

        int counter = 1;
        while (counter <= 10) {
            System.out.print(counter + " ");
            counter += 1;
        }
        System.out.println("");

        for (counter = 10; counter >= 1; counter--) {
            System.out.print(counter + " ");
        }
        System.out.println(" \n");

    }

    public static void task3() {
        System.out.println("Задача 3");

        /*
        В стране Y население равно 12 миллионов человек.

        Рождаемость составляет 17 человек на 1000, смертность — 8 человек.
        Рассчитайте, какая численность населения будет через 10 лет, если показатели рождаемости и смертности постоянны.

        В консоль выведите результат операции на каждый год в формате: «Год …, численность населения составляет …».
         */

        int populationY = 12000000;          // Население
        int birthRate = 17;                  // Рождаемость, чел на 1000
        int mortalityRate = 8;               // Смертность, чел на 1000
        int yearCounter = 1;
        int modyfier = populationY / 1000;   // Множитель рождаемости и смертности

        while (yearCounter <= 10) {
            populationY += ((birthRate - mortalityRate) * modyfier);
            System.out.println("Год " + yearCounter + ", численность населения составляет " + populationY + " человек");
            yearCounter += 1;
        }
        System.out.println(" ");

    }

    public static void task4() {
        System.out.println("Задача 4");

        /*
        Василий решил положить деньги на накопительный счет, где каждый месяц к сумме его вклада добавляется еще 7%.
        Первоначальная сумма вклада — 15 тысяч рублей.

        Вычислите и выведите в консоль, сколько месяцев Василию нужно будет копить,
        чтобы собрать сумму в 12 миллионов рублей при условии, что процент банка от накоплений не меняется, а всегда равен 7%.

        Выведите в консоль результат программы с указанием суммы накоплений по каждому месяцу.
         */

        double cash = 15000;            // Сумма вложения
        double totalCash = 0;           // Остаток по вкладу
        double targetCash = 12000000;   // Целевая сумма
        double percent = 7;             // Процент по вкладу
        int month = 0;                  // Счетчик месяцев

        while (totalCash <= targetCash) {
            totalCash += cash;  // Для случаев ежемесячного пополнения вклада (в словии не указывается, есть ли оно, добавил на всякий случай)
            totalCash += percent * (totalCash / 100);
            month += 1;
            System.out.println("Месяц " + month + ", сумма накоплений: " + (int) totalCash + " руб.");
        }
        System.out.println("\nДля достижения целевой суммы " + (int) targetCash + " рублей понадобится " + month + " месяцев\n");

    }

    public static void task5() {
        System.out.println("Задача 5");

        /*
        Видоизмените программу таким образом, чтобы в консоль выводились не все месяцы подряд, а только каждый шестой.
        Должны быть видны накопления за 6, 12, 18, 24-й и следующие месяцы.
         */

        double cash = 15000;            // Сумма вложения
        double totalCash = 0;           // Остаток по вкладу
        double targetCash = 12000000;   // Целевая сумма
        double percent = 7;             // Процент по вкладу
        int month = 0;                  // Счетчик месяцев

        while (totalCash <= targetCash) {
            totalCash += cash;  // Для случаев ежемесячного пополнения вклада (в словии не указывается, есть ли оно, добавил на всякий случай)
            totalCash += percent * (totalCash / 100);
            month += 1;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накоплений: " + (int) totalCash + " руб.");
            }
        }
        System.out.println(" ");
    }

    public static void task6() {
        System.out.println("Задача 6");

        /*
        Василий решил, что будет копить деньги ближайшие 9 лет.
        Он хочет знать, какой будет сумма его накоплений каждые полгода на протяжении этих 9 лет.

        Исходная сумма всё та же — 15 тысяч рублей, проценты банка – 7% ежемесячно.

        Напишите программу, которая будет выводить сумму накоплений за каждые полгода в течение 9 лет.
         */

        double cash = 15000;            // Сумма вложения
        double totalCash = 0;           // Остаток по вкладу
        double percent = 7;             // Процент по вкладу
        int years = 9;                  // Срок вклада (лет)
        int month = years * 12;         // Срок вклада (месяцев)

        int monthCount = 0;             // Счетчик месяцев

        while (monthCount <= month) {
            totalCash += cash;
            totalCash += percent * (totalCash / 100);
            monthCount += 1;
            if (monthCount % 6 == 0) {
                System.out.println("Месяц " + monthCount + ", сумма накоплений: " + (int) totalCash + " руб.");
            }
        }
        System.out.println(" ");
    }

    public static void task7() {
        System.out.println("Задача 7");

        /*
        В компании пятница — отчетный день.

        Нужно написать программу, которая считает дни месяца по датам, определяет, какой день пятница,
        и выводит сообщение с напоминанием, что нужно подготовить еженедельный отчет.

        Создайте переменную типа int, которая хранит в себе номер первой пятницы месяца (число от 1 до 7).

        Выведите на каждую пятницу месяца (включая полученную) сообщение следующего вида: «Сегодня пятница, ...-е число.
        Необходимо подготовить отчет».

        В нашем месяце 31 день. В результате у вас должно получиться от 4 до 5 сообщений с напоминаниями по разным датам.
         */

        int firstFriday = (int) (Math.random() * 7 + 1); // Вместо прописывания номера первой пятницы случайное генерирование
        int daysPerMonth = 31;                           // дней в месяц
        for (int i = firstFriday; i <= daysPerMonth; i += 7) {
            System.out.println("Сегодня пятница, " + i + "-е число. Необходимо подготовить отчет");
        }
        System.out.println(" ");

    }

    public static void task8() {
        System.out.println("Задача 8");

        /*
        Нам нужно написать астрономическое приложение, которое считает, когда над Землей пролетает комета.

        Известно, что комета пролетает каждый 79-й год, начиная с нулевого.

        В консоль нужно вывести все годы за последние 200 лет, когда появлялась комета,
        а также следующий год ее появления (ближайшие 100 лет).

        Для вычисления периода можно создать две дополнительные переменные, которые содержат год за 200 лет до текущего
        (из созданной ранее переменной) в качестве старта и 100 лет после в качестве завершения периода расчета.

        В результате решения задачи в консоли должен получиться следующий результат:

        1896
        1975
        2054
         */

        int year = 2023;
        int startOfPeriod = year - 200;
        int endOfPeriod = year + 100;
        int cometFrequency = 79;

        for (int i = startOfPeriod; i <= endOfPeriod; i++) {
            if (i % cometFrequency == 0) {
                System.out.println(i + " - год появления кометы");
            }
        }
        System.out.println(" ");
    }
}