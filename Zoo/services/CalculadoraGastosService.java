package Zoo.services;

import java.util.HashMap;

public class CalculadoraGastosService {

    public double calcularGananciasOPerdidas(String dia, double ingresosDia){
        // precios de tener el zoo abierto cada día
        HashMap<String, Integer> costeDia = new HashMap<>();
        costeDia.put("Lunes", 1000);
        costeDia.put("Martes", 1000);
        costeDia.put("Miércoles", 3000);
        costeDia.put("Jueves", 1200);
        costeDia.put("Viernes", 4000);
        costeDia.put("Sábado", 5000);
        costeDia.put("Domingo", 5000);

        /*
        Math.max(0, ...) devuelve el valor mayor entre 0 y
        la operación ingresosDia - costeDia.get(dia).
        Si el resultado de la resta es negativo, se devuelve 0,
        y si es positivo, se devuelve el resultado de la resta.
         */
        double beneficio = Math.max(0, ingresosDia - costeDia.get(dia));
        return beneficio;
    }
}
