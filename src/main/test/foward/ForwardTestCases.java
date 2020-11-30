package foward;

import static utils.TestCaseUtils.assertResults;

import static utils.TestCaseUtils.print;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.kie.api.event.rule.ObjectDeletedEvent;
import org.kie.api.event.rule.ObjectInsertedEvent;
import org.kie.api.event.rule.ObjectUpdatedEvent;
import org.kie.api.event.rule.RuleRuntimeEventListener;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.rule.FactHandle;

import model.*;
import model.enums.*;
import utils.KnowledgeSessionHelper;

public class ForwardTestCases {

	// Buscar archivo kmodule.xml. El nombre de la sesion debe ser igual al
	// configurado en ese archivo
	String K_SESSION_NAME = "ksession-rules";

	KieSession sessionStatefull;
	static KieContainer kieContainer;

	FactHandle automovilDir;
	
	public ForwardTestCases() {
	}
		
	@BeforeClass
	public static void beforeallTestSetup() {
		kieContainer = KnowledgeSessionHelper.createRuleBase();
	}

	private void prepareKnowledgeSession() {
		sessionStatefull = KnowledgeSessionHelper.getStatefulKnowledgeSession(kieContainer, K_SESSION_NAME);
	}
	
	@Before
	public void setUp() {
		print("----------Start----------");
		print();
		this.prepareKnowledgeSession(); // Inicializa una nueva base de hechos
	}

	@After
	public void tearDown() {
		print();
		print("----------End----------");
		print();
	}
	
	
	@Test
	public void diagnósticoSinEsguince01() {
		print("Caso de prueba 1: Diagnóstico de esguince sin esguince 1");

		Paciente paciente = new Paciente();
		
		sessionStatefull.insert(paciente);
		sessionStatefull.fireAllRules();
		
		DiagnosticoEsguince diagnosticoEsguinceObtenido = paciente.getDiagnosticoEsguince();
		
		DiagnosticoEsguince diagnosticoEsguinceEsperado = new DiagnosticoEsguince();
		diagnosticoEsguinceEsperado.setGradoDeEsguince(GradoDeEsguince.Sin_Esguince);
		
		assertResults(diagnosticoEsguinceObtenido, diagnosticoEsguinceEsperado);
	}
	
	@Test
	public void diagnósticoEsguinceLeve01() {
		print("Caso de prueba 2: Diagnóstico de esguince de grado Leve 1");

		Paciente paciente = new Paciente();
		paciente.intensidadDeDolor = IntensidadDeDolor.Leve;
		paciente.tobillo.setPresentaHinchazon(PresentaHinchazon.Leve);
		paciente.resosnanciaMagnetica.setExtensionDeLesion(ExtensionDeLesion.Leve);
		
		sessionStatefull.insert(paciente);
		sessionStatefull.fireAllRules();
		

		DiagnosticoEsguince diagnosticoEsguinceObtenido = paciente.getDiagnosticoEsguince();
		
		DiagnosticoEsguince diagnosticoEsguinceEsperado = new DiagnosticoEsguince();
		diagnosticoEsguinceEsperado.setGradoDeEsguince(GradoDeEsguince.Leve);
		diagnosticoEsguinceEsperado.setTratarConPRICE(true);
		diagnosticoEsguinceEsperado.setTratarConMedicacion(true);
		diagnosticoEsguinceEsperado.setDiasDeReposo(15);
		
		assertResults(diagnosticoEsguinceObtenido, diagnosticoEsguinceEsperado);
	}
	
	@Test
	public void diagnósticoEsguinceMedio01() {
		print("Caso de prueba 3: Diagnóstico de esguince de grado Medio 1");

		Paciente paciente = new Paciente();
		paciente.intensidadDeDolor = IntensidadDeDolor.Intenso;
		paciente.resosnanciaMagnetica.setExtensionDeLesion(ExtensionDeLesion.Extensa);
		paciente.resosnanciaMagnetica.setDesgarroDeNervios(DesgarroDeNervios.Parcial);
		paciente.tobillo.setPresentaHinchazon(PresentaHinchazon.Alta);
		paciente.tobillo.setCapacidadDeMovimiento(CapacidadDeMovimiento.Limitada);
		
		sessionStatefull.insert(paciente);
		sessionStatefull.fireAllRules();
		
		DiagnosticoEsguince diagnosticoEsguinceObtenido = paciente.getDiagnosticoEsguince();
		
		DiagnosticoEsguince diagnosticoEsguinceEsperado = new DiagnosticoEsguince();
		diagnosticoEsguinceEsperado.setGradoDeEsguince(GradoDeEsguince.Medio);
		diagnosticoEsguinceEsperado.setTratarConPRICE(true);
		diagnosticoEsguinceEsperado.setTratarConMedicacion(true);
		diagnosticoEsguinceEsperado.setTratarConInmovilizacion(true);
		diagnosticoEsguinceEsperado.setTratarConFisioterapia(true);
		diagnosticoEsguinceEsperado.setNecesitaProximaSitaDeControl(true);
		diagnosticoEsguinceEsperado.setDiasDeReposo(30);
		
		assertResults(diagnosticoEsguinceObtenido, diagnosticoEsguinceEsperado);
	}
	
