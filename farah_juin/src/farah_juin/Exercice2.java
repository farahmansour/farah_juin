/*
* Author : farahmansour
* Date : Jun. 16, 2021
* Description:
*/


package farah_juin;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Exercice2 {

	public static void main(String[] args) throws IOException, FileNotFoundException
	{
		BufferedReader entree;
		int somme=0;
		entree = new BufferedReader(new FileReader("monCalcul.txt"));
		
		while(entree.ready())
		{
			somme+=Integer.parseInt(entree.readLine());
		}
		entree.close();
		//Écrire
		FileWriter ficAEcrire;
		PrintWriter sortie;
		ficAEcrire=new FileWriter("mon Resultat.txt");
		sortie=new PrintWriter(ficAEcrire);
		sortie.print(somme);
		sortie.close();
		

	}

}
