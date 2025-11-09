public class No {
    int dado;         
    No proximo;       

    public No(int dado) {
        this.dado = dado;
        this.proximo = null;
    }

    public void exibir() {
        System.out.print(dado + " ");
    }

    public static void main(String[] args) {
        No primeiro = new No(10);
        No segundo = new No(20);
        primeiro.proximo = segundo;

        primeiro.exibir();
        primeiro.proximo.exibir();
    }
}
