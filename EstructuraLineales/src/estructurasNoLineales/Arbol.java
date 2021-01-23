package estructurasNoLineales;

public class Arbol {
    Nodoarbol inicial;

    {
        this.inicial = null;
    }

    public void insertar(int valor) {
        if (this.inicial == null) {
            this.inicial = new Nodoarbol(valor);
        } else {
            this.inicial.insertar(valor);
        }
    }

    public void dispararPreorden() {
        this.inorden(this.inicial);
    }

    public void preorden(Nodoarbol nodoarbol) {
        if (Nodoarbol == null) {
            return;
        } else {
            preorden(inicial.getNodoizq());
            System.out.println(inicial.getValor());
            preorden(inicial.getNododer());
        }
    }

    public void dispararInorden() {
        this.inorden(this.inicial);
        {


        public void inorden (Nodoarbol nodo){
            if (nodo == null) {
                return;
            } else {
                inorden(inicial.getNodoizq());

                System.out.println(inicial.getValor());
                inorden(inicial.getNododer());
            }
        }

        public void dispararPostorden (Nodoarbol nodo) {
            this.postorden(this.inicial);
            {
            }
            public void postorden (Nodoarbol nodo){
                if (nodo == null) {
                    return;
                } else {
                    postorden(inicial.getNodoizq());
                    System.out.println(inicial.getValor());
                    postorden(inicial.getNododer());
                }
            }

    public void dispararInstorden() {
    }

    public void dispararPostorden() {
    }
}