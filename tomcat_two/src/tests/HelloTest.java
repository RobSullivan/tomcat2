package tests;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import code.Hello;



public class HelloTest {

	

	

	
	@Test
	public void test() {
		
		Hello classUnderTest = new Hello();
		
		String expectedAnswer = "Hello";
		String actualAnswer = classUnderTest.hello();
		
		assertEquals(expectedAnswer, actualAnswer);
	}
	
	@Test
	public void test2(){
		
		Hello classUnderTest = new Hello();
		
		String expectedAnswer = "goodbye";
		String actualAnswer = classUnderTest.goodbye();
		
		assertEquals(expectedAnswer, actualAnswer);
		
	}

}
