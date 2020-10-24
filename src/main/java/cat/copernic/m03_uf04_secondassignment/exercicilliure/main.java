package cat.copernic.m03_uf04_secondassignment.exercicilliure;

public class main {
    public static void main(String[] args) {
        System.out.println("Tarea: ");

        CarritoDeLaCompra cesta = new CarritoDeLaCompra();

            Detalle articuloA = new Detalle(1,2, new Tecnologia(15281,"Ipad","Marca Manzana", 379));
            Detalle articuloB = new Detalle(2,1, new Ropa(7351, "Men Sweatshirt Steven","Sudadera de la marca Fila en color gris y negro", 46.28));
            Detalle articuloC = new Detalle(3,1, new Farmacia(1, "Pack de 3 mascarillas Homologadas", "Mascarillas negras de tela reutilizable", 19.99));

            cesta.afegir(articuloA);
            cesta.afegir(articuloB);
            cesta.afegir(articuloC);
                            
            //creamos una variable que va a contener el precio total de la compra
            //y otra que usaremos para no duplicar el mismo mensaje todo el rato
            double precioTotal;
            String respuesta = "    Precio total de la compra: ";

            System.out.println("Prueba de añadir el elemento de la array\n");
            
            try {
                //mostramos el cesta de la compra mediante la asignacion de total ya que al llamar al checkout se activa el System.out.println
                //además cogemos el valor de la suma del precio de los productos
                precioTotal = cesta.checkout();
                //mostramos lo que valen todos los productos juntos
                System.out.println(respuesta+precioTotal+"\n");
                
                System.out.println("Prueba de eliminar elemento de la array\n");
                //eliminamos del cesta el articulo en la 2a posicion
                cesta.elimina(articuloB);
                //volvemos a mostrar tanto el carro con el 2o elemento eliminado como el valor total modificado
                precioTotal= cesta.checkout();
                System.out.println(respuesta+precioTotal+"\n");
            } catch (Exception e) {
                e.printStackTrace();
            }
            
            try {
                System.out.println("Prueba de eliminar elemento de la array y añadir otro\n");
                cesta.elimina(articuloC);
                cesta.afegir(articuloB);
                precioTotal= cesta.checkout();
                System.out.println(respuesta+precioTotal);
            } catch (Exception e) {
                e.printStackTrace();
            }
            
    }
}
