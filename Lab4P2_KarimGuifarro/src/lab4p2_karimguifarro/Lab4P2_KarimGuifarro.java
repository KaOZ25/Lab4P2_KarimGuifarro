package lab4p2_karimguifarro;

import java.io.IOException;
import java.util.*;

public class Lab4P2_KarimGuifarro {

    public static Scanner KaOz = new Scanner(System.in);
    public static Random r = new Random();
    public static ArrayList<proyectos> proyect = new ArrayList();
    public static ArrayList<Empleados> empleado = new ArrayList();
    public static ArrayList<Login> Log = new ArrayList();

    public static void main(String[] args) {
        String ar = "admin", cont = "1234";
        Log.add(new Login(ar, cont));
        String use, con;
        char q = 'c';
        while (q == 'c') {
            System.out.println("GBX Log in");
            System.out.println("Ingrese el usuario");
            use = KaOz.nextLine();
            System.out.println("Ingrese la contraseña");
            con = KaOz.nextLine();
            while (use.equals(ar) && con.equals(cont)) {
                System.out.println("*****MENU*******\n"
                        + "1) Crear empleados\n"
                        + "2) Crear proyectos"
                        + "3) Listar\n"
                        + "4) Modificar\n"
                        + "5) Eliminar empleados\n"
                        + "6) Salir");
                int p = KaOz.nextInt();
                switch (p) {
                    case 1: {
                        String nombre, apellido, ID, nacionalidad, user = " ", contra = " ";
                        int años_contrato, sueldo_mensual, poyectos_realizados, proyectos_asignados;
                        System.out.println("Ingrese el nombre");
                        nombre = KaOz.next();
                        System.out.println("Ingrese el apellido:");
                        apellido = KaOz.next();
                        System.out.println("Ingrese el ID:");
                        ID = KaOz.next();
                        System.out.println("Ingrese la nacionalidad:");
                        nacionalidad = KaOz.next();
                        System.out.println("Años del contrato:");
                        años_contrato = KaOz.nextInt();
                        System.out.println("Cantidad de proyectos realizados:");
                        poyectos_realizados = KaOz.nextInt();
                        System.out.println("Proyectos asignados:");
                        proyectos_asignados = 0;
                        System.out.println("1)Desarrollador\n"
                                + "2) Director\n"
                                + "3) Consultor\n"
                                + "4) Empleado normal");
                        int opcion = KaOz.nextInt();
                        switch (opcion) {
                            case 1: {
                                System.out.println("DESARROLLADOR");
                                int años_exp, horas_trabajo;
                                String lenguaje_fav;
                                System.out.println("Ingrese años de experiencia:");
                                años_exp = KaOz.nextInt();
                                System.out.println("Ingrese horas de trabajo:");
                                horas_trabajo = KaOz.nextInt();
                                System.out.println("Ingrese su lenguaje de programacion favorito:");
                                lenguaje_fav = KaOz.next();
                                sueldo_mensual = (poyectos_realizados * 115000 * 2) / proyectos_asignados;
                                System.out.println("usuario");
                                user = "des-" + KaOz.next();
                                System.out.println("contrseña");
                                contra = KaOz.next();
                                Log.add(new Login(user, contra));
                                empleado.add(new desarrolladores(años_exp, horas_trabajo, lenguaje_fav, nombre, apellido, ID, nacionalidad, user, contra, años_contrato, sueldo_mensual, poyectos_realizados));
                            }
                            break;
                            case 2: {
                                try {
                                    double bul = 4.13;
                                    int dul = (int) bul;
                                    System.out.println("DIRECTOR");
                                    int años_puesto;
                                    ArrayList<String> des_asignados = null;
                                    System.out.println("Ingrese sus años en el puesto:");
                                    años_puesto = KaOz.nextInt();
                                    sueldo_mensual = (proyectos_asignados * 13280 * dul) / (proyectos_asignados + años_contrato);
                                    System.out.println("Usario:");
                                    user = "dir-" + KaOz.next();
                                    System.out.println("Contraseña:");
                                    contra = KaOz.next();
                                    Log.add(new Login(user, contra));
                                    empleado.add(new directores(años_puesto, des_asignados, nombre, apellido, ID, nacionalidad, user, contra, años_contrato, sueldo_mensual, poyectos_realizados));
                                } catch (Exception ie) {
                                    System.out.println("Error a la hora de crear director");
                                }
                            }
                            break;
                            case 3: {
                                try {
                                    System.out.println("CONSULTORES");
                                    int tiempo_consulta;
                                    String campo_exp;
                                    System.out.println("Ingrese el tiempo de consulta:");
                                    tiempo_consulta = KaOz.nextInt();
                                    System.out.println("Ingrese su campo de experiencia:");
                                    campo_exp = KaOz.next();
                                    sueldo_mensual = 0;
                                    System.out.println("Usario:");
                                    user = "con-" + KaOz.next();
                                    System.out.println("Contraseña:");
                                    contra = KaOz.next();
                                    Log.add(new Login(user, contra));
                                    empleado.add(new consultores(tiempo_consulta, campo_exp, nombre, apellido, ID, nacionalidad, user, contra, años_contrato, sueldo_mensual, poyectos_realizados));
                                } catch (Exception ie) {
                                    System.out.println("Error a la hora de crear consultor");
                                }
                            }
                            break;
                            case 4: {
                                System.out.println("Usario:");
                                user = "nor" + KaOz.next();
                                System.out.println("Contraseña:");
                                contra = KaOz.next();
                                sueldo_mensual = (12000 * 8) / 2;
                                Log.add(new Login(user, contra));
                                empleado.add(new Empleados(nombre, apellido, ID, nacionalidad, user, contra, años_contrato, sueldo_mensual, poyectos_realizados));
                            }
                        }
                    }
                    break;
                    case 2: {
                        String nombre, empresa, estado;
                        int duracion, cant1, cant2, cant3, tot = 0;
                        ArrayList<Empleados> emple = null;
                        System.out.println("Ingrese el nombre del proyecto:");
                        nombre = KaOz.next();
                        System.out.println("Ingrese la empresa:");
                        empresa = KaOz.next();
                        System.out.println("Ingrese el estdo del proyecto:");
                        System.out.println("1) Iniciado\n"
                                + "2) En desarrollo\n"
                                + "3) Terminado");
                        int pu = KaOz.nextInt();
                        switch (pu) {
                            case 1: {
                                estado = "Iniciado";
                            }
                            break;
                            case 2: {
                                estado = "En Desarrollo";
                            }
                            break;
                            case 3: {
                                estado = "Terminado";
                            }
                            break;
                        }
                        System.out.println("Cuantos coordinadores desea tener?");
                        cant1 = KaOz.nextInt();
                        while (cant1 > 2) {
                            System.out.println("Vuelva a ingresar los datos");
                            cant1 = KaOz.nextInt();
                        }
                        System.out.println("Cuantos consultore desea asginar?");
                        cant2 = KaOz.nextInt();
                        while (cant2 > 3) {
                            System.out.println("Vuelva a ingresar los datos");
                            cant2 = KaOz.nextInt();
                        }
                        System.out.println("Cuantos desarrolladores desea asignar?");
                        cant3 = KaOz.nextInt();
                        while (cant3 > 5) {
                            System.out.println("Vuelva a ingresar los datos");
                            cant3 = KaOz.nextInt();
                        }
                        tot = cant1 + cant2 + cant3;
                        for (int i = 0; i < tot; i++) {
                            if (i < cant1) {
                                System.out.println("Elija a su director");
                                empleados();
                                emple.add(empleado.get(i));
                            } else if (i < cant2) {
                                System.out.println("Elija a sus consultores");
                                empleados();
                                emple.add(empleado.get(i));
                            } else if (i < cant3) {
                                System.out.println("Elija a sus dearrolladores");
                                empleados();
                                emple.add(empleado.get(i));
                            }

                        }
                    }
                    break;
                    case 3: {
                        empleados();
                        System.out.println("");
                        pory();
                    }
                    break;
                    case 4: {
                        empleados();
                        System.out.println("Que desea modificar:");
                        int mod = KaOz.nextInt();
                        while (mod < 0 || mod > empleado.size()) {
                            System.out.println("No existe este detective");
                            empleados();
                            System.out.println("Igrese de nuevo el valor:");
                        }
                        empleado.remove(mod);
                    }
                    break;
                    case 5: {

                    }
                    break;
                    case 6:{
                        q='n';
                    }
                }
            }

        }
    }

    public static void empleados() {
        for (int i = 0; i < empleado.size(); i++) {
            System.out.println(empleado.get(i));
        }
    }

    public static void pory() {
        for (int i = 0; i < proyect.size(); i++) {
            System.out.println(proyect.get(i));
        }

    }

}
