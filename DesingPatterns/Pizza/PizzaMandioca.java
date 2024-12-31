package Pizza;

//ConcreteProductA1
class PizzaMandioca implements PizzaVeg {

 @Override
 public void preparar() {
     System.out.println("Preparando " + getClass().getSimpleName());
 }
}