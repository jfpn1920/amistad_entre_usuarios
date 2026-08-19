import java.util.Scanner;
public class amistad_entre_usuarios {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] usuariosEmisores = new String[10];
        String[] usuariosReceptores = new String[10];
        String[] fechas = new String[10];
        String[] estados = new String[10];
        int total = 0;
        int opcion;
        //----------------------------------------------//
        //--|menu_principal_de_amistad_entre_usuarios|--//
        //----------------------------------------------//
        do {
            System.out.println("menu principal de amistad entre usuarios");
            System.out.println("1) Registrar amistad");
            System.out.println("2) Editar amistad");
            System.out.println("3) Listar amistades");
            System.out.println("4) Buscar amistad");
            System.out.println("5) Eliminar amistad");
            System.out.println("6) Mostrar resumen");
            System.out.println("7) Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = entrada.nextInt();
            entrada.nextLine();
            switch (opcion) {
                //-----------------------//
                //--|registrar_amistad|--//
                //-----------------------//
                case 1:
                    if (total >= usuariosEmisores.length) {
                        System.out.println("No hay espacio para registrar mas amistades.");
                        break;
                    }
                    int id = total + 1;
                    System.out.println("registro de amistad entre usuarios");
                    System.out.println("id de la amistad a registrar: " + id);
                    System.out.print("nombre del usuario que envia la solicitud: ");
                    usuariosEmisores[total] = entrada.nextLine();
                    System.out.print("nombre del usuario que recibe la solicitud: ");
                    usuariosReceptores[total] = entrada.nextLine();
                    System.out.print("fecha de la solicitud: ");
                    fechas[total] = entrada.nextLine();
                    System.out.print("estado de la amistad: ");
                    estados[total] = entrada.nextLine();
                    System.out.println("Amistad registrada correctamente.");
                    total++;
                    break;
                //--------------------//
                //--|editar_amistad|--//
                //--------------------//
                case 2:
                    if (total == 0) {
                        System.out.println("No existen amistades registradas.");
                        break;
                    }
                    System.out.println("Datos de las amistades");
                    for (int i = 0; i < total; i++) {
                        System.out.println("ID: " + (i + 1) + " | Usuario emisor: " + usuariosEmisores[i] + " | Usuario receptor: " + usuariosReceptores[i] + " | Fecha: " + fechas[i] + " | Estado: " + estados[i]);
                    }
                    System.out.print("Ingrese el ID de la amistad: ");
                    int idEditar = entrada.nextInt();
                    entrada.nextLine();
                    if (idEditar >= 1 && idEditar <= total) {
                        int posicion = idEditar - 1;
                        System.out.println("Editar el dato de la amistad");
                        System.out.print("Nuevo nombre del usuario que envia la solicitud: ");
                        usuariosEmisores[posicion] = entrada.nextLine();
                        System.out.print("Nuevo nombre del usuario que recibe la solicitud: ");
                        usuariosReceptores[posicion] = entrada.nextLine();
                        System.out.print("Nueva fecha de la solicitud: ");
                        fechas[posicion] = entrada.nextLine();
                        System.out.print("Nuevo estado de la amistad: ");
                        estados[posicion] = entrada.nextLine();
                        System.out.println("Amistad actualizada correctamente.");
                    } else {
                        System.out.println("ID no encontrada.");
                    }
                    break;
                //----------------------//
                //--|listar_amistades|--//
                //----------------------//
                case 3:
                    if (total == 0) {
                        System.out.println("No existen amistades registradas.");
                    } else {
                        System.out.println("Lista de amistades entre usuarios");
                        for (int i = 0; i < total; i++) {
                            System.out.println("ID: " + (i + 1) + " | Usuario emisor: " + usuariosEmisores[i] + " | Usuario receptor: " + usuariosReceptores[i] + " | Fecha: " + fechas[i] + " | Estado: " + estados[i]);
                        }
                    }
                    break;
                //--------------------//
                //--|buscar_amistad|--//
                //--------------------//
                case 4:
                    if (total == 0) {
                        System.out.println("No existen amistades registradas.");
                        break;
                    }
                    System.out.println("busqueda de amistad");
                    System.out.print("ingresa la id para buscar amistad: ");
                    int idBusqueda = entrada.nextInt();
                    entrada.nextLine();
                    if (idBusqueda >= 1 && idBusqueda <= total) {
                        int posicion = idBusqueda - 1;
                        System.out.println("Datos de la amistad encontrada:");
                        System.out.println("ID: " + idBusqueda + " | Usuario emisor: " + usuariosEmisores[posicion] + " | Usuario receptor: " + usuariosReceptores[posicion] + " | Fecha: " + fechas[posicion] + " | Estado: " + estados[posicion]);
                    } else {
                        System.out.println("ID no encontrada.");
                    }
                    break;
                //----------------------//
                //--|eliminar_amistad|--//
                //----------------------//
                case 5:
                    if (total == 0) {
                        System.out.println("No existen amistades registradas.");
                        break;
                    }
                    System.out.println("Datos de las amistades");
                    for (int i = 0; i < total; i++) {
                        System.out.println("ID: " + (i + 1) + " | Usuario emisor: " + usuariosEmisores[i] + " | Usuario receptor: " + usuariosReceptores[i] + " | Fecha: " + fechas[i] + " | Estado: " + estados[i]);
                    }
                    System.out.print("Ingrese el ID de la amistad a eliminar: ");
                    int idEliminar = entrada.nextInt();
                    entrada.nextLine();
                    if (idEliminar >= 1 && idEliminar <= total) {
                        int posicion = idEliminar - 1;
                        for (int i = posicion; i < total - 1; i++) {
                            usuariosEmisores[i] = usuariosEmisores[i + 1];
                            usuariosReceptores[i] = usuariosReceptores[i + 1];
                            fechas[i] = fechas[i + 1];
                            estados[i] = estados[i + 1];
                        }
                        total--;
                        System.out.println("Amistad eliminada correctamente.");
                    } else {
                        System.out.println("ID no encontrada.");
                    }
                    break;
                //---------------------//
                //--|mostrar_resumen|--//
                //---------------------//
                case 6:
                    if (total == 0) {
                        System.out.println("No existen amistades registradas.");
                        break;
                    }
                    int pendientes = 0;
                    int aceptadas = 0;
                    int rechazadas = 0;
                    int otrosEstados = 0;
                    for (int i = 0; i < total; i++) {
                        if (estados[i].equalsIgnoreCase("Pendiente")) {
                            pendientes++;
                        } else if (estados[i].equalsIgnoreCase("Aceptada")) {
                            aceptadas++;
                        } else if (estados[i].equalsIgnoreCase("Rechazada")) {
                            rechazadas++;
                        } else {
                            otrosEstados++;
                        }
                    }
                    String usuarioMayor = usuariosReceptores[0];
                    int cantidadUsuarioMayor = 0;
                    for (int i = 0; i < total; i++) {
                        int cantidadUsuario = 0;
                        for (int j = 0; j < total; j++) {
                            if (usuariosReceptores[i].equalsIgnoreCase(usuariosReceptores[j])) {
                                cantidadUsuario++;
                            }
                        }
                        if (cantidadUsuario > cantidadUsuarioMayor) {
                            cantidadUsuarioMayor = cantidadUsuario;
                            usuarioMayor = usuariosReceptores[i];
                        }
                    }
                    System.out.println("resumen de amistad entre usuarios");
                    System.out.println("Amistades registradas: " + total);
                    System.out.println("Usuario con mas solicitudes recibidas: " + usuarioMayor);
                    System.out.println("Solicitudes pendientes: " + pendientes);
                    System.out.println("Amistades aceptadas: " + aceptadas);
                    System.out.println("Solicitudes rechazadas: " + rechazadas);
                    System.out.println("Otros estados: " + otrosEstados);
                    break;
                //------------------------------//
                //--|salir_del_menu_principal|--//
                //------------------------------//
                case 7:
                    System.out.println("Gracias por utilizar Amistad entre Usuarios.");
                    break;
                default:
                    System.out.println("Opcion no valida.");
            }
        } while (opcion != 7);
        entrada.close();
    }
}