package studia;

public class punkt { //nasza klasa

	
private int masa ; //masa zdeklarowana jako prvate

public punkt () //konstruktor domyslny przypisujacy mase 0 
{
	
	
	
}
public punkt(int masa) // konstruktor z parametrem
{
	this.masa=masa;
}
public void setmasa(int r) //mutator 
{
	masa = r;
}
public int getmasa() //akcesor
{
	return masa;
}

public void wypisz() //funkcja wypisuje na ekranie ponizsze zdanie
{
 System.out.println("Punkt materialny 1 i jego dane :");
    
}
public void wypisz2()
{
 System.out.println("Punkt materialny 2 i jego dane :");
    
}
public void wypisz3()
{
 System.out.println("Punkt materialny 3 i jego dane :");
    
}

public int glowny_moment = 0; // okreslamy moment g�owny rowny 0 gdyz punkt ma zerowe ramie od �rodka ciezkosci

public void glowny_moment() // metoda g��wnego momentu
{ 	
	int glowny_moment=0;
		
		System.out.println("G��wny moment : " + glowny_moment);
}


 public void steiner(int dl) // metoda momentu z tw Steinera z parametrem
 
 {	
	
	int  moment_steiner= glowny_moment + masa*dl*dl; 
	System.out.println("D�ugo�� : "+dl);
	System.out.println("Moment bezw�adno�ci z twierdzenia Steinera : "+moment_steiner);
	
	 
 }


}
