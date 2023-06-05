package Calculate;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		int distance, age, type;
		double price, perKm = 0.10; 
		boolean isError = false;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Mesafeyi km türünden giriniz: ");
		distance = input.nextInt();
		
		System.out.print("Yaşınızı giriniz: ");
		age = input.nextInt();
		
		System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
		type = input.nextInt();
		
		
		price = (distance * perKm);
		
		
		if ((distance > 0 && age > 0) && (type == 1 || type == 2) ) 
		{	
			
			if (age < 12) 
			{
				price = price - (price * 0.50 );
			};
			if (age >= 12 && age <= 24) 
			{
				price = price - (price * 0.10 );
			};
			if (type == 2) 
			{
				price = (price - (price * 0.20 )) * 2;
			}
		}	
		else 
		{
			isError = true;
		}
		
		
		if(isError == true) 
		{
			System.out.println( "Hatalı Veri Girdiniz !");
		}
		else 
		{
			System.out.println("Toplam Tutar: " + price + " TL");
		}
		
		
		
		
		
		
		
	}

}
