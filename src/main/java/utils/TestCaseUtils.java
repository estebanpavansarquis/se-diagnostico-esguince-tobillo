package utils;

import model.*;

public class TestCaseUtils {

	////////////////TEST CASES UTILS ////////////////

	public static void print(String title) {
		System.out.println(title);
	}

	public static void print() {
		print("");
	}

	public static void print(Paciente paciente) {
		System.out.println("Datos De Paciente: " + paciente.toString());

	}

	public static void assertResults(DiagnosticoEsguince diagnostico, String valorEsperado) {
		String diagnosticoFinal = diagnostico.getDiagnosticoEsguince().toString();
		printResults(diagnosticoFinal, valorEsperado);
		assert(diagnosticoFinal.equals(valorEsperado));
	}

	private static void printResults(String result,String expected) {
		print("Resultados");
		print("Esperaba: " + expected);
		print("Recibi: " + result);
		Boolean isOk = result.equals(expected);
		String condition = isOk ? "Ok" : "Fallo";
		print("Caso de prueba: "+ condition);
	}
}
