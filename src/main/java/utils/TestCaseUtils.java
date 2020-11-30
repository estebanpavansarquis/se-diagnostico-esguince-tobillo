package utils;

import model.*;
import model.enums.GradoDeEsguince;

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

	public static void assertResults(String result, String expected) {
		printResults(result, expected);
		assert(result.equals(expected));
	}
	
	public static void assertResults(DiagnosticoEsguince diagnosticoObtenido, DiagnosticoEsguince diagnosticoEsperado) {
		printResults(diagnosticoObtenido.toString(), diagnosticoEsperado.toString());
		assert(diagnosticoObtenido.equals(diagnosticoEsperado));
	}

	private static void printResults(String result,String expected) {
		print("Resultados");
		print("\nDiagnostico esperado: " + expected);
		print("\nDiagnostico obtenido: " + result);
		Boolean isOk = result.equals(expected);
		String condition = isOk ? "Ok" : "Fallo";
		print("\nCaso de prueba: "+ condition);
	}
}
