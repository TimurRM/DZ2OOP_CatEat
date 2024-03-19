package Task;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = false;
    }

    public void eat(Plate plate) {
        if (plate.getFood() > 0) {
            int eatenFood = plate.decreaseFood(appetite);
            appetite -= eatenFood; // Уменьшаем аппетит на количество съеденной еды
            if (appetite <= 0) {
                satiety = true;
                System.out.println(name + " поел и насытился.");
            } else {
                System.out.println(name + " съел " + eatenFood + " грамм еды и все еще голоден.");
            }
        } else {
            System.out.println(name + " не может поесть, так как тарелка пуста.");
        }
    }

    public boolean isSatiety() {
        return satiety;
    }

    public String getName() {
        return name;
    }
}

