abstract class Animal { // Classe abstrata, não pode se tornar objeto. Por isso criamos subclasses que podem se tornar objetos
    String nome;

    Animal(String _nome) {
        this.nome = _nome;
    }

    abstract void fazerSom(); // Método abstrato, não possui corpo
}

class Cachorro extends Animal {
    Cachorro(String _nome) {
        super(_nome);
    }

    @Override void fazerSom() {
        System.out.println("Au au!");
    }
}

class Gato extends Animal {
    Gato(String _nome) {
        super(_nome);
    }

    @Override void fazerSom() {
        System.out.println("Miau!");
    }
}

public class Ex9 {
    public static void main(String[] args) {
        Animal[] animais = {
            new Cachorro("Rex"),
            new Gato("Mimi")
        };

        for(Animal a: animais) {
            a.fazerSom();
        }
    }
}