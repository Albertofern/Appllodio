package com.ipartek.formacion.dao;

import static org.junit.Assert.*;

import java.util.Date;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ipartek.formacion.dbms.dao.interfaces.FiestaDAO;
import com.ipartek.formacion.dbms.persistence.Barrio;
import com.ipartek.formacion.dbms.persistence.Fiesta;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:application-context-test.xml")
public class FiestaDAOImpTest {

	
	@Autowired
	FiestaDAO fS;
	
	int[] codigos;
	
	Fiesta fiesta;
	List<Fiesta> fiestas;
	
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		fiesta = new Fiesta();
		fiesta.setNombre("carnavales");
		fiesta.setCodigo(14);
		fiesta.setDescripcion("Carnavales populares");
		fiesta.setFecha( new Date(2017-02-26));
		
		codigos= new int[4];
		codigos[0]= 0;
		codigos[1]= 1;
		codigos[2]= 2;
		codigos[3]= 3;
	}

	@After
	public void tearDown() throws Exception {
		fiesta = null;
	}

	@Test //test unitario 
	public void testclase(){	
		assertEquals("class com.ipartek.formacion.dbms.dao.FiestaDAOImp", this.fS.getClass().toString());
	}
	
	@Test
	public void testCreate() {
		Fiesta fies = fS.create(fiesta);

		assertNotNull("la fiesta es nulo", fies); // Cuando "fies" sea NULO //Espero que NO sea NULO
		//todos los atributos
		assertTrue("El codigo debe ser mayor que 0", fies.getCodigo()>0); // cuando esto "fies.getCodigo()>0" sea FALSO 
		assertFalse("El codigo debe se menor que 0", fies.getCodigo()<0);
		assertEquals("El nombre no es identico", fies.getNombre(), fiesta.getNombre());
		// ....
		
		assertEquals("Los datos no son identicos", fies,fS.getById(fies.getCodigo()));
		
		//fies= bS.create(fiesta);
		fS.delete(fies.getCodigo());
		
		//fail("no implementado");
	}
	

	@Test
	public void testGetById() {
		for(int i=0; i<codigos.length; i++){
			Fiesta fies = fS.getById(codigos[i]);
			assertNotNull("La Fiesta tiene que existir. La Fiesta con codigo " 
						+ codigos[i] + " esta en BBDDs", fies);
			assertEquals("El codigo de la fiesta no coincide. El codigo enviado es:" + codigos[i] 
						+ " y el recibido es:" + fies.getCodigo(),
						codigos[i], fies.getCodigo());
		}
	}

	@Test
	public void testGetAll() {
		List<Fiesta> fiestas = fS.getAll();
		int size = 13;
		assertEquals("numero de fiestas es incorrecto",size , fiestas.size());	
	}

	@Test
	@Ignore
	public void testUpdate() {
		fail("Not yet implemented");
	}

	@Test
	@Ignore
	public void testDelete() {
		fail("Not yet implemented");
	}

}
