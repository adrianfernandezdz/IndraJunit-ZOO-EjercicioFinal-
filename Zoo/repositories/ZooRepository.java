package Zoo.repositories;

import java.util.ArrayList;
import java.util.List;

public class ZooRepository {
    public String guardarEventoEnBdd(String evento) {
        List<String> eventosValidos = new ArrayList<>();
        eventosValidos.addAll(List.of("AbrirZoo", "CerrarZoo"));
        if (eventosValidos.contains(evento)) {
            return "Evento guardado con éxito";
        } else {
            return "Evento no guardado en bbdd";
        }
    }
}
