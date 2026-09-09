package org.example;

public class Main2 {
    public static void main(String[] args) {
        Pedido hamburguer = new Pedido("Hamburguer");
        Pedido suco = new Pedido("Suco");

        hamburguer.run();
        suco.run();

        System.out.println("Todos os pedidos terminaram");
    }
}
