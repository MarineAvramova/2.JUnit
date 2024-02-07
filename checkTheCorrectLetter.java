import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class checkTheCorrectLetter {

	private CalcularDNI calcularDNI; //
	
	@BeforeEach
	void setUp() throws Exception {
		calcularDNI = new CalcularDNI();
	}

	@AfterEach
	void tearDown() throws Exception {
		calcularDNI = null;
	}

	//@Test
	
	@ParameterizedTest
	@CsvSource({"2222222, 'P'",
				"1234567, 'L'",
				"9876543, 'K'",
				"1357901, 'G'",
				"2468124, 'V'",
				"43576821, 'D'",
				"7777777, 'M'",
				"37129545, 'R'", 
				"7364522, 'Z'",
				"5647389, 'S'"})
	
	void testEncontrarLaLetra(int numero, char expected) {
		// 1. set expecting value
		int resto = calcularDNI.divisionNumeroDni(numero);
		// 2. obtain an object
		
		// 3. get the actual value
		char actual = calcularDNI.encontrarLaLetra(resto);
		//4. compare to test the method
		assertEquals(expected, actual);
	}
}
