class Node<T> {

    T innhold;
    Node lenke;

    Node() {
        lenke = null;
        innhold = null;
    }

    Node(T t, Node n) {
        this.innhold = t;
        this.lenke = n;
    }

    public T hentInnhold() {
        return innhold;
    }

    public void settInnhold(T t) {
        this.innhold = t;
    }

    public T hentLenke() {
        return lenke;
    }

    public void settLenke(Node n) {
        this.lenke = n;
    }
    
}
