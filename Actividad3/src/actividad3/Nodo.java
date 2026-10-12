package actividad3;

public class Nodo 
{
    int idSolicitud;
    String solicitante;
    String tipoAtencion;
    String estado;
    Nodo siguiente;
    
    public Nodo(int idSolicitud, String solicitante, String tipoAtencion, String estado)
    {
        this.idSolicitud = idSolicitud;
        this.solicitante = solicitante;
        this.tipoAtencion = tipoAtencion;
        this.estado = estado;
    }
    
    
}