	@Test
	public void diagnósticoEsguinceGrave01() {
		print("Caso de prueba 4: Diagnóstico de esguince de grado Grave 1");

		Paciente paciente = new Paciente();
		paciente.intensidadDeDolor = IntensidadDeDolor.Intenso;
		paciente.resosnanciaMagnetica.setExtensionDeLesion(ExtensionDeLesion.Extensa);
		paciente.resosnanciaMagnetica.setDesgarroDeNervios(DesgarroDeNervios.Parcial);
		paciente.tobillo.setSoportaSuPropioPeso(false);
		paciente.tobillo.setPresentaHinchazon(PresentaHinchazon.Alta);
		paciente.tobillo.setCapacidadDeMovimiento(CapacidadDeMovimiento.Nula);
		
		sessionStatefull.insert(paciente);
		sessionStatefull.fireAllRules();
		
		DiagnosticoEsguince diagnosticoEsguinceObtenido = paciente.getDiagnosticoEsguince();
		
		DiagnosticoEsguince diagnosticoEsguinceEsperado = new DiagnosticoEsguince();
		diagnosticoEsguinceEsperado.setGradoDeEsguince(GradoDeEsguince.Grave);
		diagnosticoEsguinceEsperado.setTratarConPRICE(true);
		diagnosticoEsguinceEsperado.setTratarConMedicacion(true);
		diagnosticoEsguinceEsperado.setTratarConInmovilizacion(true);
		diagnosticoEsguinceEsperado.setTratarConFisioterapia(true);
		diagnosticoEsguinceEsperado.setNecesitaProximaSitaDeControl(true);
		diagnosticoEsguinceEsperado.setDiasDeReposo(45);
		
		assertResults(diagnosticoEsguinceObtenido, diagnosticoEsguinceEsperado);
	}
	
	@Test
	public void diagnósticoEsguinceGrave02() {
		print("Caso de prueba 5: Diagnóstico de esguince de grado Grave 2");

		Paciente paciente = new Paciente();
		paciente.intensidadDeDolor = IntensidadDeDolor.Intenso;
		paciente.radiografia.setPresentaLesionOsea(true);
		paciente.resosnanciaMagnetica.setExtensionDeLesion(ExtensionDeLesion.Extensa);
		paciente.resosnanciaMagnetica.setDesgarroDeNervios(DesgarroDeNervios.Parcial);
		paciente.tobillo.setSoportaSuPropioPeso(false);
		paciente.tobillo.setPresentaHinchazon(PresentaHinchazon.Alta);
		paciente.tobillo.setCapacidadDeMovimiento(CapacidadDeMovimiento.Nula);
		
		sessionStatefull.insert(paciente);
		sessionStatefull.fireAllRules();
		
		DiagnosticoEsguince diagnosticoEsguinceObtenido = paciente.getDiagnosticoEsguince();
		
		DiagnosticoEsguince diagnosticoEsguinceEsperado = new DiagnosticoEsguince();
		diagnosticoEsguinceEsperado.setGradoDeEsguince(GradoDeEsguince.Grave);
		diagnosticoEsguinceEsperado.setTratarConPRICE(true);
		diagnosticoEsguinceEsperado.setTratarConMedicacion(true);
		diagnosticoEsguinceEsperado.setTratarConInmovilizacion(true);
		diagnosticoEsguinceEsperado.setTratarConFisioterapia(true);
		diagnosticoEsguinceEsperado.setNecesitaProximaSitaDeControl(true);
		diagnosticoEsguinceEsperado.setDiasDeReposo(60);
		
		assertResults(diagnosticoEsguinceObtenido, diagnosticoEsguinceEsperado);
	}
	
