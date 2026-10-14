/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividad4;

/**
 *
 * @author lychi
 */


public class Actividad4{
    static class NodoDoble{
        int dato;
        NodoDoble siguiente;
        NodoDoble anterior;

        NodoDoble(int dato){
            this.dato = dato;
            this.siguiente = null;
            this.anterior = null;
        }
    }
    static class ListaDoble{
        NodoDoble cabeza;
        void insertFinal(int dato){
            NodoDoble nuevo = new NodoDoble(dato);
            if (cabeza == null){
                cabeza = nuevo;
                return;
            }
            NodoDoble actual = cabeza;
            while (actual.siguiente != null){
                actual = actual.siguiente;
            }
            actual.siguiente = nuevo;
            nuevo.anterior = actual;
        }
        void mostrarSolicitudes(){
            NodoDoble actual = cabeza;
            while (actual != null){
                System.out.println("Solicitud " + actual.dato);
                actual = actual.siguiente;
            }
        }
    }
    static class NodoCircular{
        int dato;
        NodoCircular siguiente;

        NodoCircular(int dato){
            this.dato = dato;
            this.siguiente = null;
        }
    }
    static class ListaCircular{
        NodoCircular cabeza;
        void insertFinal(int dato){
            NodoCircular nuevo = new NodoCircular(dato);
            if (cabeza == null){
                cabeza = nuevo;
                nuevo.siguiente = cabeza;
                return;
            }
            NodoCircular actual = cabeza;
            while (actual.siguiente != cabeza){
                actual = actual.siguiente;
            }
            actual.siguiente = nuevo;
            nuevo.siguiente = cabeza;
        }
        void mostrarRonda(){
            if (cabeza == null){
                System.out.println("No hay solicitudes para revisar.");
                return;
            }
            NodoCircular actual = cabeza;
            while (true){
                System.out.println("Solicitud " + actual.dato);
                actual = actual.siguiente;

                if (actual == cabeza){
                    break;
                }
            }
            System.out.println("Fin de la ronda.");
        }
    }
    public static void main(String[] args){

        System.out.println("=== LISTA DOBLEMENTE ENLAZADA ===");

        ListaDoble listaDoble = new ListaDoble();

        listaDoble.insertFinal(101);
        listaDoble.insertFinal(102);
        listaDoble.insertFinal(103);

        System.out.println("Historial de solicitudes:");
        listaDoble.mostrarSolicitudes();

        System.out.println("=== LISTA CIRCULAR ===");

        ListaCircular listaCircular = new ListaCircular();

        listaCircular.insertFinal(201);
        listaCircular.insertFinal(202);
        listaCircular.insertFinal(203);

        System.out.println("Ronda de revision:");
        listaCircular.mostrarRonda();
    }
}
