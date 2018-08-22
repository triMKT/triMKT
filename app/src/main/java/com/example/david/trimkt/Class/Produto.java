package com.example.david.trimkt.Class;

public class Produto {

    private String nome;
    private String preco;
    private int imgProduto;

    public Produto() {
    }

    public Produto(String nome, String preco, int imgProduto) {
        this.nome = nome;
        this.preco = preco;
        this.imgProduto = imgProduto;
    }



    //GETTERS
    public String getNome() {
        return nome;
    }

    public String getPreco() {
        return preco;
    }

    public int getImgProduto() {
        return imgProduto;
    }

    //SETTERS

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }

    public void setImgProduto(int imgProduto) {
        this.imgProduto = imgProduto;
    }
}
