import java.util.Scanner;

class Funcionario {
    String nome;
    double salario;

    double calcularBonus() {
        return salario * .1;
    }

    void exibirDados() {
        double bonus = calcularBonus();
        System.out.println("\nEstagiário: " + nome);
        System.out.println("Salário: R$" + salario);
        System.out.println("Bônus: R$" + bonus);
        System.out.println("Salário total: R$ " + (salario + bonus));
    }
}

class Gerente extends Funcionario { // Criação de subclasse
    @Override double calcularBonus() { // Sobrescrevendo o método calcularBonus da classe Funcionario
        return salario * .2;
    }
}

class Estagiario extends Funcionario {
    @Override double calcularBonus() {
        return salario *.05;
    }
}

public class Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Funcionario funcionario = new Funcionario();
        System.out.println("Insira o nome do funcionário: ");
        funcionario.nome = scanner.nextLine();
        System.out.println("Insira o salário do funcionário: ");
        funcionario.salario = scanner.nextDouble();
        scanner.nextLine();

        Gerente gerente = new Gerente();
        System.out.println("Insira o nome do gerente: ");
        gerente.nome = scanner.nextLine();
        System.out.println("Insira o salário do gerente: ");
        gerente.salario = scanner.nextDouble();
        scanner.nextLine();

        Estagiario estagiario = new Estagiario();
        System.out.println("Insira o nome do estagiário: ");
        estagiario.nome = scanner.nextLine();
        System.out.println("Insira o salário do estagiário: ");
        estagiario.salario = scanner.nextDouble();
        scanner.nextLine();

        funcionario.exibirDados();
        gerente.exibirDados();
        estagiario.exibirDados();
        
        scanner.close();
    }
}