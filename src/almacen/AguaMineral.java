package almacen;
public class AguaMineral extends Bebida {
    String origen;

    public AguaMineral() {}
    public AguaMineral(String id, String marca, double cantidad, double precio, String origen) {
        super(id, marca, cantidad, precio);
        this.origen = origen;
    }

    public void setOrigen(String origen) 
    {this.origen = origen;}
    
    public String getOrigen() 
    {return origen;}
    
}