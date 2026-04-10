class Pessoa {
    String nome;
    int idade;

    void mostrarDados() {
        System.out.println("Nome: " + nome + " | Idade: " + idade);
    }
}

class Carro {
    String modelo;
    int ano;

    void mostrarDados() {
        System.out.println("Carro: " + modelo + " | Ano: " + ano);
    }
}

class Produto {
    String nome;
    double preco;

    void mostrarDados() {
        System.out.println("Produto: " + nome + " | Preço: R$ " + preco);
    }
}

class Aluno {
    String nome;
    double nota;

    void verificarAprovacao() {
        if (nota >= 7) {
            System.out.println(nome + " Passou fendendo");
        } else {
            System.out.println(nome + " Tais lascado");
        }
    }
}

class ContaBancaria {
    double saldo;

    void depositar(double valor) {
        saldo += valor;
    }

    void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
        } else {
            System.out.println("Tais pobre, não tem dinheiro pra sacar!");
        }
    }

    void mostrarSaldo() {
        System.out.println("Saldo: R$ " + saldo);
    }
}

public class AT_Classes {
    public static void main(String[] args) {

        Pessoa p = new Pessoa();
        p.nome = "Niel";
        p.idade = 19;
        p.mostrarDados();

        Carro c = new Carro();
        c.modelo = "Fiat Uno";
        c.ano = 2010;
        c.mostrarDados();

        Produto prod = new Produto();
        prod.nome = "Cadeira de Plastico";
        prod.preco = 10;
        prod.mostrarDados();

        Aluno a = new Aluno();
        a.nome = "Jose";
        a.nota = 6.5;
        a.verificarAprovacao();

        ContaBancaria conta = new ContaBancaria();
        conta.depositar(500);
        conta.sacar(700);
        conta.mostrarSaldo();
    }
}