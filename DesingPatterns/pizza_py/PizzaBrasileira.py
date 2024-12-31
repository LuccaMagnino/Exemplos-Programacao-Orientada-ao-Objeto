from PizzaFactory import PizzaFactory
from PizzaMandioca import PizzaMandioca
from PizzaCamarao import PizzaCamarao

# ConcretoFactory A
class PizzaBrasileira(PizzaFactory):

    def criar_pizza_veg(self):
        return PizzaMandioca()
    
    def criar_pizza(self):
        return PizzaCamarao()
