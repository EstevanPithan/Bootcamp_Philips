package basecamp;

public class Main {
	public static void main(String[] args) {
		System.out.println("Exercício retornos");
		
		double areaQuadrado =  Quadrilatero.area(3);
		System.out.println("Area do quadrado " + areaQuadrado);	
		
		double areaRetangulo =  Quadrilatero.area(3,5);
		System.out.println("Area do retangulo " + areaRetangulo);	
		
		double areaTrapezio =  Quadrilatero.area(7,8,9);
		System.out.println("Area do trapézio " + areaTrapezio);	
		
	}
}
