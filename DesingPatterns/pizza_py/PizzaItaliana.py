from PizzaFactory import PizzaFactory
from PizzaBrocolli import PizzaBrocolli
from PizzaBolonha import PizzaBolonha

# ConcretoFactory B
class PizzaItaliana(PizzaFactory):

    def criar_pizza_veg(self):
        return PizzaBrocolli()
    
    def criar_pizza(self):
        return PizzaBolonha()
