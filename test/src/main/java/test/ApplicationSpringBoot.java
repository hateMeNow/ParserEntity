package test;

import java.util.List;

import test.parser.Parser;

public class ApplicationSpringBoot {


	public static void main(String[] args) {
		
		String colonne = "COD_AMB_DIS|varchar(4)-"
				+ "COD_IST|varchar(50)-"
				+ "COD_LIN|varchar(2)-"
				+ "COD_PGM_ULT_MOV|varchar(50)-"
				+ "COD_PRO_CNC|varchar(4)-"
				+ "COD_REG|varchar(2)-"
				+ "COD_UID|varchar(36)-"
				+ "COD_UTE_ULT_MOV|varchar(50)-"
				+ "DAT_AGG|timestamp-"
				+ "DAT_ORA_ULT_MOV|datetime-"
				+ "NUM_VOT_AMM_ESA_ORA|decimal(6,2)-"
				+ "NUM_VOT_PRV_PRA|decimal(6,2)-"
				+ "NUM_VOT_PRV_SCR|decimal(6,2)-"
				+ "PER_ANN_SCO_RIF|decimal(6,0)-"
				+ "PRG_ANA_CMS_CIN|int(11)-"
				+ "PRG_ANA_SOT_CMS_CIN|int(11)";

		
		List<String> listadatabase = Parser.parseColonne(colonne);
		
		for (String string : listadatabase) {
			System.out.println(string);
		}
		
		
	}
	
	
	
}
