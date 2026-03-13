public class Estadistica {

    private int totalPartidos;
    private double promedioGoles;

    public Estadistica() {
    }

    public void calcularEstadistica(Equipo equipo){
        System.out.println("Calculando estadísticas del equipo: " + equipo.getnombreEquipo());
    }

    public void calcularEstadistica(Jugador jugador){
        System.out.println("Calculando estadísticas del jugador");
    }
}