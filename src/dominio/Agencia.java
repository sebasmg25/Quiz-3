package dominio;

import java.util.ArrayList;
import java.util.List;

public class Agencia {
    private String nombre;
    private ArrayList<Inmueble> Inmuebles;

   





    public void AgregarInmueble(Inmueble i){

        Inmuebles.add(i);

    }


    public boolean ArrendarInmueble(Inmueble arrendable){

        boolean arrendado = false;
        if(arrendable instanceof Arrendable) {
            if(arrendable.isarrendado()==false) {
                arrendable.setarrendado(true);
                arrendado = true;
            }else {
            	arrendado = false;
            }
        }
        return arrendado;

    }


    public boolean DevolverInmueble(Inmueble arrendable){

        boolean devolver = false;
        if(arrendable instanceof Arrendable) {
            if(arrendable.isarrendado()) {
                arrendable.setarrendado(false);
                devolver = true;
            } else {
            	devolver = false;
            }
        }
        return devolver;



    }


    public boolean VenderInmueble(Inmueble inmueble){

        boolean vender = false;
        Inmueble inmuebleAVender = null;
        for (Inmueble inm : Inmuebles) {
            if(inm.getdireccion().equals(inmueble.getdireccion())) {
                if(inmueble.isarrendado() == false) {
                    inmuebleAVender = inm;
                    vender = true;
                }else {
                	vender = false;
                }
            }
        }
        Inmuebles.remove(inmuebleAVender);
        return vender;



    }



    public List<Inmueble> ArrendablesDisponibles(){

        List<Inmueble> disponibles = new ArrayList<>();
        for (Inmueble inmueble : this.Inmuebles) {
            if(inmueble instanceof Arrendable) {
                if(!inmueble.isarrendado()) {
                    disponibles.add(inmueble);
                }
            }
        }
        return disponibles;


    }



    public List<Inmueble> Arrendados(){

        List<Inmueble> arrendados = new ArrayList<>();
        for (Inmueble inmueble : this.Inmuebles) {
            if(inmueble.isarrendado()) {
                arrendados.add(inmueble);
            }
        }
        return arrendados;



    }

    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public List<Inmueble> getInmuebles() {
        return Inmuebles;
    }


    public void setInmuebles(List<Inmueble> inmuebles) {
        this.Inmuebles = ( ArrayList<Inmueble>) inmuebles;
    }



}
