package kz.aitu.oop.assignment6;

public interface FurnitureAbstractFactory {
    public ChairFactory createChair();
    public SofaFactory createSofa();
    public CoffeeTableFactory createCoffeeTable();
}
