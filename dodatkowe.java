package zad_dodatkowe;
import java.util.Random;

public class dodatkowe {

	public static void main(String[] args){
		
		Random r = new Random();
		punkt_materialny[] punkt= new punkt_materialny[5]; //stworzenie tablicy obiektow(na razie zainicjowana zerami)
		
		for(int i=0;i<punkt.length;i++){ //pêtla tworz¹ca obiekty w tablicy
			
			punkt[i]=new punkt_materialny(r.nextInt(10),r.nextInt(10),r.nextInt(10),r.nextInt(10));
		}
		
		punkt[0].setX(5);
		
		bryla_sztywna bryla = new bryla_sztywna(); //stworzenie obiektu klasy bryla_sztywna
		//wywolanie metod obliczaj¹cych po³o¿enie œrodka masy
		bryla.srodek_MasyX(punkt); 
		bryla.srodek_MasyY(punkt);
		bryla.srodek_MasyZ(punkt);
		
		//przypisanie do zmiennej typu double wartoœæ momentów wzglêdem poszczególnych osi 
		//i wyœwietlenie ich wartoœci w konsoli
		
		double moment1= bryla.moment_Wzgl_Osi_X(punkt); 
		System.out.println(moment1);
				
		double moment2= bryla.moment_Wzgl_Osi_X(punkt);
		System.out.println(moment2);
		
		double moment3= bryla.moment_Wzgl_Osi_X(punkt);
		System.out.println(moment3);
			
			
	}	
}
