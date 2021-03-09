package kz.aitu.oop.assignment6;

public class ArtCoffeeTableFactory implements CoffeeTableFactory {
    @Override
    public void hasLegs() {
        System.out.println("Art coffee table has no legs;");
    }

    @Override
    public void sitOn() {
        System.out.println("You can't sit on Art coffee table");
    }
}
