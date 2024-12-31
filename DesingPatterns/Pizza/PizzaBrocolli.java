package Pizza;

//ConcreteProductA2
class PizzaBrocolli implements PizzaVeg {

 @Override
 public void preparar() {
     System.out.println("Preparando " + getClass().getSimpleName());
 }
}

