package com.project;

class Cliente {
    private String nome;
    private double rendaMensal;
    private double compromissosMensais;
    private double valorCarro;
    private int prazo;

    public Cliente(String nome, double rendaMensal, double compromissosMensais, double valorCarro, int prazo) {
        this.nome = nome;
        this.rendaMensal = rendaMensal;
        this.compromissosMensais = compromissosMensais;
        this.valorCarro = valorCarro;
        this.prazo = prazo;
    }

    public String getNome() {
        return nome;
    }

    public double getRendaMensal() {
        return rendaMensal;
    }

    public double getCompromissosMensais() {
        return compromissosMensais;
    }

    public double getValorCarro() {
        return valorCarro;
    }

    public int getPrazo() {
        return prazo;
    }
}