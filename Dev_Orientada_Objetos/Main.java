
class Animal {
    String nome;

    public Animal(String nome) {
        this.nome = nome;
    }

    public void comer() {
        System.out.println(nome + " está comendo.");
    }
}

class Cachorro extends Animal {
    String raca;

    public Cachorro(String nome, String raca) {
        super(nome);
        this.raca = raca;
    }

    public void latir() {
        System.out.println(nome + " está latindo: Au!");
    }
}

class Ave extends Animal {
    String especie;

    public Ave(String nome, String especie) {
        super(nome);
        this.especie = especie;
    }

    public void voar() {
        System.out.println(nome + " está voando!");
    }
}

public class Main {
    public static void main(String[] args) {
        Cachorro meuDog = new Cachorro("Toto", "Pincher");
        System.out.println("Nome do cachorro: " + meuDog.nome);
        System.out.println("Raça do cachorro: " + meuDog.raca);
        meuDog.comer();
        meuDog.latir();

        System.out.println();

        Ave meuPassarinho = new Ave("Leo", "Cacatua");
        System.out.println("Nome da ave: " + meuPassarinho.nome);
        System.out.println("Especie da ave: " + meuPassarinho.especie);
        meuPassarinho.comer();
        meuPassarinho.voar();
    }
}