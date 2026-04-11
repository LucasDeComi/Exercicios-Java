package model;

public abstract class Veiculo {
    private String marca, modelo;
    private double velocidadeMaxima;
    protected double consumoCombustivel, capacidadeTanque;

    Veiculo(String _marca, String _modelo, double _velocidadeMaxima, double _consumo, double _capacidade) {
        this.marca = _marca;
        this.modelo = _modelo;
        this.velocidadeMaxima = _velocidadeMaxima;
        this.consumoCombustivel = _consumo;
        this.capacidadeTanque = _capacidade;
    }

    String getMarca() {
        return marca;
    }

    String getModelo() {
        return modelo;
    }

    double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    double getConsumo() {
        return consumoCombustivel;
    }

    double getCapacidade() {
        return capacidadeTanque;
    }

    abstract double calcularAutonomia();

    public void exibirInfo() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Velocidade Máxima: " + velocidadeMaxima + "km/h");
        System.out.println("Consumo de Combustível: " + consumoCombustivel + "km/L");
        System.out.println("Capacidade do Tanque: " + capacidadeTanque + "L");
        System.out.println("Autonomia do Veículo: " + calcularAutonomia() + "km");
    }
}