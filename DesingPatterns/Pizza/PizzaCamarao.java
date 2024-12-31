package Pizza;

//ConcreteProductB1
class PizzaCamarao implements Pizza {

 @Override
 public void servir(PizzaVeg pizzaVeg) {
     System.out.println(getClass().getSimpleName() + " é servida com camarão na " + pizzaVeg.getClass().getSimpleName());
 }
}