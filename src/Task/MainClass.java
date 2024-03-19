package Task;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Cat[] cats = {
                new Cat("Capitan", 500),
                new Cat("Batman", 300),
                new Cat("Zorro", 400),
                new Cat("Pancho", 700),
        };

        Plate plate = new Plate();
        Scanner scanner = new Scanner(System.in);

        for (Cat cat : cats) {
            while (!cat.isSatiety()) {
                plate.info();
                cat.eat(plate);
                if (!cat.isSatiety()) {
                    System.out.println("Кажется, " + cat.getName() + " все еще голоден. В тарелке сейчас " + plate.getFood() +
                            " грамм еды! Сколько грамм еды добавить в тарелку?");
                    while (!scanner.hasNextInt()) { // Проверка на ввод числа
                        System.out.println("Пожалуйста, введите целое числовое значение для количества грамм:");
                        scanner.next(); // Очистка некорректного ввода
                    }
                    int foodToAdd = scanner.nextInt();
                    plate.addFood(foodToAdd);
                }
            }
        }
        scanner.close();
        System.out.println("В тарелке осталось " + plate.getFood() + " грамм еды - можно накормить еще котов!");
        System.out.println("Все коты сыты!");
    }
}
