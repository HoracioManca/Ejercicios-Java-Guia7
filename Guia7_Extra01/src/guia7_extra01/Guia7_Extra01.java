package guia7_extra01;

import Entidades.Cancion;
import Servicio.cancionServicio;

public class Guia7_Extra01 {

    public static void main(String[] args) {
        cancionServicio servCanc = new cancionServicio();
        
            Cancion nueva = servCanc.crearCancion();

            servCanc.mostrarCancion(nueva);
        

    }
}
