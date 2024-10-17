package Zoo.tests;

import java.util.stream.Stream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class ComidaServiceTest {

    // inicializar mocks y servicios.


    // Test Parametrizado (@ParameterizedTest) con nombre personalizado por cada test,
    // pista: para darle un nombre personalizado al test, usaremos algo como esto:
    // @ParameterizedTest(name = "...")
    // y utilizanod @ValueSource, debe testear el método alimentarAnimales para varios casos de animales que deben ser alimentados por especialista.
    // debemos verificar que no se ha llamado al repositorio, en caso de que así sea.
    public void testAlimentarTipoAnimalPeligroso() {
    }

    // Test Parametrizado (@ParameterizedTest) con nombre personalizado por cada test,
    // usando @MethodSource, deberemos ser capaces de testear todas las casuisticas para animales no peligrosos.
    // debemos verificar que se ha llamado al repositorio, en caso de que así sea.
    @MethodSource("provideTestData")
    public void testAlimentarAnimalesAnimalNoPeligroso() {
    }


    // Método que provee los argumentos para el test
    static Stream<Arguments> provideTestData() {
        return null;
    }
}
