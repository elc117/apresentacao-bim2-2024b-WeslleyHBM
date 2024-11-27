// Classe mãe que sera a classe geratriz ou superClass
class Animal {
    private String nome;

    public Animal(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void fazerSom() {
        System.out.println("Animal fazendo som!");
    }
}

// Classe filho que é gerada "derivando" a classe mãe, tambem conhecido como subclasse
class Leao extends Animal {
    public Leao(String nome) {
        super(nome);
    }

    @Override
    public void fazerSom() {
        System.out.println("Roar!");
    }
}

// Outra classe filho que tambem é gerada "derivando" a classe mãe assim como a anterior morem com funcionalidade levemente diferente
class Pinguim extends Animal {
    public Pinguim(String nome) {
        super(nome);
    }

    @Override
    public void fazerSom() {
        System.out.println("Squawk!");
    }
}

// A main cria os objetos utilizando o new ja atribuindo o nome dos animais e apresenta seus nomes e respectivos barulhos
public class Main {
    public static void main(String[] args) {
        // Criando objetos das subclasses
        Animal leao = new Leao("Simba");
        Animal pinguim = new Pinguim("Pingu");

        // Exibindo nomes e sons dos animais
        System.out.println(leao.getNome() + " faz o som: ");
        leao.fazerSom();

        System.out.println(pinguim.getNome() + " faz o som: ");
        pinguim.fazerSom();
    }
}
