package main.java.com.fabricadebolo.model;

public class Bolo {
    String sabor;
    int tamanho;

    //construtor (forno)
    public Bolo(String sabor, int tamanho) {
        this.sabor = sabor;
        this.tamanho = tamanho;

    }

    //Metodo para exibir o bolo pronto
    public void exibirDetalhes() {
        System.out.println("Bolo de " + sabor + " de tamanho " + tamanho + "cm.");
    }
}

