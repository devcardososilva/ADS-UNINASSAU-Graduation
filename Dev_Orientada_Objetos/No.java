public class No {
    private int valor;
    private No proximo;

    public No(int valor) {
        this.valor = valor;
        this.proximo = null;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public No getProximo() {
        return proximo;
    }

    public void setProximo(No proximo) {
        this.proximo = proximo;
    }

    @Override
    public String toString() {
        return "No{" +
                "valor=" + valor +
                '}';
    }

    public static void main(String[] args) {
        No primeiro = new No(10);
        No segundo = new No(20);
        primeiro.setProximo(segundo);

        System.out.println("Primeiro nó: " + primeiro);
        System.out.println("Segundo nó: " + primeiro.getProximo());
    }
}

