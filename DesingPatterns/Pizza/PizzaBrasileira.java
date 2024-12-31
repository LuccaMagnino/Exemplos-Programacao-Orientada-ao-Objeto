package Pizza;

/*
 * PizzaBrasileira e PizzaItaliana: Fábricas concretas que implementam
 * a criação de pizzas específicas.
 */
//ConcreteFactory A
class PizzaBrasileira extends PizzaFactory {

 @Override
 public PizzaVeg criarPizzaVeg() {
     return new PizzaMandioca();
 }

 @Override
 public Pizza criarPizza() {
     return new PizzaCamarao();
 }
}
