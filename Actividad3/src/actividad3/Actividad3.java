package actividad3;

import java.util.Scanner;

public class Actividad3 
{

    public static void main(String[] args) 
    {
        ListaSolicitudes lista = new ListaSolicitudes();
        Scanner sc = new Scanner(System.in);
        int opcion;
        
        //Datos
        lista.InsertarFinal(101, "Ana Torres", "Soporte tecnico", "Pendiente");
        lista.InsertarFinal(102, "Luis Ramirez", "Consulta", "Pendiente");
        lista.InsertarFinal(103, "Maria Lopez", "Reclamo", "En proceso");
        lista.InsertarFinal(104, "Carlos Diaz", "Soporte tecnico", "Pendiente");
        
        do
        {
            System.out.println("\n===== GESTION DE SOLICITUDES =====");
            System.out.println("1. Insertar al inicio");
            System.out.println("2. Insertar al final");
            System.out.println("3. Buscar por ID");
            System.out.println("4. Modificar solicitud");
            System.out.println("5. Eliminar solicitud");
            System.out.println("6. Mostrar lista");
            System.out.println("0. Salir");
            System.out.print("Opcion: ");
            opcion = sc.nextInt();
            sc.nextLine();
            
            
            switch (opcion) {
                case 1: {
                    System.out.print("ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Solicitante: ");
                    String sol = sc.nextLine();
                    System.out.print("Tipo de atencion: ");
                    String tipo = sc.nextLine();
                    System.out.print("Estado: ");
                    String est = sc.nextLine();
                    lista.insertarInicio(id, sol, tipo, est);
                    System.out.println("Solicitud insertada al inicio.");
                    break;
                }
                case 2: {
                    System.out.print("ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Solicitante: ");
                    String sol = sc.nextLine();
                    System.out.print("Tipo de atencion: ");
                    String tipo = sc.nextLine();
                    System.out.print("Estado: ");
                    String est = sc.nextLine();
                    lista.InsertarFinal(id, sol, tipo, est);
                    System.out.println("Solicitud insertada al final.");
                    break;
                }
                case 3: {
                    System.out.print("ID a buscar: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    Nodo encontrado = lista.buscarPorID(id);
                    if (encontrado != null) {
                        System.out.println("Encontrado -> ID: " + encontrado.idSolicitud
                                + " | Solicitante: " + encontrado.solicitante
                                + " | Tipo: " + encontrado.tipoAtencion
                                + " | Estado: " + encontrado.estado);
                    } else {
                        System.out.println("No se encontro la solicitud con ID " + id);
                    }
                    break;
                }
                case 4: {
                    System.out.print("ID a modificar: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nuevo estado: ");
                    String est = sc.nextLine();
                    System.out.print("Nuevo tipo de atencion: ");
                    String tipo = sc.nextLine();
                    if (lista.modificarSolicitud(id, est, tipo)) {
                        System.out.println("Solicitud modificada correctamente.");
                    } else {
                        System.out.println("No se encontro la solicitud con ID " + id);
                    }
                    break;
                }
                case 5: {
                    System.out.print("ID a eliminar: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    if (lista.eliminarPorID(id)) {
                        System.out.println("Solicitud eliminada correctamente.");
                    } else {
                        System.out.println("No se encontro la solicitud con ID " + id);
                    }
                    break;
                }
                case 6: {
                    lista.mostrarLista();
                    break;
                }
                case 0: {
                    System.out.println("Saliendo del sistema...");
                    break;
                }
                default: {
                    System.out.println("Opcion no valida.");
                }
            }
        } while (opcion != 0);
        
        sc.close();
    }
    
}
