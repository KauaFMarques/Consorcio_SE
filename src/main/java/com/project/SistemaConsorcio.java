package com.project;

import java.util.Scanner;

public class SistemaConsorcio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Coleta de dados do cliente
        System.out.println("Digite o nome do cliente: ");
        String nome = scanner.nextLine();

        System.out.println("Digite a renda mensal do cliente: ");
        double rendaMensal = scanner.nextDouble();

        System.out.println("Digite os compromissos financeiros mensais do cliente: ");
        double compromissosMensais = scanner.nextDouble();

        System.out.println("Digite o valor do carro: ");
        double valorCarro = scanner.nextDouble();

        System.out.println("Digite o prazo desejado (em meses): ");
        int prazo = scanner.nextInt();

        // Criação do cliente
        Cliente cliente = new Cliente(nome, rendaMensal, compromissosMensais, valorCarro, prazo);

        // Avaliação do consórcio
        System.out.println(SistemaEspecialista.recomendarConsorcio(cliente));

        scanner.close();
    }
}