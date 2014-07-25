package br.com.metaway.android.test;


import java.io.ByteArrayInputStream;
import java.io.IOException;

import static org.junit.Assert.*;

import org.junit.Test;

import br.com.metaway.android.test.model.v1.Parent;
import br.com.metaway.android.test.model.v2.ParentV2;
import br.com.metaway.android.test.model.v3.ParentV3;
import br.com.metaway.android.test.model.v4.ParentV4;

import com.fasterxml.jackson.jr.ob.JSON;

/**
 * Created by gsmiro on 16/07/2014.
 */
public class CollectionsPropertyTest{

	private final String data = "{"
			+ "\"info\" : {"
			+ "\"id\" : 0,"
			+ "\"name\" : \"parentBean\""
			+ "},"
			+ "\"children\" : [ {"
			+ "\"id\" : 1,"
			+ "\"name\" : \"childBean[1]\""
			+ "}, {"
			+ "\"id\" : 2,"
			+ "\"name\" : \"childBean[2]\""
			+ "}, {"
			+ "\"id\" : 3,"
			+ "\"name\" : \"childBean[3]\""
			+ "} ]"
			+ "}";
    
	@Test
    public void testHierarchyV1() throws IOException {
		Parent p = JSON.std.beanFrom(Parent.class, data);
        assertNotNull(p.getChildren());
        assertEquals(3, p.getChildren().size());
    }


	@Test
    public void testHierarchyV2() throws IOException {
        ParentV2 p = JSON.std.beanFrom(ParentV2.class, data);
        assertNotNull(p.getChildren());
        assertEquals(3, p.getChildren().size());
    }

	@Test
    public void testHierarchyV3() throws IOException {
        ParentV3 p = JSON.std.beanFrom(ParentV3.class, data);
        assertNotNull(p.getChildren());
        assertEquals(3, p.getChildren().size());
    }

	@Test
    public void testHierarchyV4() throws IOException {
        ParentV4 p = JSON.std.beanFrom(ParentV4.class, data);
        assertNotNull(p.getChildren());
        assertEquals(3, p.getChildren().size());
    }

}
