package structural.adapter.birthday;

public interface Aniversari {
	int getAny();
	Mes getMes();
	int getDia();
	
	boolean isLaterThan(Aniversari altre);//any,mes i dia
	boolean isSame(Aniversari altre);//nomes mes i dia
	public enum Mes{
		Gener,Febrer,Marc,Abril,Maig,Juny,Juliol,Agost,
		Setembre,Octubre,Novembre,Desembre;
	}
	
}
