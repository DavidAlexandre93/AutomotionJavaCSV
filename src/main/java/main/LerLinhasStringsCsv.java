package main;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;


/**
 * Ler Arquivo massa dados na planilha
 *
 */
public class LerLinhasStringsCsv 
{
	
	// Classe para listar todos os dados na planilha em array
	public static void main(String[] args) throws IOException {

        Reader reader = Files.newBufferedReader(Paths.get("src/main/java/massadados/SampleAppData.csv"));
        CSVReader csvReader = new CSVReaderBuilder(reader).withSkipLines(1).build();
        
        List<String[]> SampleAppData = csvReader.readAll();
        for (String[] SampleData : SampleAppData)
        	
            System.out.println("FlightNumber : " + SampleData[0] + 
           		           " - Passengers : " + SampleData[1] + 
            		           " - Class : " + SampleData[2] +
            		           " - On : " + SampleData[3] +
            		           " - DepartingFrom : " + SampleData[4] +
            		           " - ArrivingIn : " + SampleData[5] +
            		           " - OrderNumber : " + SampleData[6]);   
	}
	
	// Classe para setar apenas uma string preferida do array
	public String FlightNumber() throws IOException {
		
		 Reader reader = Files.newBufferedReader(Paths.get("src/main/java/massadados/SampleAppData.csv"));
	        CSVReader csvReader = new CSVReaderBuilder(reader).withSkipLines(1).build();
	        
	        List<String[]> SampleAppData = csvReader.readAll();
	        for (String[] SampleData : SampleAppData)
	        	
	        	return SampleData[0];
			return null;
		
		
	}
}
