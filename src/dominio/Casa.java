package dominio;

public class Casa extends Inmueble implements Arrendable {

    

    @Override
    public void arrendar() {

    }

    @Override
    public void devolver() {

    }


    @Override
    public String toString() {
        String mensaje ="direccion: " + this.getdireccion() + " Valor venta: " + this.getvalorVenta() + " Valor arriendo:"
                + this.getvalorArriendo();
        return mensaje;
    }
}
