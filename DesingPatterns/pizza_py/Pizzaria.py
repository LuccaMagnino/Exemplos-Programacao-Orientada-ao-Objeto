
from PizzaBrasileira import PizzaBrasileira
from PizzaItaliana import PizzaItaliana
from Pizza import Pizza
from PizzaVeg import PizzaVeg

# Cliente
class Pizzaria:

    def fazer_pizzas(self):
        for factory in [PizzaBrasileira(), PizzaItaliana()]:
            self.factory = factory
            self.pizza = self.factory.criar_pizza()
            self.pizza_veg = self.factory.criar_pizza_veg()
            self.pizza_veg.preparar()
            self.pizza.servir(self.pizza_veg)


pizzaria = Pizzaria()
pizzaria.fazer_pizzas()
print ("Estudantes: \n")
print ("Jair Eugênio Ferreira - 202401791 \n")
print ("João Vitor Sousa de Oliveira - 202401794 \n")
print ("Lucas Almeida Oliveira Isaac - 202401802 \n")
print ("Lucca Magnino - 202401805 \n")