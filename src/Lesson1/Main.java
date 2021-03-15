package Lesson1;

public class Main {
    public static void main(String[] args) {

        Box<Orange> orangeBox = new Box<>();
        Box<Apple> appleBox = new Box<>();
        Box<Apple> appleBox1 = new Box<>();

        for (int i = 0; i < 15; i++) {
            orangeBox.addFruit(new Orange());
            appleBox.addFruit(new Apple());
            appleBox1.addFruit(new Apple());
        }
        System.out.println("Вес коробки с апельсинами " + orangeBox.getBoxWeight());
        System.out.println("Вес коробки с яблоками " + appleBox.getBoxWeight());
        System.out.println(orangeBox.compare(appleBox));
        System.out.println(appleBox.compare(appleBox1));
        Box.transfer(appleBox, appleBox1);
        System.out.println("Вес первой коробки " + appleBox.getBoxWeight() + " Вес второй коробки " + appleBox1.getBoxWeight());
    }
}
