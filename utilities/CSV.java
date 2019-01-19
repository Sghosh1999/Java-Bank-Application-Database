package utilities;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
public class CSV {
	//This method will read the data from the  file and return list
	public static List<String[]> read(String file) {
		List<String[]>data = new LinkedList<String[]>();
		String dataflow;
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			while((dataflow = br.readLine())!=null)
			{
			String[] datarecords = dataflow.split(",");
			data.add(datarecords);
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("Could Not find the File");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Could Not read the File");
			e.printStackTrace();
		}
		return data;
	}

}
