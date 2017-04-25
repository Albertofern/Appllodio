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

import com.ipartek.formacion.dbms.dao.interfaces.RestauranteDAO;
import com.ipartek.formacion.dbms.persistence.Restaurante;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:application-context-test.xml")
public class RestauranteDAOImpTest {

	
	@Autowired
	RestauranteDAO rS;
	
	int[] codigos;
	
	Restaurante restaurante;
	List<Restaurante> restaurantes;
	
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		restaurante = new Restaurante();
		restaurante.setNombre("carnavales");
		restaurante.setCodigo(14);
		restaurante.setDireccion("Dr. Fleming");
		restaurante.setNumero("3");
		restaurante.setTelefono("688810557");
		
		
		codigos= new int[4];
		codigos[0]= 0;
		codigos[1]= 1;
		codigos[2]= 2;
		codigos[3]= 3;
		
	}

	@After
	public void tearDown() throws Exception {
		restaurante=null;
	}
	
	@Test //test unitario 
	public void testclase(){	
		assertEquals("class com.ipartek.formacion.dbms.dao.RestauranteDAOImp", this.rS.getClass().toString());
	}

	@Test
	public void testCreate() {
		Restaurante resta = rS.create(restaurante);

		assertNotNull("el restaurante es nulo", resta); // Cuando "resta" sea NULO //Espero que NO sea NULO
		//todos los atributos
		assertTrue("El codigo debe ser mayor que 0", resta.getCodigo()>0); // cuando esto "resta.getCodigo()>0" sea FALSO 
		assertFalse("El codigo debe se menor que 0", resta.getCodigo()<0);
		assertEquals("El nombre no es identico", resta.getNombre(), restaurante.getNombre());
		// ....
		
		assertEquals("Los datos no son identicos", resta,rS.getById(resta.getCodigo()));
		
		//resta= rS.create(restaurante);
		rS.delete(resta.getCodigo());
		
		//fail("no implementado");
	}

	@Test
	public void testGetAll() {
		List<Restaurante> restaurantes = rS.getAll();
		int size = 20;
		assertEquals("numero de restaurantes es incorrecto",size , restaurantes.size());	
	}

	@Test
	public void testGetById() {
		List<Restaurante> restaurantes = rS.getAll();
		int size = 20;
		assertEquals("numero de restaurantes es incorrecto",size , restaurantes.size());	
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

}
