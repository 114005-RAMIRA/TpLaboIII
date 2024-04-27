package estanciero.model.box;

public class Zonas implements ICasilla {
    private String nombreZona;

    private int nroZona;

    public int getNroZona() {
        return nroZona;
    }

    public void setNroZona(int nroZona) {
        this.nroZona = nroZona;
    }

    public String getNombreZona() {
        return nombreZona;
    }

    public void setNombreZona(String nombreZona) {
        this.nombreZona = nombreZona;
    }
}
