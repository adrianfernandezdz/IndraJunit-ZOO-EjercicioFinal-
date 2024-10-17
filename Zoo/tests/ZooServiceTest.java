package Zoo.tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class ZooServiceTest {


    // inicializar servicio y mocks.

    // Test del método abrirZooExito. Usaremos mocks, asserts y verifiers.
    @Test
    void testAbrirZooExito() {
    }

    // Test del método abrirZoo con excepción por falta de comida. Usaremos mocks, asserts y verifiers.
    @Test
    void testAbrirZooSinComida() throws Exception {
    }

    // Test del método abrirZoo cuando el zoo está sucio
    // Usaremos mocks, asserts y verifiers.
    @Test
    void testAbrirZooZooSucio() throws Exception {
    }

    // Test del método cerrarZoo con éxito
    // Usaremos asserts y verifiers.
    @Test
    void testCerrarZooExito() throws Exception {
    }

    // Test del método cerrarZoo con hora menor a 20
    // Usaremos asserts y verifiers.
    @Test
    void testCerrarZooHoraTemprana() throws Exception {
    }

    // Test del método cerrarZoo con excepción si ya está cerrado
    // Test del método cerrarZoo con éxito
    // Usaremos asserts y verifiers.
    @Test
    void testCerrarZooHoraTardia() {
    }

    // Test del método calcularGananciasDia
    // Usaremos asserts y verifiers y Argument Captors (para validar los argumentos con los que llamamos a calcularGananciasOPerdidas)
    @Test
    void testCalcularGananciasDia() {
    }

    // Test del método limpiarZoo con éxito
    // Usaremos asserts y verifiers.
    @Test
    void testLimpiarZooExito() throws Exception {
    }

    // Test del método limpiarZoo con excepción si el zoo está abierto
    // Usaremos asserts y verifiers.
    @Test
    void testLimpiarZooFallaPorZooAbierto() {
    }

    // Test del método alimentarAnimales con éxito
    // Usaremos mocks, asserts y verifiers.
    @Test
    void testAlimentarAnimalesExito() throws Exception {
    }

    // Test del método alimentarAnimales con excepción si el zoo está abierto
    // Por ser el último, podemos usar solo asserts :)
    @Test
    void testAlimentarAnimalesZooAbierto() throws Exception {
    }

}
