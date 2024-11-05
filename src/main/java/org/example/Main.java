
package org.example;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static <DoctoresDAO> void main(String[] args) {

        String url = "jdbc:mysql://localhost:3314/Hospital";
        String usuario = "root";
        String contrasena = "1234";

        try {
            DoctoresDAO doctoresDAO = new DoctoresDAOimpl.DoctoresDAOimpl(url, usuario, contrasena);
            Scanner scanner = new Scanner(System.in);
            int opcion;

            switch (opcion) {
                case 1: // Registrar
                    System.out.print("# ID tarjeta: ");
                    String Id_tarjeta = scanner.nextLine();
                    System.out.print("Nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Apellido: ");
                    String apellido = scanner.nextLine();
                    System.out.print("Telefono: ");
                    int telefono = scanner.nextInt();
                    System.out.print("Direccion: ");
                    String direccion = scanner.nextLine();
                    System.out.print("Especialidad: ");
                    String Especialidad = scanner.nextLine();
                    System.out.print("Universidad: ");
                    String Universidad = scanner.nextLine();



                    Doctores doctores = new Doctores(Id_tarjeta, nombre, apellido, telefono, direccion, Especialidad, Universidad);
                    doctoresDAO.crear(doctores);
                    System.out.println("Doctor registrado.");
                    break;



                }
            }
        }
    }
}