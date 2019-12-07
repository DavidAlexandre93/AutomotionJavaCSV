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
	public static void main(String[] args) throws IOException {

        Reader reader = Files.newBufferedReader(Paths.get("src/main/java/massadados/pessoas.csv"));
        CSVReader csvReader = new CSVReaderBuilder(reader).withSkipLines(1).build();
        
        
        List<String[]> pessoas = csvReader.readAll();
        for (String[] pessoa : pessoas)
        	
        	//System.out.println(pessoa[0]);
            System.out.println("Name : " + pessoa[0] + " - Idade : " + pessoa[1] + " - Email : " + pessoa[2]);

//        List<String[]> SampleAppData = csvReader.readAll();
//        for (String[] SampleData : SampleAppData)
//            System.out.println("FlightNumber : " + SampleData[0] + 
//            		           " - Passengers : " + SampleData[1] + 
//            		           " - Class : " + SampleData[2] +
//            		           " - On : + " + SampleData[3] +
//            		           " - Departing : " + SampleData[4] +
//            		           " - From : " + SampleData[5] +
//            		           " - Arriving In : " + SampleData[6] +
//            		           " - OrderNumber : " + SampleData[7]);
//
//    }
	}
}
