package app;
import java.util.Scanner;
import java.util.ArrayList;
import model.*;

public class Main {
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