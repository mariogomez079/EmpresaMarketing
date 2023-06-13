package Clases.Utilities;

import java.util.Date;

public class CantidadDeSemanas {

    // Mètodo para calcular la cantidad de semanas transcurridas, necesario para los proyectos Nacional e Internacional
    public static long ProyectoCantidadSemanasDuracion(Date fechaInicio, Date fechaFin){
        return (fechaFin.getTime() - fechaInicio.getTime());
    }
}
