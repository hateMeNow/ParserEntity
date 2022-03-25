package test.parser;

public class ColumnNameParser {

	public static String columnNameParser(String columnName) {
		
		String columnNameOutput = "@Column(name=\""+columnName+"\")";
		
		return columnNameOutput;
	}
}
