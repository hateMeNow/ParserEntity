package test.parser;

public class TemporalColumnNameParser {

	public static String parserTemporalColumnName(String type) {
		
		if( type.contains("date")) {
			
			return "\n@Temporal(TemporalType.DATE)";
			
		}else if(type.contains("timestamp")) {
			return "\n@Temporal(TemporalType.DATE)";
		}
		
		return "\n";
	}
}
