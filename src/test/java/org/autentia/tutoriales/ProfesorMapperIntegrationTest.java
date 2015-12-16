package org.autentia.tutoriales;

import static org.junit.Assert.assertNotNull;

import org.autentia.tutoriales.domain.Profesor;
import org.autentia.tutoriales.mappers.ProfesorMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;



@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "classpath*:spring-configuration-docker/*.xml", "classpath*:spring-configuration-test/*.xml" })
@Transactional
public class ProfesorMapperIntegrationTest {
	
	
	@Autowired
	private ProfesorMapper profesorMapper;
	
	
	@Test
	public void shouldGetProfesor() throws Exception {
		
	    Profesor profesor = profesorMapper.getProfesores();
	    
		assertNotNull(profesor);

		
	}
	

}
