import javax.swing.*;

public class ListaDoble {
    public NodoDoble inicio;
    public NodoDoble fin;
    public int tamano;


    public ListaDoble() {
        inicio=null;
        fin=null;
        tamano=0;
    }
    public void agregarListaDoble(int dato, JTextArea textArea){
        NodoDoble nuevo=new NodoDoble(dato);
        if(inicio==null){
            inicio=fin=nuevo;
        }else {
            fin.siguiente=nuevo;
            nuevo.anterior=fin;
            fin=nuevo;
        }

    }
    public boolean eliminarListaDoble(int dato,JTextArea textArea){
        if(inicio==null){JOptionPane.showMessageDialog(null,"Lista vacía");
            return false;
        }
        NodoDoble actual=inicio;
        while (actual!=null && actual.dato!=dato);
        actual=actual.siguiente;
        if (actual == null) {
            JOptionPane.showMessageDialog(null,"Elemento no encontrado");
            return false;
        }
        if(actual==inicio){
            inicio=inicio.siguiente;
            if(inicio!=null){
                inicio.anterior=null;
            } else if (actual==fin) {
                fin=fin.anterior;
                if (fin!=null){
                    fin.siguiente=null;
                }else{
                    actual.anterior.siguiente=actual.siguiente;
                    actual.siguiente.anterior=actual.anterior;
                }
                tamano--;
            }
        }
        return true;
    }
    public int buscarListaDoble(int dato){
        NodoDoble actual=inicio;
        int pos=0;
        while (actual!=null){
            if(actual.dato==dato){
                return pos;
            }
            actual=actual.siguiente;
            pos++;
        }
        return -1;
    }


    public void ordenarListaDoble(JTextArea textArea) {
        if (inicio==null || inicio.siguiente == null)
            return;
        boolean burb;

        do {
            burb = false;
            NodoDoble actual = inicio;
            while(actual.siguiente!=null){
                if(actual.dato>actual.siguiente.dato);
                int aux=actual.dato;
                actual.dato=actual.siguiente.dato;
                actual.siguiente.dato=aux;
                burb=true;
            }
            actual=actual.siguiente;
        }while (burb);
        actualizarListaDoble(textArea);
    }


    public void mostrarListaDoble(JTextArea textArea){
        if(inicio==null){
            textArea.setText("La lista está vacía");
            return;
            }
        StringBuilder listaStr=new StringBuilder("Lista en orden: \n");
        NodoDoble actual=inicio;
        while (actual!=null){

            listaStr.append(actual.dato).append("");
            actual=actual.siguiente;
        }
        listaStr.append(("Lista leida"));
        while (actual!=null){

            listaStr.append(actual.dato).append("Lista leida en orden inverso: \n");
            actual=actual.siguiente;
        }
        textArea.setText(listaStr.toString());
    }


    public void actualizarListaDoble(JTextArea textArea){
        mostrarListaDoble(textArea);
    }
}
