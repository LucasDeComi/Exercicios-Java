import java.util.Scanner;

class Conta {
    private String titular;
    private double saldo;

    String getTitular() { // Método get, ou getter. Retorna, ou seja, pega (get), um atributo. É importante para o encapsulamento
        return titular;
    }

    void setTitular(String novoTitular) { // Método set, ou setter. Define o valor de um atributo.
        if(novoTitular != null) { // Verifica se o valor inserido não é nulo
            this.titular = novoTitular;
        }
    }

    double getSaldo() {
        return saldo;
    }

    void depositar(double valor) {
        if(valor > 0) {
            this.saldo += valor;
        }
        else {
            System.out.println("Insira um valor válido!");
        }
    }
    
    void sacar(double valor) {
        if(valor <= 0) {
            System.out.println("Insira um valor válido!");
            return;
        }

        if(valor <= saldo) {
            this.saldo -= valor;
        }
        else {
            System.out.println("Saldo insuficiente!");
        }
    }
    
    void exibirSaldo() {
        System.out.println("Saldo: R$" + saldo);
    }
}

public class Ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Conta conta = new Conta();

        System.out.println("Insira o nome do titular da conta: ");
        String nome = scanner.nextLine();
        conta.setTitular(nome);

        boolean encerrar = false;
        while(!encerrar) {
            System.out.println("Para fazer um depósito, digite 'depositar'");
            System.out.println("Para fazer um saque, digite 'sacar'");
            System.out.println("Para ver o seu saldo atual, digite 'ver saldo'");
            System.out.println("Para encerrar o programa, digite 'encerrar'");
            System.out.println("O que deseja fazer? ");
            String escolha = scanner.nextLine();
            double valor;
            switch(escolha) {
                case "depositar":
                    System.out.println("Insira o valor que deseja depositar à sua conta: ");
                    valor = scanner.nextDouble();
                    scanner.nextLine();
                    conta.depositar(valor);
                    System.out.println("Titular da conta bancária: " + conta.getTitular());
                    conta.exibirSaldo();
                    break;
                case "sacar":
                    System.out.println("Insira o valor que deseja sacar de sua conta: ");
                    valor = scanner.nextDouble();
                    scanner.nextLine();
                    conta.sacar(valor);
                    conta.exibirSaldo();
                    break;
                case "ver saldo":
                    conta.exibirSaldo();
                    break;
                case "encerrar":
                    encerrar = true;
                    break;
                default:
                    System.out.println("Comando inválido!");
                    break;
            }
        }
        scanner.close();
    }
}