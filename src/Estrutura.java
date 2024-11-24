public class Estrutura {

    private No raiz;

    public void inserir(int valor) {
        inserir(this.raiz, valor);
    }

    private void inserir(No no, int valor) {
        if (no != null) {
            if (valor < no.getValor()) {
                if (no.getEsquerda() != null) {
                    inserir(no.getEsquerda(), valor);
                } else {
                    no.setEsquerda(new No(valor));
                }
            } else if (valor > no.getValor()) {
                if (no.getDireita() != null) {
                    inserir(no.getDireita(), valor);
                } else {
                    no.setDireita(new No(valor));
                }
            }
        } else {
            this.raiz = new No(valor);
        }
    }

    public void preOrdem() {
        preOrdem(this.raiz);
    }

    private void preOrdem(No no) {
        if (no != null) {
            System.out.println(no.getValor());
            preOrdem(no.getEsquerda());
            preOrdem(no.getDireita());
        }
    }

    public void posOrdem() {
        posOrdem(this.raiz);
    }

    private void posOrdem(No no) {
        if (no != null) {
            posOrdem(no.getEsquerda());
            posOrdem(no.getDireita());
            System.out.println(no.getValor());
        }
    }

    public void inOrdem() {
        inOrdem(this.raiz);
    }

    private void inOrdem(No no) {
        if (no != null) {
            inOrdem(no.getEsquerda());
            System.out.println(no.getValor());
            inOrdem(no.getDireita());
        }
    }

    public No valorMinimo() {
        return valorMinimo(this.raiz);
    }

    private No valorMinimo(No no) {
        if (no.getEsquerda() != null) {
            return valorMinimo(no.getEsquerda());
        }
        return no;
    }

    public No valorMaximo() {
        return valorMaximo(this.raiz);
    }

    private No valorMaximo(No no) {
        if (no.getDireita() != null) {
            return valorMaximo(no.getDireita());
        }
        return no;
    }

    public void removerMenor() {
        this.raiz = removerMenor(this.raiz);
    }

    private No removerMenor(No no) {
        if (no == null) {
            return null;
        }
        if (no.getEsquerda() == null) {
            return no.getDireita();
        }
        no.setEsquerda(removerMenor(no.getEsquerda()));
        return no;
    }

    public int altura() {
        return altura(this.raiz);
    }

    private int altura(No no) {
        if (no == null) {
            return 0;
        }
        int alturaEsquerda = altura(no.getEsquerda());
        int alturaDireita = altura(no.getDireita());
        return Math.max(alturaEsquerda, alturaDireita) + 1;
    }
}
