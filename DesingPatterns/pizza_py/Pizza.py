from abc import ABCMeta, abstractmethod
# AbstractProdutoB
class Pizza(metaclass=ABCMeta):

    @abstractmethod
    def servir(self, PizzaVeg):
        pass
