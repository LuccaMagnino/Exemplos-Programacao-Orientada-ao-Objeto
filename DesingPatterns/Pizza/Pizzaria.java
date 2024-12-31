package Pizza;

class Pizzaria {

    public void fazerPizzas() {
        PizzaFactory[] factories = {new PizzaBrasileira(), new PizzaItaliana()};
        
        for (PizzaFactory factory : factories) {
            Pizza pizza = factory.criarPizza();
            PizzaVeg pizzaVeg = factory.criarPizzaVeg();
            pizzaVeg.preparar();
            pizza.servir(pizzaVeg);
        }
    }

    public static void main(String[] args) {
        Pizzaria pizzaria = new Pizzaria();
        pizzaria.fazerPizzas();
        System.out.println("Estudantes: \n");
        System.out.println ("Jair Eugênio Ferreira - 202401791 \n");
        System.out.println ("João Vitor Sousa de Oliveira - 202401794 \n");
        System.out.println ("Lucas Almeida Oliveira Isaac - 202401802 \n");
        System.out.println ("Lucca Magnino - 202401805 \n");
   
    }
}