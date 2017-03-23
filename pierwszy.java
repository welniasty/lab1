package labolatorium_1_;

public class pierwszy {

	public static void main(String[] args){

punkt_materialny punkt1 = new punkt_materialny(); // stworzenie obiektu o nazwie punkt1 z klasy punkt_materialny
	punkt_materialny punkt2 = new punkt_materialny(5); // stworzenie obiektu o nazwie punkt2 z klasy punkt_materialny i nadanie mu wartoœci poprzez konstruktor
		
	System.out.println("Masa punktu materialnego wynosi: " + punkt1.getMasa()); //wypisanie wartoœci masy obiektu punkt1 za pomoc¹ akcesora
	punkt1.opis();  //wywolujemy metodê opisuj¹c¹ punkt
	punkt1.glowny_moment(); // wywo³anie metody wyœwietlaj¹cej wartoœæ g³ownego momentu bezw³adnoœci
	int st1=punkt1.steiner(5); // przypisanie do zmiennej st1 typu int wartoœci momentu bezw³adnoœci oblicznonego z tw.Steinera przez metodê steiner()
	System.out.println("Moment bezw³adnoœci wzglêdem osi wynosi: " + st1); //wypisanie wartoœci tego momentu
		
		//Analogiczne czynnoœci jak powy¿ej dla obiektu - punkt2
	System.out.println("Masa punktu materialnego wynosi: " + punkt2.getMasa());
	punkt2.opis();
	punkt2.glowny_moment();
	int st2=punkt2.steiner(10);
	System.out.println("Moment bezw³adnoœci wzglêdem osi wynosi: " + st2);
		
	punkt1.setMasa(2); //zmiana masy obiektu punkt1 za pomoc¹ mutatora (settera)
	System.out.println("Masa punktu materialnego wynosi: " + punkt1.getMasa());//Analogiczne czynnoœci jak dla poprzednich obiektów
	punkt1.opis();
	punkt1.glowny_moment();
	int st3=punkt1.steiner(5);
	System.out.println("Moment bezw³adnoœci wzglêdem osi wynosi: " + st3);
		
	punkt_materialny[] tablica = new punkt_materialny[5]; //stworzenie tablicy mog¹cej mieœciæ w sobie obiekty klasy punkt_materialny, która na razie jest zainicjowana zerami

	for(int i=0;i<tablica.length;i++){  //pêtla tworz¹ca obiekty i przypisuj¹ca im wartoœci masy za pomoc¹ konstruktora
			
		tablica[i]=new punkt_materialny(i);
			
	}
		
		
	System.out.println();
	System.out.println("Kolejne wartoœci zapisane w tablicy:"); 
	System.out.println();
	for(int i=0;i<tablica.length;i++){ //pêtla wyswietlajaca informacje o obiektach zawartych w tablicy
			
	System.out.println("Masa punktu materialnego wynosi: " + tablica[i].getMasa());
	tablica[i].opis();
		tablica[i].glowny_moment();
		int st4=tablica[i].steiner(5);
		System.out.println("Moment bezw³adnoœci wzglêdem osi wynosi: " + st4);
		System.out.println();
			
		}
		
		}
	
}

