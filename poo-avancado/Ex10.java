// APLICANDO OS CONHECIMENTOS DE TODOS OS EXERCÍCIOS ANTERIORES
import java.util.Scanner;
import java.util.ArrayList;

abstract class Veiculo {
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

    void exibirInfo() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Velocidade Máxima: " + velocidadeMaxima + "km/h");
        System.out.println("Consumo de Combustível: " + consumoCombustivel + "km/L");
        System.out.println("Capacidade do Tanque: " + capacidadeTanque + "L");
        System.out.println("Autonomia do Veículo: " + calcularAutonomia() + "km");
    }
}

class Carro extends Veiculo {
    Carro(String _marca, String _modelo, double _velocidadeMaxima, double _consumo, double _capacidade) {
        super(_marca, _modelo, _velocidadeMaxima, _consumo, _capacidade);
    }

    @Override double calcularAutonomia() {
        return capacidadeTanque * consumoCombustivel;
    }

    @Override void exibirInfo() {
        System.out.println("\nTipo de veículo: Carro");
        super.exibirInfo();
    }
}

class Moto extends Veiculo {
    Moto(String _marca, String _modelo, double _velocidadeMaxima, double _consumo, double _capacidade) {
        super(_marca, _modelo, _velocidadeMaxima, _consumo, _capacidade);
    }

    @Override double calcularAutonomia() {
        return capacidadeTanque * consumoCombustivel;
    }

    @Override void exibirInfo() {
        System.out.println("\nTipo de veículo: Moto");
        super.exibirInfo();
    }
}

public class Ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<Veiculo> veiculos = new ArrayList<>();

        boolean sair = false;

        while(!sair) {
            System.out.println("\nPara cadastrar um novo carro, digite 'cadastrar carro'");
            System.out.println("Para cadastrar uma nova moto, digite 'cadastrar moto'");
            System.out.println("Para ver todos os veículos, digite 'listar'");
            System.out.println("Para encerrar o programa, digite 'sair'");
            System.out.println("O que deseja fazer? ");
            String escolha = scanner.nextLine();
            String marca, modelo;
            double consumo, capacidade, velocidade;
            switch(escolha) {
                case "cadastrar carro":
                    System.out.println("\nInsira a marca do novo carro: ");
                    marca = scanner.nextLine();
                    System.out.println("Insira o modelo do novo carro: ");
                    modelo = scanner.nextLine();
                    System.out.println("Insira a velocidade máxima do novo carro: ");
                    velocidade = scanner.nextDouble();
                    scanner.nextLine();
                    if(velocidade < 0) {
                        System.out.println("Valor Inválido!");
                        break;
                    }
                    System.out.println("Insira o consumo de combustível do novo carro: ");
                    consumo = scanner.nextDouble();
                    scanner.nextLine();
                    if(consumo < 0) {
                        System.out.println("Valor Inválido!");
                        break;
                    }
                    System.out.println("Insira a capacidade do tanque do novo carro: ");
                    capacidade = scanner.nextDouble();
                    scanner.nextLine();
                    if(capacidade < 0) {
                        System.out.println("Valor Inválido!");
                        break;
                    }
                    if(velocidade > 0 && consumo > 0 && capacidade > 0) {
                        veiculos.add(new Carro(marca, modelo, velocidade, consumo, capacidade));
                    }
                    break;
                case "cadastrar moto":
                    System.out.println("\nInsira a marca da nova moto: ");
                    marca = scanner.nextLine();
                    System.out.println("Insira o modelo da nova moto: ");
                    modelo = scanner.nextLine();
                    System.out.println("Insira a velocidade máxima da nova moto: ");
                    velocidade = scanner.nextDouble();
                    scanner.nextLine();
                    if(velocidade < 0) {
                        System.out.println("Valor Inválido!");
                        break;
                    }
                    System.out.println("Insira o consumo de combustível da nova moto: ");
                    consumo = scanner.nextDouble();
                    scanner.nextLine();
                    if(consumo < 0) {
                        System.out.println("Valor Inválido!");
                        break;
                    }
                    System.out.println("Insira a capacidade do tanque da nova moto: ");
                    capacidade = scanner.nextDouble();
                    scanner.nextLine();
                    if(capacidade < 0) {
                        System.out.println("Valor Inválido!");
                        break;
                    }
                    if(velocidade > 0 && consumo > 0 && capacidade > 0) {
                        veiculos.add(new Moto(marca, modelo, velocidade, consumo, capacidade));
                    }
                    break;
                case "listar":
                    if(veiculos.isEmpty()) {
                        System.out.println("\nNenhum veículo ainda foi cadastrado");
                    }
                    else {
                        for(Veiculo v : veiculos) { // Equivalente ao foreach em outras linguagens
                            v.exibirInfo();
                        }
                    }
                    break;
                case "sair":
                    sair = true;
                    break;
                default:
                    System.out.println("Comando inválido!");
                    break;
            }
        }
        scanner.close();
    }
}