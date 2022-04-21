package almacen;

public class Datos {
    private Bebida[][] estanteria;
    
    public Datos (int f, int c) {
        estanteria=new Bebida[f][c];
    }
    public Datos () {
        estanteria=new Bebida[5][5];
    } 
    /*for(int i=0;i<estanteria.length;i++){
        for(int x=0;x<estanteria[0].length;x++){}*/
        
     public void agregarBebida (Bebida a){  
         boolean espacio=false;
         for(int i=0;i<estanteria.length && !espacio;i++){
             for(int x=0;x<estanteria[0].length && !espacio;x++){
                 if(estanteria[i][x]==null){
                    estanteria[i][x]=a;
                    espacio=true;
                 }
             }
         }
      if(espacio){
          System.out.print("Bebida agregada");
      }else{
          System.out.print("Bebida no agregada");
       }
    
     }
     
     public void eliminarBebida (int id){
         boolean espacio=false;
         for(int i=0;i<estanteria.length && !espacio;i++){
             for(int x=0;x<estanteria[0].length && !espacio;x++){
                 if(estanteria[i][x]!=null){
                    if(estanteria[i][x].getId().equals(id)){
                    estanteria[i][x]=null;
                    espacio=true;
                    }
                 }
             }
         }
         
      if(espacio){
          System.out.print("Bebida eliminada");
      }else{
           System.out.print("No existe la bebida");
        }
    
     }

      public double calcularBebida(){
        double precioTotal=0;
        for(int i=0;i<estanteria.length;i++){
            for(int x=0;x<estanteria[i].length;x++){
                
            }
        }
        return precioTotal;
      }
      
        public void mostrarBebidas (){

         for(int i=0;i<estanteria.length;i++){
             for(int x=0;x<estanteria[0].length;x++){
                 if(estanteria[i][x]!=null){
                     System.out.println("fila: "+i+",columna:"+x+" Bebida: "+estanteria[i][x].toString());
                    }
                 }
             }
         }  
      
}
