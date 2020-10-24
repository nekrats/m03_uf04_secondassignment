
package cat.copernic.m03_uf04_secondassignment;

public abstract class Dispositivos implements Conectable {

    private String nombre;

    private String descripcion;

    private double precio;


    public Dispositivos(String nombre, String descripcion, double precio){

        this.nombre = nombre;

        this.descripcion = descripcion;

        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public String getNombre(){
        return nombre;
    }
    @Override
    public String toString(){
        return "Dispositivo{"+ " nombre: "+nombre+ " descripcion: "+descripcion+ " precio: "+precio+"}";
    }

    @Override
    public void conecta(){
        System.out.println("Dispositivo conectado");
    }

    @Override
    public void desconecta(){
        System.out.println("Dispositivo desconectado");
    }
    
}