package kz.aitu.oop.assignment6;

public class ArtSofaFactory implements SofaFactory {
    @Override
    public void hasLegs() {
        System.out.println("Art sofa has 4 legs;");
    }

    @Override
    public void sitOn() {
        System.out.println("You can sit on Art sofa");
    }
}
