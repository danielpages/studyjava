package ch3;

public class OperatorEx32 {

	public static void main(String[] args) {
		int x, y, z;
		int absX, absY, absZ;
		char singX, singY, singZ;
		
		x = 10;
		y = -5;
		z =0;
		
		absX = x >= 0 ? x : -x;
		absY = y >= 0 ? y : -y;
		absZ = z >= 0 ? z : -z;
		
		singX = x > 0 ? '+' : (x == 0 ? ' ' : '-');
		singY = y > 0 ? '+' : (y == 0 ? ' ' : '-');
		singZ = z > 0 ? '+' : (z == 0 ? ' ' : '-');
		
		System.out.printf("x = %c%d%n", singX, absX);
		System.out.printf("y = %c%d%n", singY, absY);
		System.out.printf("z = %c%d%n", singZ, absZ);

	}

}
