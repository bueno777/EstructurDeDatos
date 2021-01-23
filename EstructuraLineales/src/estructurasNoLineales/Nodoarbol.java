package estructurasNoLineales;

public class Nodoarbol {
    private int valor;
    private Nodoarbol nodoizq;
    private Nodoarbol nododer;

    public Nodoarbol (int valor){
        this.valor = valor;
        this.nodoizq = null;
        this.nododer = null;


    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Nodoarbol getNodoizq() {
        return nodoizq;
    }



    public Nodoarbol getNododer() {
        return nododer;
    }
    public void insertar(int vvalor ){
        if(vvalor<this.valor){
            if(this.nodoizq==null) {
                this.nodoizq = new Nodoarbol(vvalor);
            }else {
                this.nodoizq.insertar(vvalor);

            }
        }else{
            if(this.nododer==null){
                this.nododer = new Nodoarbol(vvalor);
            }else{
                this.nododer.insertar(vvalor);
            }
        }

    }
}
