package Zoo.tests;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraServiceTest {

    // inicializar servicio

    // Test Parametrizado (@ParameterizedTest) con nombre personalizado por cada test,
    // pista: para darle un nombre personalizado al test, usaremos algo como esto:
    // @ParameterizedTest(name = "Test {index}: \"{0}\" testeando ganancias {2} el día {1}")
    // y utilizanod CsvSource, debe testear el método calcularGananciasOPerdidas para los 7 días de la semana.
    // pista: usaremos assertEquals para validar los resultados esperados de los 7 días

    void testProductos() {
    }
}
