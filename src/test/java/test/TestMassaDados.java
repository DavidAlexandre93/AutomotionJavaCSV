package test;

import java.io.IOException;

import main.LerLinhasStringsCsv;

/**
 * Teste usando um unico dado do array
 */
public class TestMassaDados{
	
	public static void main(String[] args) throws IOException {
		
		LerLinhasStringsCsv lerMassa = new LerLinhasStringsCsv();
		
		System.out.println(lerMassa.FlightNumber());
		
	}
}
   