package kz.aitu.oop.assignment6;

public class Main {
    public static void main (String[] args) {
        FurnitureAbstractFactory FAFa = new ArtFurnitureFactory();
        ChairFactory ArtChair = FAFa.createChair();
        SofaFactory ArtSofa = FAFa.createSofa();
        CoffeeTableFactory ArtCoffeeTable = FAFa.createCoffeeTable();

        ArtChair.hasLegs();
        ArtChair.sitOn();

        ArtSofa.hasLegs();
        ArtSofa.sitOn();

        ArtCoffeeTable.hasLegs();
        ArtCoffeeTable.sitOn();
    }
}
