from abc import ABCMeta, abstractmethod
# AbstractProdutoA
class PizzaVeg(metaclass=ABCMeta):

    @abstractmethod
    def preparar(self, PizzaVeg):
        pass
