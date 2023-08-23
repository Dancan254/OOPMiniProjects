package PizzaBillGenerator;

public class DeluxePizza extends Pizza{

    public DeluxePizza(boolean isVeg) {
        super(isVeg);
        super.addExtraCheese();
        super.addExtraToppings();
    }

    @Override
    public void addExtraToppings() {
        //super.addExtraToppings();
    }

    @Override
    public void addExtraCheese() {
        //super.addExtraCheese();
    }
}
