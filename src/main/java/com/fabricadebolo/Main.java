package main.java.com.fabricadebolo;

import main.java.com.fabricadebolo.model.Bolo;

public class Main {
    public static void main(String[] args) {
        //Criando o objeto main.java.com.fabricadebolo.model.Bolo (bolo pronto)
        Bolo bolo = new Bolo("Chocolate", 20);
        bolo.exibirDetalhes();
    }
}
