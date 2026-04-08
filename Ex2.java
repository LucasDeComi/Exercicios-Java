import java.util.Scanner;

class Aluno {
    String nome;
    double nota1, nota2, media;

    void calcularMedia() {
        media = (nota1 + nota2) / 2;
    }
}

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Aluno[] alunos = new Aluno[3]; // Declarando arrays

        for(int i = 0; i < alunos.length; i++) {
            Aluno novoAluno = new Aluno();
            System.out.println("Insira o nome do aluno: ");
            novoAluno.nome = scanner.nextLine();
            System.out.println("Insira a primeira nota do aluno: ");
            novoAluno.nota1 = scanner.nextDouble();
            scanner.nextLine();
            System.out.println("Insira a segunda nota do aluno: ");
            novoAluno.nota2 = scanner.nextDouble();
            scanner.nextLine();
            novoAluno.calcularMedia();
            alunos[i] = novoAluno;
        }
        for(int i = 0; i < alunos.length; i++) {
            System.out.println("Aluno: " + alunos[i].nome);
            System.out.println("Media total das notas: " + alunos[i].media);
        }
        scanner.close();
    }
}