	@Test
	public void diagnósticoEsguinceGrave03() {
		print("Caso de prueba 6: Diagnóstico de esguince de grado Grave 3");

		Paciente paciente = new Paciente();
		paciente.intensidadDeDolor = IntensidadDeDolor.Intenso;
		paciente.radiografia.setPresentaFractura(true);
		paciente.resosnanciaMagnetica.setExtensionDeLesion(ExtensionDeLesion.Extensa);
		paciente.resosnanciaMagnetica.setDesgarroDeNervios(DesgarroDeNervios.Nulo);
		paciente.tobillo.setSoportaSuPropioPeso(false);
		paciente.tobillo.setPresentaHinchazon(PresentaHinchazon.Alta);
		paciente.tobillo.setCapacidadDeMovimiento(CapacidadDeMovimiento.Nula);
		
		sessionStatefull.insert(paciente);
		sessionStatefull.fireAllRules();
		
		DiagnosticoEsguince diagnosticoEsguinceObtenido = paciente.getDiagnosticoEsguince();
		
		DiagnosticoEsguince diagnosticoEsguinceEsperado = new DiagnosticoEsguince();
		diagnosticoEsguinceEsperado.setGradoDeEsguince(GradoDeEsguince.Grave);
		diagnosticoEsguinceEsperado.setTratarConPRICE(true);
		diagnosticoEsguinceEsperado.setTratarConMedicacion(true);
		diagnosticoEsguinceEsperado.setTratarConInmovilizacion(true);
		diagnosticoEsguinceEsperado.setTratarConFisioterapia(true);
		diagnosticoEsguinceEsperado.setNecesitaProximaSitaDeControl(true);
		diagnosticoEsguinceEsperado.setDiasDeReposo(75);
		
		assertResults(diagnosticoEsguinceObtenido, diagnosticoEsguinceEsperado);
	}
	
	@Test
	public void diagnósticoEsguinceGrave04() {
		print("Caso de prueba 7: Diagnóstico de esguince de grado Grave 4");

		Paciente paciente = new Paciente();
		paciente.intensidadDeDolor = IntensidadDeDolor.Intenso;
		paciente.radiografia.setPresentaFractura(true);
		paciente.resosnanciaMagnetica.setExtensionDeLesion(ExtensionDeLesion.Extensa);
		paciente.resosnanciaMagnetica.setDesgarroDeNervios(DesgarroDeNervios.Total);
		paciente.tobillo.setSoportaSuPropioPeso(false);
		paciente.tobillo.setPresentaHinchazon(PresentaHinchazon.Alta);
		paciente.tobillo.setCapacidadDeMovimiento(CapacidadDeMovimiento.Nula);
		
		sessionStatefull.insert(paciente);
		sessionStatefull.fireAllRules();
		
		DiagnosticoEsguince diagnosticoEsguinceObtenido = paciente.getDiagnosticoEsguince();
		
		DiagnosticoEsguince diagnosticoEsguinceEsperado = new DiagnosticoEsguince();
		diagnosticoEsguinceEsperado.setGradoDeEsguince(GradoDeEsguince.Grave);
		diagnosticoEsguinceEsperado.setTratarConPRICE(true);
		diagnosticoEsguinceEsperado.setTratarConMedicacion(true);
		diagnosticoEsguinceEsperado.setTratarConInmovilizacion(true);
		diagnosticoEsguinceEsperado.setTratarConFisioterapia(true);
		diagnosticoEsguinceEsperado.setNecesitaProximaSitaDeControl(true);
		diagnosticoEsguinceEsperado.setTratarConCirugia(true);
		diagnosticoEsguinceEsperado.setDiasDeReposo(90);
		
		assertResults(diagnosticoEsguinceObtenido, diagnosticoEsguinceEsperado);
	}
	

	private RuleRuntimeEventListener buildEventListener() {
		return new RuleRuntimeEventListener() {
			@Override
			public void objectUpdated(ObjectUpdatedEvent event) {
			
				System.out.println("Object updated \n" + event.getObject().toString());
			}

			@Override
			public void objectInserted(ObjectInsertedEvent event) {
				System.out.println("Object inserted \n" + event.getObject().toString());
			}

			@Override
			public void objectDeleted(ObjectDeletedEvent event) {
				System.out.println("Object deleted \n" + event.getOldObject().toString());
			}
		};
	}
}
