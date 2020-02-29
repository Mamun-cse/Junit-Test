package test;

import static org.junit.Assert.*;

import org.junit.Test;

import main.Triangle;

public class TriangleTestCase {

	@Test
	public void test() {
		Triangle tr=new Triangle();
		assertEquals("EQUILATERAL",tr.triangle(3, 3, 3));
		assertEquals("NOT TRIANGLE",tr.triangle(3, 3, 7));
		assertEquals("ISOSCELES",tr.triangle(3, 3, 4));
		assertEquals("SCALENE",tr.triangle(3, 5, 4));
		assertEquals("INVALID INPUT",tr.triangle(0, 5, 4));
	}

}
