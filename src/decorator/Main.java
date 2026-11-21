package decorator;

public class Main {
    public static void main(String[] args) {
        Pizza pizza = new MargheritaPizza();
        System.out.println("Description " + pizza.getDescription() + " = Cost " + pizza.getCost());
        pizza = new CheezeDecorator(pizza);
        System.out.println("Description " + pizza.getDescription() + " = Cost " + pizza.getCost());
        pizza = new OlivesDecorator(pizza);
        System.out.println("Description " + pizza.getDescription() + " = Cost " + pizza.getCost());
        pizza = new MushroomDecorator(pizza);
        System.out.println("Description " + pizza.getDescription() + " = Cost " + pizza.getCost());
    }
}
