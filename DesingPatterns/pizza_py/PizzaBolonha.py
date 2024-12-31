from abc import ABCMeta, abstractmethod
from Pizza import Pizza

# ProdutoConcreto
class PizzaBolonha(Pizza):

    def servir(self, PizzaVeg):
        print(f'{type(self).__name__} é servida com bolonha na {type(PizzaVeg).__name__}')

