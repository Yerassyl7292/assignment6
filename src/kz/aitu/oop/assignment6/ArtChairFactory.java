package kz.aitu.oop.assignment6;

public class ArtChairFactory implements ChairFactory {
    @Override
    public void hasLegs() {
        System.out.println("Art chair has 4 legs;");
    }

    @Override
    public void sitOn() {
        System.out.println("You can sit on Art chair");
    }
}
