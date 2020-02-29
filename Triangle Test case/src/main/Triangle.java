package main;

public class Triangle {
	public String triangle(int x,int y,int z) {
		if(x<1||x>99 || y<1 || y>99 || z<1 ||z>9)return "INVALID INPUT";
		else if(x+y<=z || y+z<=x || x+z<=y)return "NOT TRIANGLE";
		else if((x==y)&&(y==z))return "EQUILATERAL";
		else if((x==y && x!=z)|| (y==z&& z!=x)|| (z==x&& z!=y))return "ISOSCELES";
		else if(x!=y && y!=z&& z!=x)return "SCALENE";
		
		else return "INVALID INPUT";
	}

}
