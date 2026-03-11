package com.example.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CseControllerTest {
	CseController c= new CseController();
	@Test
	void test(){
		int result = c.add(2, 3);
		assertEquals(5, result);
	}
}
