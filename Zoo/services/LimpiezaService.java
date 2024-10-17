package Zoo.services;

import Zoo.repositories.LimpiezaZooRepository;

public class LimpiezaService {

    public boolean zooLimpio = false;

    private final LimpiezaZooRepository limpiezaZooRepository;

    public boolean isZooLimpio() {
        return zooLimpio;
    }

    public void setZooLimpio(boolean zooLimpio) {
        this.zooLimpio = zooLimpio;
    }

    public LimpiezaService(LimpiezaZooRepository limpiezaZooRepository) {
        this.limpiezaZooRepository = limpiezaZooRepository;
    }

    public boolean limpiarZoo(){
        if (this.isZooLimpio()) {
            System.out.println("No es necesario limpiar el zoo");
            return false;
        }

        var hayProductos = this.limpiezaZooRepository.hayProductosLimpieza();
        var hayLimpiadores = this.limpiezaZooRepository.hayLimpiadoresDisponibles();
        this.setZooLimpio(hayProductos && hayLimpiadores);
        return hayProductos && hayLimpiadores;
    }


}
