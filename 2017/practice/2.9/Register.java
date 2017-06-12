// Klasse for en Node i lenkelisten

class Node<T> {

    T innhold;
    Node<T> lenke;

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

    public Node<T> hentLenke() {
        return lenke;
    }

    public void settLenke(Node n) {
        this.lenke = n;
    }
    
}

// Klasse for lenkelisten

class lenkeListe<T> {

    protected Node start;
    protected Node slutt;
    public int storrelse;
    
    public lenkeListe() {
        start = null;
        slutt = null;
        storrelse = 0;
    }

    public boolean isEmpty() {
        return start == null;
    }

    public int hentStorrelse() {
        return storrelse;
    }

    public void settInnVedStart(T t) {
        Node<T> nullpeker = new Node<T>(t, null);
        storrelse++;

        if (start == null) {
            start = nullpeker;
            slutt = start;
        } else {
            nullpeker.settLenke(start);
            start = nullpeker;
        }
    }

    public void settInnVedSlutt(T t) {
        Node<T> nullpeker = new Node<T>(t, null);
        storrelse++;

        if (start == null) {
            start = nullpeker;
            slutt = start;
        } else {
            slutt.settLenke(nullpeker);
            slutt = nullpeker;
        }
    }

    public void settInnVedPos(T t, int pos) {
        Node<T> nullpeker = new Node<T>(t, null);
        Node<T> peker = start;
        pos = pos - 1;
        for (int i = 1; i < storrelse; i++) {
            if (i == pos) {
                Node<T> temp = peker.hentLenke();
                peker.settLenke(nullpeker);
                peker.settLenke(temp);
                break;
            }
            peker = peker.hentLenke();
        } 
        storrelse++;
    }

    public void slettVedPos(int pos) {
        if (pos == 1) {
            start = start.hentLenke();
            storrelse--;
            return;
        } if (pos == storrelse) {
            Node<T> s = start;
            Node<T> t = start;
            while (s != slutt) {
                t = s;
                s = s.hentLenke();
            }
            slutt = t;
            slutt.settLenke(null);
            storrelse --;
            return;
        }
        Node<T> peker = start;
        pos = pos - 1;
        for (int i = 1; i < storrelse - 1; i++) {
            if (i == pos) {
                Node<T> temp = peker.hentLenke();
                temp = temp.hentLenke();
                peker.settLenke(temp);
                break;
            }
            peker = peker.hentLenke();
        }
        storrelse--;
    }


}
