package test.parser;

public class TypeParser {

	
	public static String getType(String type) {
		
		String returnType = "private ";
		
		
		if(type.contains("varchar")) {
			returnType = returnType + "String ";
		}else if(type.contains("int")) {
			returnType = returnType + "Long ";
		}else if(type.contains("decimal")) {
			returnType = returnType + "Double ";
		}else if(type.contains("timestamp")) {
			returnType = returnType + "Date ";
		}else if(type.contains("datetime")) {
			returnType = returnType + "Date ";
		}else {
			returnType = returnType + "UNDEFINED ";
		}
		
		
		return returnType;
	}
	
}
