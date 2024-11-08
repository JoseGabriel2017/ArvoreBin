public class Principal {

    public static void main(String[] args) {

        Estrutura e = new Estrutura();

        e.inserir(4);
        e.inserir(2);
        e.inserir(3);
        e.inserir(1);
        e.inserir(6);
        e.inserir(5);
        e.inserir(7);

        System.out.println("Árvore em ordem antes da remoção do menor:");
        e.inOrdem();

        No minimo = e.valorMinimo();
        System.out.println("\nValor mínimo = " + minimo.getValor());

        No maximo = e.valorMaximo();
        System.out.println("Valor máximo = " + maximo.getValor());

        e.removerMenor();

        System.out.println("\nÁrvore em ordem após a remoção do menor:");
        e.inOrdem();
    }
}
