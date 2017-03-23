package zad_dodatkowe;

public class bryla_sztywna {
	
	public bryla_sztywna(){
		
	}

	private double odlX,odlY,odlZ; //deklaracja zmiennych do przechowywania odleg³oœci œrodka masy od pocz¹tku uk³adu wspó³rzêdnych
	
	// 3 metody obliczaj¹ce odlegloœæ œrodka masy od pocz¹tku uk³adu XYZ
	
	public void srodek_MasyX (punkt_materialny[] tablica){
		
		int mianownik=0; //suma mas punktów materialnych
		double licznik=0; //suma iloczynów masy i kwadratu odleg³oœci punktu od pocz¹tku uk³adu
		
		for(int i=0;i<tablica.length;i++){
			
			licznik=licznik+tablica[i].getX()*tablica[i].getMasa(); //obliczanie wartosci licznika
			mianownik=mianownik+tablica[i].getMasa(); //obliczanie wartosci mianownika
			
			
		}
		odlX=licznik/mianownik; 
	}
	
	//dzia³ania wykonywane analogicznie do pierwszej metody
	public void srodek_MasyY (punkt_materialny[] tablica){
		
		int mianownik=0;
		double licznik=0;
		
		for(int i=0;i<tablica.length;i++){
			
			licznik=licznik+tablica[i].getY()*tablica[i].getMasa();
			mianownik=mianownik+tablica[i].getMasa();
			
			
		}
		odlY=licznik/mianownik;
	}
	
	public void srodek_MasyZ (punkt_materialny[] tablica){
		
		int mianownik=0;
		double licznik=0;
		
		for(int i=0;i<tablica.length;i++){
			
			licznik=licznik+tablica[i].getZ()*tablica[i].getMasa();
			mianownik=mianownik+tablica[i].getMasa();
			
			
		}
		odlZ=licznik/mianownik;
	}
	
	// 3 metody obliczaj¹ce momenty bezw³adnoœci bry³y wzglêdem odpowiednich osi przechodz¹cych przez œrodek masy
	
	public double moment_Wzgl_Osi_X(punkt_materialny[] tablica){
		
		double moment_X=0; //zmienna przechowuj¹ca wartoœæ momentu bezw³adnoœci
	for(int i=0;i<tablica.length;i++){
		
		moment_X=moment_X+tablica[i].getMasa()*(Math.pow(tablica[i].getY()-odlY,2)+Math.pow(tablica[i].getZ()-odlZ, 2)); //obliczenie wartoœci momentu z tw.Steinera
		
	}
	
	return moment_X; // zwrócenie wartoœci momentu
}
	
	//dzia³ania wykonywane analogicznie jak wy¿ej
	public double moment_Wzgl_Osi_Y(punkt_materialny[] tablica){
		
			double moment_Y=0;
		for(int i=0;i<tablica.length;i++){
			
			moment_Y=moment_Y+tablica[i].getMasa()*(Math.pow(tablica[i].getX()-odlX,2)+Math.pow(tablica[i].getZ()-odlZ, 2));
			
		}
		
		return moment_Y;
	}
	
public double moment_Wzgl_Osi_Z(punkt_materialny[] tablica){
		
		double moment_Z=0;
	for(int i=0;i<tablica.length;i++){
		
		moment_Z=moment_Z+tablica[i].getMasa()*(Math.pow(tablica[i].getX()-odlX,2)+Math.pow(tablica[i].getY()-odlY, 2));
		
	}
	
	return moment_Z;
}
	
}

	
