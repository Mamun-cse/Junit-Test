package main;

public class OperatorTestClass {
	public int addition(int x, int y){
		return x+y;
	}
	public int subtraction(int x, int y){
		return x-y;
	}
	public int multiplication(int x, int y){
		return x*y;
	}
	public int division(int x, int y){
		return x/y;
	}
	public int modulas(int x, int y){
		return x%y;
	}
	public int bitNot(int x){
		return ~x;
	}
	public int bitAnd(int x, int y){
		return x&y;
	}
	public int bitOr(int x,int y){
		return x|y;
	}
	public int bitExOr(int x,int y){
		return x^y;
	}
	public int bitshiftRight(int x){
		return x>>1;
	}
	public int bitshiftLeft(int x){
		return x<<1;
	}
	public int bitshiftRightZero(int x){
		return x>>0;
	}

	public int bitshiftLeftZero(int x){
		return x<<0;
	}
	public boolean EqualTo(int x, int y){
		return x == y;
	}
	public boolean NotEqualTo(int x, int y){
		return x != y;
	}
	public boolean GretarThan(int x, int y){
		return x > y;
	}
	public boolean LessThen(int x, int y){
		return x <y;
	}
	public boolean GretarThenOrEqual(int x, int y){
		return x >= y;
	}
	public boolean LessThenOrEqual(int x, int y){
		return x <= y;
	}

}
