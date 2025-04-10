package Principal;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n;
		String meses[]= {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre"};
		double temperatura[];
		double temperaturaMaxima;
		double temperaturaMinima;
		int posTMaxima;
		int posTMinima;

		temperatura=new double[meses.length];
		
		System.out.println("Lectura de las temperaturas x mes");
		for(int i=0;i<meses.length;i++)
		{
			System.out.println("Temperatura de "+meses[i]+":");
			temperatura[i]=sc.nextDouble();
		}
		temperaturaMaxima=temperatura[0];
		temperaturaMinima=temperatura[0];
		posTMaxima = 0;
		posTMinima=0;
		for(int i=1;i<meses.length;i++)
		{
			if(temperatura[i]>temperaturaMaxima) 
			{
				temperaturaMaxima=temperatura[i];
			    posTMaxima=i;
			}
			if(temperatura[i]<temperaturaMinima)
			{
				temperaturaMinima=temperatura[i];
			    posTMinima=i;
			}
		}
		System.out.println("La máxima ha sido de: "+temperaturaMaxima+" grados");
		System.out.println("En el mes: "+meses[posTMaxima]);
		
		System.out.println("La mínima ha sido de:  "+temperaturaMinima+" grados");
		System.out.println("En el mes: "+meses[posTMinima]);

	}
	
}

