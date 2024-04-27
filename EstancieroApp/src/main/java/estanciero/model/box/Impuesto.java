package estanciero.model.box;

public class Impuesto implements ICasilla{
    private double impuesto;

    public double getImpuesto() {
        return impuesto;
    }

    public void setImpuesto(double impuesto) {
        this.impuesto = impuesto;
    }

    public String MostrarImpuesto(){
        return "EL IMPUESTO ES DE "+ impuesto;
    }
}
