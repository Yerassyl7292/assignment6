package kz.aitu.oop.assignment6;

public class VictorianChairFactory implements ChairFactory {
    @Override
    public void hasLegs() {
        System.out.println("Victorian chair has 4 legs;");
    }

    @Override
    public void sitOn() {
        System.out.println("You can sit on Victorian chair");
    }
}
