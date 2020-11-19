import java.util.Scanner;
public class CosCalc {

	public static void main(String[] args) {
		Scanner tara = new Scanner(System.in);
		
		System.out.println("Üçgenin a kenarını giriniz:");
		double a = tara.nextDouble();
		
		System.out.println("Üçgenin b kenarını giriniz:");
		double b = tara.nextDouble();
		
		System.out.println("Üçgenin a ve b kenarları arasındaki açıyı giriniz:");
		double y = tara.nextDouble();
		tara.close();
		
		
		y=Math.toRadians(y);
		y=Math.cos(y);
		
		Hesapla(a,b,y);
	}

	
	public static void Hesapla(double a, double b, double y) {
		double sonuc = ((a*a)+(b*b))-2*a*b*y;
		System.out.println("Üçgenin üçünkü kenarının değeri: "+Math.sqrt(sonuc));
	}
}
