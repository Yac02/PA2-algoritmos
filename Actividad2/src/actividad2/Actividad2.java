package actividad2;

public class Actividad2 {

    // 1. Definición del Nodo fuera del main
    static class Nodo {
        int idSolicitud;
        Nodo siguiente;

        public Nodo(int idSolicitud) {
            this.idSolicitud = idSolicitud;
            this.siguiente = null;
        }
    }

    // 2. Definición del Gestor fuera del main
    static class GestorSolicitudes {
        Nodo cabeza;

        // Recorrido completo de la lista
        public void recorrer() {
            Nodo actual = cabeza;
            System.out.print("Secuencia de solicitudes: ");
            while (actual != null) {
                System.out.print(actual.idSolicitud + " -> ");
                actual = actual.siguiente;
            }
            System.out.println("null");
        }

        // Inserción al inicio 
        public void insertarInicio(int idSolicitud) {
            Nodo nuevo = new Nodo(idSolicitud);
            nuevo.siguiente = cabeza;
            cabeza = nuevo;
        }

        // Inserción al final 
        public void insertarFinal(int idSolicitud) {
            Nodo nuevo = new Nodo(idSolicitud);
            if (cabeza == null) {
                cabeza = nuevo;
                return;
            }
            Nodo actual = cabeza;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevo;
        }

        // Inserción después de un nodo dado
        public void insertarDespuesDe(int idExistente, int nuevoId) {
            Nodo actual = cabeza;
            while (actual != null && actual.idSolicitud != idExistente) {
                actual = actual.siguiente;
            }
            if (actual == null) {
                System.out.println("Error: La solicitud no existe.");
                return;
            }
            Nodo nuevo = new Nodo(nuevoId);
            nuevo.siguiente = actual.siguiente;
            actual.siguiente = nuevo;
        }
    }

    // 3. Ejecutar y probar
    public static void main(String[] args) {
        GestorSolicitudes gestor = new GestorSolicitudes();
        
        System.out.println("=== PRUEBA DE ALGORITMOS - ACTIVIDAD 2 ===");
        
        // 1. Inserción al inicio
        System.out.println("\n-> Insertando (101) al inicio:");
        gestor.insertarInicio(101);
        gestor.recorrer();
        
        // 2. Inserción al final
        System.out.println("\n-> Insertando (102 y 104) al final:");
        gestor.insertarFinal(102);
        gestor.insertarFinal(104);
        gestor.recorrer();
        
        // 3. Inserción después de un nodo
        System.out.println("\n-> Reubicando nuevo (103) despues del caso (102):");
        gestor.insertarDespuesDe(102, 103); 
        gestor.recorrer();
        
        System.out.println("==========================================");
    }
}