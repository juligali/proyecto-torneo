public class Evento {

    private String tipo;
    private String fecha;
    private String descripcion;

    public Evento(String tipo, String fecha, String descripcion) {
        this.tipo = tipo;
        this.fecha = fecha;
        this.descripcion = descripcion;
    }

    // este metodo no se usa
    public String getDetalleEvento() {
        return "Tipo: " + tipo +
                " | Fecha: " + fecha +
                " | Descripción: " + descripcion;
    }
}