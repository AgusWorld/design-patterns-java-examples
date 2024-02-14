package structural.adapter.birthday;

public interface FactoryAniversari {
	Aniversari getAniversari(int year,Aniversari.Mes month,int day);

}
