import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("=== SISTEMA DE GESTION DE TORNEOS ===");

        // Nombre torneo
        System.out.println("Ingrese nombre del torneo:");
        String nombreTorneo = scanner.nextLine();

        // Fecha inicio
        LocalDate fechaInicio = null;

        while (fechaInicio == null) {
            try {
                System.out.println("Ingrese fecha de inicio (dd/MM/yyyy):");
                fechaInicio = LocalDate.parse(scanner.nextLine(), formatter);
            } catch (DateTimeParseException e) {
                System.out.println("Formato incorrecto. Intente nuevamente.");
            }
        }

        // Fecha fin
        LocalDate fechaFin = null;

        while (fechaFin == null) {
            try {
                System.out.println("Ingrese fecha de fin (dd/MM/yyyy):");
                fechaFin = LocalDate.parse(scanner.nextLine(), formatter);
            } catch (DateTimeParseException e) {
                System.out.println("Formato incorrecto. Intente nuevamente.");
            }
        }

        Torneo torneo = new Torneo(nombreTorneo, fechaInicio.toString(), fechaFin.toString());
        torneo.crearTorneo();

        // Crear sede
        System.out.println("Ingrese nombre de la sede:");
        String nombreSede = scanner.nextLine();

        System.out.println("Ingrese calle:");
        String calle = scanner.nextLine();

        System.out.println("Ingrese número:");
        int numero = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Ingrese ciudad:");
        String ciudad = scanner.nextLine();

        Sede sede = new Sede(nombreSede, calle, numero, ciudad);
        torneo.asignarSede(sede);

        // Equipos
        System.out.println("Ingrese nombre del equipo 1:");
        String nombreEquipo1 = scanner.nextLine();

        System.out.println("Ingrese ciudad del equipo 1:");
        String ciudadEquipo1 = scanner.nextLine();

        Equipo equipo1 = new Equipo(nombreEquipo1, ciudadEquipo1);

        System.out.println("Ingrese nombre del equipo 2:");
        String nombreEquipo2 = scanner.nextLine();

        System.out.println("Ingrese ciudad del equipo 2:");
        String ciudadEquipo2 = scanner.nextLine();

        Equipo equipo2 = new Equipo(nombreEquipo2, ciudadEquipo2);

        torneo.agregarEquipo(equipo1);
        torneo.agregarEquipo(equipo2);

        // Fecha partido con validación
        LocalDate fechaPartido = null;

        while (fechaPartido == null) {
            try {
                System.out.println("Ingrese fecha del partido (dd/MM/yyyy):");
                LocalDate fechaIngresada = LocalDate.parse(scanner.nextLine(), formatter);

                if (fechaIngresada.isBefore(fechaInicio) || fechaIngresada.isAfter(fechaFin)) {
                    System.out.println("La fecha está fuera del rango del torneo. Intente nuevamente.");
                } else {
                    fechaPartido = fechaIngresada;
                }

            } catch (DateTimeParseException e) {
                System.out.println("Formato incorrecto. Intente nuevamente.");
            }
        }

        // Hora partido
        System.out.println("Ingrese hora del partido:");
        String horaPartido = scanner.nextLine();

        Partido partido = new Partido(fechaPartido.toString(), horaPartido);

        partido.asignarEquipos(equipo1, equipo2);

        // Resultado
        System.out.println("Ingrese resultado del partido");
        String resultado = scanner.nextLine();

        partido.registrarResultado(resultado);

        torneo.agregarPartido(partido);

        System.out.println("Partido agregado correctamente al torneo.");

        scanner.close();
    }
}