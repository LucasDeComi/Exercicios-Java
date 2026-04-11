package model;

public class Moto extends Veiculo {
    public Moto(String _marca, String _modelo, double _velocidadeMaxima, double _consumo, double _capacidade) {
        super(_marca, _modelo, _velocidadeMaxima, _consumo, _capacidade);
    }

    @Override double calcularAutonomia() {
        return capacidadeTanque * consumoCombustivel;
    }

    @Override public void exibirInfo() {
        System.out.println("\nTipo de veículo: Moto");
        super.exibirInfo();
    }
}