public class Reporte {

    private String fechaGeneracion;
    private String tipoReporte;

    //no se usan
    public Reporte(String fechaGeneracion, String tipoReporte) {
        this.fechaGeneracion = fechaGeneracion;
        this.tipoReporte = tipoReporte;
    }

    public void generarReporte(Torneo torneo){
        System.out.println("Generando reporte del torneo: " + torneo.getNombre());
    }

    public void exportarPDF(){
        System.out.println("Exportando reporte a PDF...");
    }
}