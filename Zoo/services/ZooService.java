package Zoo.services;

import java.util.HashMap;

import Zoo.repositories.ZooRepository;

public class ZooService {

    private LimpiezaService limpiezaService;
    private ComidaService comidaService;
    private ZooRepository zooRepository;
    private CalculadoraGastosService calculadoraGastosService;

    public ZooService(LimpiezaService limpiezaService, ComidaService comidaService, ZooRepository zooRepository,
            CalculadoraGastosService calculadoraGastosService) {
        this.limpiezaService = limpiezaService;
        this.comidaService = comidaService;
        this.zooRepository = zooRepository;
        this.calculadoraGastosService = calculadoraGastosService;
    }

    public boolean abrirZoo(int numeroEstimadoPersonas) throws Exception {
        if(!limpiezaService.isZooLimpio()) {
            throw new Exception("El zoo está sucio y no se puede abrir");
        }

        if(!comidaService.hayComida()) {
            throw new Exception("No hay comida y no se puede abrir");
        }

        if (numeroEstimadoPersonas<100) {
            return false;
        }

        String eventoGuardo = zooRepository.guardarEventoEnBdd("AbrirZoo");
        return true;
    }

    public boolean cerrarZoo(int hora) throws Exception {

        if(hora < 20) {
            System.out.println("Es muy pronto para cerrar el zoo");
            return false;
        }

        if(hora > 20) {
            throw new Exception("El zoo ya debería estar cerrado");
        }

        return true;
    }


    public double calcularGananciasDia(String dia, int numeroPersonasDia, int numeroMenores) {
        if (numeroMenores > numeroPersonasDia) {
            throw new IllegalArgumentException("Hay una inconsistencia en los datos");
        }

        HashMap<String, Integer> precioPersona = new HashMap<>();
        precioPersona.put("Mayor", 20);
        precioPersona.put("Menor", 10);

        // Cantidad de mayores
        int numeroMayores = numeroPersonasDia - numeroMenores;

        final var ingresosMayores = numeroMayores * precioPersona.get("Mayor");
        final var ingresosMenores = numeroMenores * precioPersona.get("Menor");
        final var totalIngresosDia = ingresosMayores + ingresosMenores;

        final var beneficio = calculadoraGastosService.calcularGananciasOPerdidas(dia, totalIngresosDia);
        return beneficio;
    }

    public boolean limpiarZoo(int hora) throws Exception {
        if (hora < 20) {
            throw new Exception("No se puede limpiar al zoo porque está abierto");
        }

        return limpiezaService.limpiarZoo();
    }

    public boolean alimentarAnimales(int hora, String tipoAnimal) throws Exception {
        if (hora < 10 || hora > 20) {
            return comidaService.alimentarAnimales(tipoAnimal);
        } else {
            throw new Exception("No se puede alimentar a los animales porque el zoo está abierto");
        }
    }

}
