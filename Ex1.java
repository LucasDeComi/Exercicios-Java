import java.util.Scanner; // Biblioteca que permite a leitura de valores inseridos no console

class ContaBancaria { // A classe define como o objeto vai ser e o que ele vai possuir
    String titular;
    double saldo;

    void depositar(double valor) {
        saldo += valor;
    }

    void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    void exibirSaldo() {
        System.out.println("Saldo da conta: " + saldo);
    }
}

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ContaBancaria conta = new ContaBancaria();
        
        System.out.println("Insira o seu nome de usuário: ");
        conta.titular = scanner.nextLine(); // Lê o valor inserido e atribui à variável como String

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
                    valor = scanner.nextDouble(); // nextDouble e nextInt leem apenas o número, deixando o Enter da linha ainda no terminal
                    scanner.nextLine(); // nextLine vai ler esse Enter que ficou. Isso permite que a leitura da próxima linha funcione normalmente
                    conta.depositar(valor);
                    break;
                case "sacar":
                    System.out.println("Insira o valor que deseja sacar de sua conta: ");
                    valor = scanner.nextDouble();
                    scanner.nextLine();
                    conta.sacar(valor);
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