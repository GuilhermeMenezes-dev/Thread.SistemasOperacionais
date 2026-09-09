package org.example;

public class Main3 {
    public static void main(String[] args) {
        Pedido hamburguer = new Pedido("Hamburguer");
        Pedido suco = new Pedido("Suco");

        Thread cozinheiro = new Thread(
                hamburguer, "Cozinheiro"
        );

        Thread atendente = new Thread(
                suco, "Atendente"
        );
        cozinheiro.start();
        atendente.start();
        System.out.println("Finalizou!");
    }
}
