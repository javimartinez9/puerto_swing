package packB02;

public class Contenedor {

    private int idContenedor;
    private float peso;
    private String pais;
    private boolean inspeccionado;
    private int prioridad;
    private String descripcion;
    private String empresa_enviadora;
    private String empresa_receptora;

    public Contenedor(){

    }

    public Contenedor(int idContenedor, float peso, String pais, boolean inspeccionado, int prioridad, String descripcion, String empresa_enviadora, String empresa_receptora) {
        this.idContenedor = idContenedor;
        this.peso = peso;
        this.pais = pais;
        this.inspeccionado = inspeccionado;
        this.prioridad = prioridad;
        this.descripcion = descripcion;
        this.empresa_enviadora = empresa_enviadora;
        this.empresa_receptora = empresa_receptora;
    }

    public int getIdContenedor() {
        return idContenedor;
    }

    public void setIdContenedor(int idContenedor) {
        this.idContenedor = idContenedor;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public boolean isInspeccionado() {
        return inspeccionado;
    }

    public void setInspeccionado(boolean inspeccionado) {
        this.inspeccionado = inspeccionado;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEmpresa_enviadora() {
        return empresa_enviadora;
    }

    public void setEmpresa_enviadora(String empresa_enviadora) {
        this.empresa_enviadora = empresa_enviadora;
    }

    public String getEmpresa_receptora() {
        return empresa_receptora;
    }

    public void setEmpresa_receptora(String empresa_receptora) {
        this.empresa_receptora = empresa_receptora;
    }
}
