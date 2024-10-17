package Zoo.services;

import Taller7.Zoo.repositories.ComidaRepository;

public class ComidaService {

    public ComidaService(ComidaRepository comidaRepository) {
        this.comidaRepository = comidaRepository;
    }

    ComidaRepository comidaRepository;

    public boolean hayComida(){
        return comidaRepository.hayComida();
    }

    public boolean alimentarAnimales(String tipoAnimal) {
        if (tipoAnimal.equals("Gorila") || tipoAnimal.equals("Leon")) {
            System.out.println("Deben ser alimentados por un especialista");
            return false;
        }

        boolean hayComida = this.hayComida();
        boolean hayCuidadores = comidaRepository.hayCuidadoresDisponibles();
        return hayComida && hayCuidadores;
    }
}
