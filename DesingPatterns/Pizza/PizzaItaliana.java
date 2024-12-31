package Pizza;

/*
 * PizzaBrasileira e PizzaItaliana: Fábricas concretas que implementam
 * a criação de pizzas específicas.
 */

//ConcreteFactory B
class PizzaItaliana extends PizzaFactory {

 @Override
 public PizzaVeg criarPizzaVeg() {
     return new PizzaBrocolli();
 }

 @Override
 public Pizza criarPizza() {
     return new PizzaBolonha();
 }
}

