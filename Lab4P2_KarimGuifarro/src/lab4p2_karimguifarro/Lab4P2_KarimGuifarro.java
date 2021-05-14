package lab4p2_karimguifarro;

import java.util.Random;
import java.util.Scanner;

public class Lab4P2_KarimGuifarro {

    public static Scanner KaOz = new Scanner(System.in);
    public static Random r = new Random();
    

    public static void main(String[] args) {
        String admin = "admin", contra = "1234", user, con;
        char q = 'c';
        while (q == 'c') {
            System.out.println("Ingrese el usuario");
            user = KaOz.nextLine();
            System.out.println("Ingrese la contraseña");
            con = KaOz.nextLine();
            if (user.equals(admin) && con.equals(contra)) {
                System.out.println("*****MENU*******\n"
                        + "1) Crear\n"
                        + "2) Listar\n"
                        + "3) Modificar\n"
                        + "4) Eliminar\n"
                        + "5) Salir");
                int p = KaOz.nextInt();
                switch (p) {
                    case 1: {
                    }
                }
            }

        }
    }
}
