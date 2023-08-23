package PizzaBillGenerator;

public class Main {
    public static void main(String[] args) {

        Pizza pizza = new Pizza(true);
        pizza.addExtraToppings();
        pizza.addExtraCheese();
        pizza.takeAway();
        pizza.getBill();

        System.out.println("Deluxe Pizza");
        DeluxePizza deluxe = new DeluxePizza(true);
        deluxe.getBill();
    }
}