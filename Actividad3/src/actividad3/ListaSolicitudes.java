package actividad3;

public class ListaSolicitudes 
{
    private Nodo cabeza;
    
    public ListaSolicitudes()
    {
        this.cabeza = null;
    }
    
    public Nodo getCabeza()
    {
        return cabeza;
    }
    
    public void insertarInicio(int id, String solicitante,
                                 String tipo, String estado)
    {
        Nodo nuevo = new Nodo(id, solicitante, tipo, estado);
        nuevo.siguiente = cabeza;
        cabeza = nuevo;
    }
    
    public void InsertarFinal(int id, String solicitante, String tipo, String estado)
    {
        Nodo nuevo = new Nodo(id, solicitante, tipo, estado);
        if(cabeza == null)
        {
            cabeza = nuevo;
            return;
        }
        
        Nodo actual = cabeza;
        while(actual.siguiente != null)
        {
            actual = actual.siguiente;
        }
        
        actual.siguiente = nuevo;
    }
    
    public Nodo buscarPorID(int idBusca)
    {
        Nodo actual = cabeza;
        while(actual != null)
        {
            if(actual.idSolicitud == idBusca)
            {
                return actual;
            }
            actual = actual.siguiente;
        }
        return null;
    }
    
    public boolean modificarSolicitud(int id, String nuevoEstado, String nuevotipo)
    {
        Nodo nodo = buscarPorID(id);
        if(nodo != null)
        {
            nodo.estado = nuevoEstado;
            nodo.tipoAtencion = nuevotipo;
            return true;
        }
        return false;
    }
    
    public boolean eliminarPorID(int id)
    {
        if(cabeza == null)
        {
            return false;
        }
        
        if(cabeza.idSolicitud == id)
        {
            cabeza = cabeza.siguiente;
            return true;
        }
        
        Nodo anterior = cabeza;
        Nodo actual = cabeza.siguiente;
        
        while(actual != null)
        {
            if(actual.idSolicitud == id)
            {
                anterior.siguiente = actual.siguiente;
                actual.siguiente = null;
                return true;
            }
            anterior = actual;
            actual = actual.siguiente;
        }
        return false;
    }
    
    public void mostrarLista()
    {
        if (cabeza == null)
        {
            System.out.println("La Lista de Solicitud esta vacia...");
            return;
        }
        Nodo actual = cabeza;
        System.out.println(" ----Lista de Solicitudes---- ");
        while(actual != null)
        {
            System.out.println(" ID : " + actual.idSolicitud
                               + " Solicitante : " + actual.solicitante
                               + " Tipo : " + actual.tipoAtencion
                               + " Estado : " + actual.estado);
            actual = actual.siguiente;
        }
        System.out.println("-------------------------------");
    }
}
