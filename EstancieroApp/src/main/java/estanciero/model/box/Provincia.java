package estanciero.model.box;

public class Provincia implements ICasilla {
    private String nombreProvincia;

    private int nroProvincia;

    public String getNombreProvincia() {
        return nombreProvincia;
    }

    public void setNombreProvincia(String nombreProvincia) {
        this.nombreProvincia = nombreProvincia;
    }

    public int getNroProvincia() {
        return nroProvincia;
    }

    public void setNroProvincia(int nroProvincia) {
        this.nroProvincia = nroProvincia;
    }
}
