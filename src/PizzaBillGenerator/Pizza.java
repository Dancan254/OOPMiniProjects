package PizzaBillGenerator;

public class Pizza implements PizzaContract{

    private double priceOfExtras;
    private double defaultPrice;
    private boolean isVeg = false;
    private double extraToppingPrice = 150;
    private double extraCheesePrice = 75;
    private double bagPackPrice = 50;
    private boolean isExtraTopping = false;
    private boolean isExtraCheese = false;
    private boolean isTakeAway = false;


    public Pizza(boolean isVeg) {

        this.isVeg = isVeg;

        if (isVeg){
            defaultPrice = 750;
        }
        else{
            defaultPrice = 900;
        }

    }

    @Override
    public void addExtraToppings() {
        isExtraTopping = true;
        System.out.println("Adding extra toppings:)");
        priceOfExtras += extraToppingPrice;
    }

    @Override
    public void addExtraCheese() {
        isExtraCheese = true;
        System.out.println("Adding extra cheese:)");
        priceOfExtras += extraCheesePrice;
    }

    @Override
    public void takeAway() {

        isTakeAway = true;
        System.out.println("Opting for take away:)");
        priceOfExtras += bagPackPrice;
    }

    @Override
    public void getBill() {

        System.out.println("The total price is: ");
        System.out.println("Pizza: " + defaultPrice);
        if (isExtraTopping){
            System.out.println("ExtraToppingPrice: " + extraToppingPrice);
        }
        if (isExtraCheese){
            System.out.println("ExtraCheesePrice: " + extraCheesePrice);
        }
        if (isTakeAway){
            System.out.println("BagPackPrice: " + bagPackPrice);
        }

        System.out.println("Total = " + (priceOfExtras + defaultPrice));
    }
}
