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
	public void diagnósticoCondicionesExternasNoAplicanTest() {
		print("Caso de prueba 1: Diagnóstico condiciones externas No Aplican");

		Paciente paciente = new Paciente();
		Lesion lesion = new Lesion();
		
		paciente.setLesion(lesion);
	
		print(paciente);
		
		sessionStatefull.insert(paciente);
		sessionStatefull.fireAllRules();
		
		DiagnosticoEsguince diagnosticoEsguince = paciente.getDiagnosticoEsguince();
		assertResults(diagnosticoEsguince, "Sin_Esguince");
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
