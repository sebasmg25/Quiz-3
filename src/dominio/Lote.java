package dominio;

public class Lote extends Inmueble {


    @Override
    public String toString() {
        String mensaje ="direccion: " + this.getdireccion() + " Valor venta: " + this.getvalorVenta() + " Valor arriendo:"
                + this.getvalorArriendo();
        return mensaje;
    }

}
