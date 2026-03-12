import java.util.ArrayList;
import java.util.List;

public class Equipo {

    private String nombreEquipo;
    private String ciudadOrigen;
    private List<Jugador> jugadores;

    public Equipo(String nombreEquipo, String ciudadOrigen) {
        this.nombreEquipo = nombreEquipo;
        this.ciudadOrigen = ciudadOrigen;
        this.jugadores = new ArrayList<>();
    }

    public void asignarJugador(Jugador jugador){
        jugadores.add(jugador);
    }

    public void eliminarJugador(Jugador jugador){
        jugadores.remove(jugador);
    }
}