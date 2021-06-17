/*
* Author : farahmansour
* Date : Jun. 16, 2021
* Description: Intro sur les expressions regulières
*               étapes et structure
*/


package farah_juin;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp1 {

	public static void main(String[] args) 
	{
	Scanner crayon=new Scanner(System.in);
	
	
	//input est le texte dans lequel l'expression sera recherchée
	System.out.println("Inscrire le texte pour la recherche");
	String input = crayon.nextLine();
	//Expression à rechercher
	System.out.println("Inscrire le texte recherché");
	String regEx = crayon.nextLine();
	
	//étape 1: Utiliser Pattern
	Pattern pattern = Pattern.compile(regEx, Pattern.CASE_INSENSITIVE);
	
	//étape 2: Allouer un objet Matcher pour l'entrée spécifié
	Matcher matcher = pattern.matcher(input);
	
	//Étape 3: Vérifier la concordance et afficher le résultat
	
	// =====================================================
	//on peut utiliser find()
	while (matcher.find())
	{
		System.out.println("Le(s) mot(s) \"" + matcher.group()
		+ "\" débute à l'indice " + matcher.start()
		+ " et finit à l'indice " + matcher.end());
	}
	
	}

}
