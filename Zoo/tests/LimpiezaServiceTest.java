package Zoo.tests;

import java.util.stream.Stream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class LimpiezaServiceTest {


    // inicializar servicio y mocks.


    //testear limpiarZoo cuando el zoo está limpio.
    @Test
    public void testLimpiarZooCuandoZooLimpio() {
    }

    //test parametrizado con @MethodSource para cuando el zoo esté sucio y haya que limpiarlo.
    @ParameterizedTest(name = "{0}")
    @MethodSource("provideTestData")
    public void testLimpiarZooCuandoZooSucio() {
    }


    // Método que provee los argumentos para el test
    static Stream<Arguments> provideTestData() {
        return null;
    }
}
