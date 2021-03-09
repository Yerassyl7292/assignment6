package kz.aitu.oop.assignment6;

public class VictorianFurnitureFactory implements FurnitureAbstractFactory{
    public ChairFactory createChair() { return new VictorianChairFactory(); }
    public SofaFactory createSofa() {
        return new VictorianSofaFactory();
    }
    public CoffeeTableFactory createCoffeeTable() {
        return new VictorianCoffeeTableFactory();
    }
}
