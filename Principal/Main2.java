package Principal;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int vector1[]= {3,6,12,87,34,21,65,56,45,34,23,34,99};
		int numero;
		int posiciones[]=new int[vector1.length];
		int nEncontrados=0;
		int aux;
		boolean encontrado=false;
		int i;
		for( i=0;i<vector1.length;i++)
		{
			 vector1[i]=vector1[j];
		     vector1[j]=aux;
	    }
		for( i=0;i<vector1.length;i++)
			System.out.println("Introduzca un número: ");
		System.out.println();
		
		System.out.println("Introduzca un número");
		numero=sc.nextInt();
		
		

		for( i=0;i<vector1.length && vector1[i]<=numero;i++)
		{
			if(numero==vector1[i])
			{
				posiciones[nEncontrados++]=i;
		        encontrado=true;
			}
	    }
	    if(encontrado==true)
	    {
			for(int i=0;i<nEncontrados;i++)
			{
				System.out.println("Se ha encontrado "+numero+" en el vector en la posición "+posiciones[i]);
			}
	    }
		else 
		{
		    	System.out.println("No se ha encontrado "+numero+ " en el vector");
		}
	   
	    sc.close();
	}

}

