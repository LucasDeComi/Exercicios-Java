package model;

public class Carro extends Veiculo {
    public Carro(String _marca, String _modelo, double _velocidadeMaxima, double _consumo, double _capacidade) {
        super(_marca, _modelo, _velocidadeMaxima, _consumo, _capacidade);
    }

    @Override double calcularAutonomia() {
        return capacidadeTanque * consumoCombustivel;
    }

    @Override public void exibirInfo() {
        System.out.println("\nTipo de veículo: Carro");
        super.exibirInfo();
    }
}