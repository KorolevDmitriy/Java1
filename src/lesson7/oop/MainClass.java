package lesson7.oop;

public class MainClass {

    public static void main(String[] args) {
        Cat cat = new Cat ("Barsik", 5);
        Plate plate = new Plate(15);
        plate.info();

        cat.eat(plate);
        plate.info();
//        plate.setFood(plate.getFood() - cat.getAppetite());
    }

}
