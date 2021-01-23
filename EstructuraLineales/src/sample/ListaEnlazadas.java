package sample;

public class ListaEnlazadas {
    Nodo inicio;
    public ListaEnlazadas(){
        inicio = null;
    }
    public void insertar(Cancion cancion){
        Nodo NuevoNodo = new Nodo(Cancion);
        if (this.inicio == null){
            this.inicio = NuevoNodo;
        }else {
            Nodo nodoActual = inicio.getSiguiente();
            if(nodoActual == null){
                inicio.setSiguiente(NuevoNodo);
            }else {
                while (nodoActual.getSiguiente() !=null){
                    nodoActual = nodoActual.getSiguiente();

                }
                nodoActual.setSiguiente(NuevoNodo);
            }

        }
    }
    public void mostrarElementos(){
            Nodo nodoActual1 = inicio;
            while (nodoActual1.getSiguiente() !=null){
                System.out.print(nodoActual1.getCancion().getNombre()+' ');
                System.out.print(nodoActual1.getCancion().getDuracion()+' ');
                System.out.println(nodoActual1.getCancion().getRuta()+' ');
                nodoActual1 = nodoActual1.getSiguiente();
            }
    }
}
