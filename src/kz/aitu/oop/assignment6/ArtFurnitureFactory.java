package kz.aitu.oop.assignment6;

public class ArtFurnitureFactory implements FurnitureAbstractFactory{
    @Override
    public ChairFactory createChair() {
        return new ArtChairFactory();
    }

    @Override
    public SofaFactory createSofa() {
        return new ArtSofaFactory();
    }

    @Override
    public CoffeeTableFactory createCoffeeTable() {
        return new ArtCoffeeTableFactory();
    }
}
