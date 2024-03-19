package Task;

public class Plate {
    private int food;

    public Plate() {
        this.food = 0;
    }

    public void addFood(int amount) {
        this.food += amount;
        System.out.println("В тарелку добавлено " + amount + " грамм еды.");
    }

    // Метод теперь возвращает количество съеденной еды
    public int decreaseFood(int amount) {
        int eatenFood = Math.min(food, amount); // Сколько кот может съесть
        food -= eatenFood; // Уменьшаем количество еды в тарелке
        return eatenFood; // Возвращаем сколько еды съел кот
    }

    public void info() {
        System.out.println("В тарелке сейчас " + food + " грамм еды.");
    }

    public int getFood() {
        return food;
    }
}
