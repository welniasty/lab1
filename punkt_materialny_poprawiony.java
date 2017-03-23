package labolatorium_1_poprawione;

public class punkt_materialny_poprawiony { //klasa, z której bêdzimey powo³ywaæ obiekty
	 private int masa; // pole okreœlaj¹ce masê naszego punktu materialnego
	  
     public int getMasa(){ // akcesor (getter)
     
   	  return masa;
     }
     
     public void setMasa(int m){ //mutator (setter)
   	  
   	  masa=m;	  
     }

     
     public punkt_materialny_poprawiony(){ // konstruktor domyslny - przypisuje wartoœæ masy równ¹ 0

     }

     public punkt_materialny_poprawiony(int podana_masa){ // konstruktor z parametrem 

     masa=podana_masa;
     }
        
     public void glowny_moment(){ //metoda dotyczaca glownego momentu bezwladnosci - moment ten jest domyœlnie równy 0
         
         int glowny_moment_bezwladnosci=0;
         System.out.println("Glowny moment bezwladnosci jest rowny " + glowny_moment_bezwladnosci);
     }
     
     public int steiner(int dlugosc){ //metoda liczaca moment bezwladnosci z tw.Steinera 
         
         int steiner= masa*dlugosc*dlugosc;
         return steiner;
     }
         
     public void opis(){ //opis obiektu
         
         System.out.println("Punkt materialny");
         
     }
	
}
