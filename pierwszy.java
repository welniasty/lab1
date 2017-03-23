package labolatorium_1_;

public class pierwszy {

	public static void main(String[] args){

punkt_materialny punkt1 = new punkt_materialny(); // stworzenie obiektu o nazwie punkt1 z klasy punkt_materialny
	punkt_materialny punkt2 = new punkt_materialny(5); // stworzenie obiektu o nazwie punkt2 z klasy punkt_materialny i nadanie mu warto�ci poprzez konstruktor
		
	System.out.println("Masa punktu materialnego wynosi: " + punkt1.getMasa()); //wypisanie warto�ci masy obiektu punkt1 za pomoc� akcesora
	punkt1.opis();  //wywolujemy metod� opisuj�c� punkt
	punkt1.glowny_moment(); // wywo�anie metody wy�wietlaj�cej warto�� g�ownego momentu bezw�adno�ci
	int st1=punkt1.steiner(5); // przypisanie do zmiennej st1 typu int warto�ci momentu bezw�adno�ci oblicznonego z tw.Steinera przez metod� steiner()
	System.out.println("Moment bezw�adno�ci wzgl�dem osi wynosi: " + st1); //wypisanie warto�ci tego momentu
		
		//Analogiczne czynno�ci jak powy�ej dla obiektu - punkt2
	System.out.println("Masa punktu materialnego wynosi: " + punkt2.getMasa());
	punkt2.opis();
	punkt2.glowny_moment();
	int st2=punkt2.steiner(10);
	System.out.println("Moment bezw�adno�ci wzgl�dem osi wynosi: " + st2);
		
	punkt1.setMasa(2); //zmiana masy obiektu punkt1 za pomoc� mutatora (settera)
	System.out.println("Masa punktu materialnego wynosi: " + punkt1.getMasa());//Analogiczne czynno�ci jak dla poprzednich obiekt�w
	punkt1.opis();
	punkt1.glowny_moment();
	int st3=punkt1.steiner(5);
	System.out.println("Moment bezw�adno�ci wzgl�dem osi wynosi: " + st3);
		
	punkt_materialny[] tablica = new punkt_materialny[5]; //stworzenie tablicy mog�cej mie�ci� w sobie obiekty klasy punkt_materialny, kt�ra na razie jest zainicjowana zerami

	for(int i=0;i<tablica.length;i++){  //p�tla tworz�ca obiekty i przypisuj�ca im warto�ci masy za pomoc� konstruktora
			
		tablica[i]=new punkt_materialny(i);
			
	}
		
		
	System.out.println();
	System.out.println("Kolejne warto�ci zapisane w tablicy:"); 
	System.out.println();
	for(int i=0;i<tablica.length;i++){ //p�tla wyswietlajaca informacje o obiektach zawartych w tablicy
			
	System.out.println("Masa punktu materialnego wynosi: " + tablica[i].getMasa());
	tablica[i].opis();
		tablica[i].glowny_moment();
		int st4=tablica[i].steiner(5);
		System.out.println("Moment bezw�adno�ci wzgl�dem osi wynosi: " + st4);
		System.out.println();
			
		}
		
		}
	
}

