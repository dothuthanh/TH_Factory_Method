package app;

public class FactoryDemo {
    public static void main(String[] args) {
     FactoryAnimail factoryAnimail = new FactoryAnimail();
     Animal a1 = factoryAnimail.getAnimal("finali");
        System.out.println("a1 sound " + a1.makeSound());
        Animal a2 = factoryAnimail.getAnimal("canine");
        System.out.println("a2 sound " + a2.makeSound());
    }
}
