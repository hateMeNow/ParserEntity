package test.parser;

import java.util.ArrayList;
import java.util.List;

public class Parser {
	
	private static boolean foundUnderScore = false;
	
	private static String stringaOutputLambda = "";
	
	
	public static List<String> parseColonne(String colonne) {
		
		String[] stringaParsata = colonne.split("-");
		
		List<String> listaStringhe = new ArrayList<String>();
		
		String[] stringCompose = null;
		
		String stringa = "";
		
		String type = "";
		
		for (String stringhe : stringaParsata) {
			
			
			stringCompose = stringhe.split("[|]", -1 );
			
			stringa = stringCompose[0];
			
			stringa = stringa.toLowerCase();
			
			stringaOutputLambda = "";
			
			stringa.chars().forEachOrdered(i  ->{ 
													if( (char)i != '_') {
														if( foundUnderScore) {
															stringaOutputLambda = stringaOutputLambda + (""+(char)i).toUpperCase();
														}else {
															stringaOutputLambda  = stringaOutputLambda + ""+(char)i;
														}
													}
													if((char)i == '_') {
														foundUnderScore = true;
													}else {
														foundUnderScore = false;
													}
																				
			});    
			
			type = TypeParser.getType(stringCompose[1]);
			
			type = type + stringaOutputLambda + ";";
			
			listaStringhe.add(ColumnNameParser.columnNameParser(stringCompose[0]));
			
			listaStringhe.add(type);
			
			listaStringhe.add("\n");
		}
		
		
		
		
		
		return listaStringhe;
	}

}
