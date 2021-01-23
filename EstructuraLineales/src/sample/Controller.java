package sample;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Controller {
    public static void main(String[] args) {
        Stack<Usuario> pila = new Stack<>();
        Stack<Integer> pila2 = new Stack<>();
        Queue<Usuario> cola= new LinkedList<>();
        pila.add(new Usuario("yo", "libertad","6366991603"));
        pila.add(new Usuario("tu","sin","5555555555"));
        pila.add(new Usuario("Forky","Disney Land","7147814636"));
        Usuario cachar = pila.pop();
        System.out.println(cachar.getNombre());
        pila.pop();
        if(pila.isEmpty()) System.out.println("Esta Vacia");
        pila2.add(1);
        pila2.add(2);
        pila2.add(3);
        cola.add(new Usuario("yo","libertad","6366991603"));
        cola.add(new Usuario("tu","sin","5555555555"));
        cola.add(new Usuario("forky","Disney Land","7147814636"));
        Usuario usr =cola.poll();
        System.out.println(usr.getNombre());
        cola.clear();
        pila.clear();
        Usuario cachar2 = cola.peek();
        System.out.println(cachar2.getNombre());

    }
}