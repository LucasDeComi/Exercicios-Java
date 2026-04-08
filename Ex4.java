import java.util.Scanner;
import java.util.Random; // Biblioteca para gerar números aleatórios

class Personagem {
    String nome;
    int vida, ataque;

    void atacar(Personagem inimigo) {
        inimigo.vida -= ataque;
        System.out.println(nome + " atacou " + inimigo.nome + " e causou " + ataque + " pontos de ataque, deixando-o com " + (inimigo.vida <= 0 ? 0 : inimigo.vida) + " pontos de vida!");
    }

    void exibirStatus() {
        System.out.println("Personagem: " + nome);
        System.out.println("Vida restante: " + vida);
        System.out.println("Poder de ataque: " + ataque);
    }
}

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Personagem jogador = new Personagem();
        System.out.println("Insira o nome do seu jogador: ");
        jogador.nome = scanner.nextLine();
        System.out.println("Insira a vida do seu jogador: ");
        jogador.vida = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Insira o ataque do seu jogador: ");
        jogador.ataque = scanner.nextInt();
        scanner.nextLine();
        
        Personagem inimigo = new Personagem();
        System.out.println("Insira o nome do seu inimigo: ");
        inimigo.nome = scanner.nextLine();
        System.out.println("Insira a vida do seu inimigo: ");
        inimigo.vida = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Insira o ataque do seu inimigo: ");
        inimigo.ataque = scanner.nextInt();
        scanner.nextLine();

        jogador.exibirStatus();
        inimigo.exibirStatus();

        Random random = new Random();
        int caraCoroa = random.nextInt(2);
        System.out.println((caraCoroa == 0 ? jogador.nome : inimigo.nome) + " começa!");
        
        boolean fimJogo = false;
        if(caraCoroa == 1) {
            inimigo.atacar(jogador);
            if(jogador.vida <= 0) {
                fimJogo = true;
                System.out.println(inimigo.nome + " vence!");
            }
        }
        while(!fimJogo) {
            for(int i = 0; i <= 1 && !fimJogo; i++) {
                if(i == 0) {
                    jogador.atacar(inimigo);
                    if(inimigo.vida <= 0) {
                        fimJogo = true;
                        System.out.println(jogador.nome + " vence!");
                    }
                }
                else {
                    inimigo.atacar(jogador);
                    if(jogador.vida <= 0) {
                        fimJogo = true;
                        System.out.println(inimigo.nome + " vence!");
                    }
                }
            }
        }
        scanner.close();
    }
}