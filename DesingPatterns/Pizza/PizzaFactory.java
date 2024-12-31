package Pizza;

//AbstractFactory
/*
 * PizzaFactory: Interface abstrata que define os métodos 
 * para criar pizzas vegetarianas e não vegetarianas.
 */

/* Interface PizzaFactory: Define os métodos para criar os produtos abstratos
 * (Pizza e PizzaVeg). 
 */

abstract class PizzaFactory {
	abstract PizzaVeg criarPizzaVeg();
	abstract Pizza criarPizza();
}