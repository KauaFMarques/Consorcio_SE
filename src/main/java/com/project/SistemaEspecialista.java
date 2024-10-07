package com.project;

class SistemaEspecialista {
    private static double taxaAdministracao;

    public SistemaEspecialista() {
    }

    public void calcularTaxaAdministracao(Double valor) {
        if (valor < 70000)
            taxaAdministracao = 0.15;
        else if (valor >= 70000 && valor < 100000)
            taxaAdministracao = 0.20;
        else
            taxaAdministracao = 0.25;
    }

    public static double calcularParcelas(Cliente cliente) {
        double total = cliente.getValorCarro() + (cliente.getValorCarro() * taxaAdministracao);
        return total / cliente.getPrazo();
    }

    public static String recomendarConsorcio(Cliente cliente) {
        double parcelas = calcularParcelas(cliente);
        double capacidadePagamento = cliente.getRendaMensal() - cliente.getCompromissosMensais();

        if (cliente.getRendaMensal() < 2824)
            return "Você precisa ter renda de no mínimo 2 salários mínimos para iniciar um consórcio.";

        if (capacidadePagamento >= parcelas) {
            return "Consórcio aprovado para " + cliente.getNome() + " com parcelas de R$ "
                    + String.format("%.2f", parcelas);
        } else {
            return "Consórcio não aprovado devido à insuficiência de renda. Capacidade de pagamento: R$ "
                    + String.format("%.2f", capacidadePagamento);
        }
    }
}
