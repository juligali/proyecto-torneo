public class Partido {

    private String fecha;
    private String hora;
    private String resultado;
    private String estado;

    private Equipo equipo1;
    private Equipo equipo2;

    public Partido(String fecha, String hora) {
        this.fecha = fecha;
        this.hora = hora;
        this.estado = "programado";
    }

    public void asignarEquipos(Equipo e1, Equipo e2){
        this.equipo1 = e1;
        this.equipo2 = e2;
    }

    public void registrarResultado(String resultado){
        this.resultado = resultado;
        this.estado = "finalizado";
    }

    public void notificarCambioHorario(){
        System.out.println("El horario del partido ha sido modificado");
    }
}