package com.ipartek.formacion.dao;

import static org.junit.Assert.*;

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

import com.ipartek.formacion.dbms.dao.interfaces.BarrioDAO;
import com.ipartek.formacion.dbms.persistence.Barrio;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:application-context-test.xml")
public class BarrioDAOImpTest {
	
	@Autowired
	BarrioDAO bS;
	
	int[] codigos;
	
	Barrio barrio;
	List<Barrio> barrios;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		barrio = new Barrio();
		barrio.setNombre("Larra");
		barrio.setCodigo(8);
		
		codigos= new int[4];
		codigos[0]= 0;
		codigos[1]= 1;
		codigos[2]= 2;
		codigos[3]= 3;
	}

	@After
	public void tearDown() throws Exception {
		barrio= null;
	}

	@Test //test unitario 
	public void testclase(){	
		assertEquals("class com.ipartek.formacion.dbms.dao.BarrioDAOImp", this.bS.getClass().toString());
	}
	
	@Test
	public void testCreate() {
		Barrio barri = bS.create(barrio);

		assertNotNull("El barrio es nulo", barri); // Cuando "barri" sea NULO //Espero que NO sea NULO
		//todos los atributos
		assertTrue("El codigo debe ser mayor que 0", barri.getCodigo()>0); // cuando esto "barri.getCodigo()>0" sea FALSO 
		assertFalse("El codigo debe se menor que 0", barri.getCodigo()<0);
		assertEquals("El nombre no es identico", barri.getNombre(), barrio.getNombre());
		// ....
		
		assertEquals("Los datos no son identicos", barri,bS.getById(barri.getCodigo()));
		
		//barri= bS.create(alumno);
		bS.delete(barri.getCodigo());
		
		//fail("no implementado");
	}
	
	@Test(timeout = 600)
	public void testGetAll() {
		List<Barrio> barrios = bS.getAll();
		int size = 7;
		assertEquals("numero de barrios incorrecto",size , barrios.size());		
	}

	@Test
	public void testGetById() {
		/*for(int i=0; i<codigos.length; i++){
			Barrio barri = bS.getById(codigos[i]);
			assertNotNull("El barrio tiene que existir. El barrio con codigo " 
						+ codigos[i] + " esta en BBDDs", barri);
			assertEquals("El codigo del alumno no coincide. El codigo enviado es:" + codigos[i] 
						+ " y el recibido es:" + barri.getCodigo(),
						codigos[i], barri.getCodigo());
		}*/
		List<Barrio> barrios = bS.getAll();
		int size = 7;
		assertEquals("numero de barrios es incorrecto",size , barrios.size());
	}

	@Test
	@Ignore
	public void testGetByNombre() {
		fail("Not yet implemented");
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

	@Test
	@Ignore
	public void testGetInforme() {
		fail("Not yet implemented");
	}

}
