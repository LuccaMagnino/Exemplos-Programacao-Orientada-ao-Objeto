from abc import ABCMeta, abstractmethod
from Pizza import Pizza

# ProdutoConcreto
class PizzaCamarao(Pizza):

    def servir(self, PizzaVeg):
        print(f'{type(self).__name__} é servida com camarão na {type(PizzaVeg).__name__}')
