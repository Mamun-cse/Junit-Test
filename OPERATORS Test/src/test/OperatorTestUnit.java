package test;

import static org.junit.Assert.*;

import org.junit.Test;

import main.OperatorTestClass;

public class OperatorTestUnit {

	@Test
	public void test() {
		OperatorTestClass op = new OperatorTestClass();
		assertEquals(5,op.addition(2,3));
		assertEquals(1,op.subtraction(3,2));
		assertEquals(6,op.multiplication(2,3));
		assertEquals(0,op.division(2,3));
		assertEquals(2,op.modulas(2,3));
		
		
		assertEquals(-3,op.bitNot(2));
		assertEquals(2,op.bitAnd(7,2));
		assertEquals(7,op.bitOr(7,2));
		assertEquals(5,op.bitExOr(7,2));
		assertEquals(6,op.bitshiftRight(12));
		assertEquals(14,op.bitshiftLeft(7));
		assertEquals(5,op.bitshiftRightZero(5));
		assertEquals(8,op.bitshiftLeftZero(8));
		
		assertEquals(true,op.EqualTo(12,12));
		assertEquals(true,op.NotEqualTo(13,12));
		assertEquals(true,op.GretarThan(14,12));

		assertEquals(true,op.LessThen(11,12));
		assertEquals(true,op.GretarThenOrEqual(16,12));
		assertEquals(true,op.LessThenOrEqual(11,12));

		
	}

}
