package sample;

import java.util.LinkedList;

public class Lista {
    public static void main(String[] args) {
        ListaEnlazadas listaEnlazadas = new ListaEnlazadas();
        listaEnlazadas.insertar(new Cancion("Navidad", "Navidad.mp3", "77"));
        listaEnlazadas.insertar(new Cancion("Navidad22", "Navidad.mp3", "57"));
        listaEnlazadas.insertar(new Cancion("Navidad77", "Navidad.mp3", "37"));
        listaEnlazadas.mostrarElementos();
        LinkedList<Cancion> listaJava = new LinkedList<>();
        listaJava.add(new Cancion("Feliz Navidad", "Christmas", "7"));
        listaJava.add(new Cancion("Folklore", "Christmas2", "17"));
        listaJava.add(new Cancion("Evermore", "New Year", "27"));
        listaJava.get();
        for (int x = 0; x < listaJava.size(); x++) {
            Cancion c = listaJava.get(x);
            System.out.println(c.getNombre());
        }

    }
}
