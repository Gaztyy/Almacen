package almacen;
public class BebidaAzucarada extends Bebida {
    double porcentajeAzucar;
    boolean promo;

    public BebidaAzucarada() {}
    public BebidaAzucarada(String id, String marca, double cantidad, double precio, double porcentajeAzucar, boolean promo) {
        super(id, marca, cantidad, precio);
        this.porcentajeAzucar = porcentajeAzucar;
        this.promo = promo;
    }

    public void setPromo(boolean promo) {this.promo = promo;}
    public void setPorcentajeAzucar(double porcentajeAzucar) {this.porcentajeAzucar = porcentajeAzucar;}
    
    public boolean getPromo() {return promo;}
    public double getPorcentajeAzucar() {return porcentajeAzucar;}
    
    }