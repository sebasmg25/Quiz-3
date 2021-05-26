package dominio;

public abstract class Inmueble {

    private String direccion;
    private long valorVenta;
    private long valorArriendo;
    private boolean arrendado;


    

        public String getdireccion() {
            return direccion;
        }

        public void setdireccion(String direccion) {
            this.direccion = direccion;
        }

        public long getvalorVenta() {
            return valorVenta;
        }

        public void setValorVenta(long valorVenta) {
            this.valorVenta = valorVenta;
        }

        public long getvalorArriendo() {
            return valorArriendo;
        }

        public void setValorArriendo(long valorArriendo) {
            this.valorArriendo = valorArriendo;
        }

        public boolean isarrendado() {
            return arrendado;
        }

        public void setarrendado(boolean arrendado) {
            this.arrendado = arrendado;
        }

       

    }




