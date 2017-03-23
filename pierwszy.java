package studia;

public class pierwszy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		punkt punktmat1 = new punkt(); //stworzenie obiektu punktmat1 z klasy punkt
		punkt punktmat2 = new punkt(5);//stworzenie obiektu punktmat2 i nadanie wartoœci 
		//konstruktorem
		
		punktmat1.wypisz(); 
		System.out.println("Masa obiektu :" + punktmat1.getmasa());//pobieramy mase za pomoc¹ akcesora
		punktmat1.glowny_moment();//wywo³ujemy metode g³owny_moment
		punktmat1.steiner(10);//przypisanie do metody parametru
		
		punktmat1.wypisz2();
		punktmat1.setmasa(2);//za pomoca mutatora przypisujemy mase
		System.out.println("Masa obiektu :"+punktmat1.getmasa());
		punktmat1.glowny_moment();
		punktmat1.steiner(10);
		
		
		punktmat2.wypisz3();
		System.out.println("Masa obiektu :"+punktmat2.getmasa());
		punktmat2.glowny_moment();
		punktmat2.steiner(10);

		punkt [] tablica = new punkt[4]; 
		for (int i=1  ; i<=4 ; i++)
		{
			
				 
				
				 
				
			tablica[i]=new punkt(i);
			
			tablica[i].wypisz();
			System.out.println("Masa obiektu :" + tablica[i].getmasa());
			tablica[i].glowny_moment();
			tablica[i].steiner(10);
		}
		
	}

}
