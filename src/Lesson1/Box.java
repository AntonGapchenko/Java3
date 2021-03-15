package Lesson1;


import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {
    private List<T> boxWithFruit;

    public Box() {
        this.boxWithFruit = new ArrayList<>();
    }

    public void addFruit(T fruit) {
        this.boxWithFruit.add(fruit);

    }

    public float getBoxWeight() {
        float weight = 0.0f;
        for (T element : boxWithFruit) {
            weight += element.getWeight();
        }
        return weight;
    }

    public boolean compare(Box<?> anotherBox) {
        return Math.abs(this.getBoxWeight() - anotherBox.getBoxWeight()) < 0.01;
    }

    public static <E extends Fruit> void transfer(Box<? extends E> src, Box<? super E> dst) {
        dst.boxWithFruit.addAll(src.boxWithFruit);
        src.boxWithFruit.clear();
    }
}
