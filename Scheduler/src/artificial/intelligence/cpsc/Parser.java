package artificial.intelligence.cpsc;

import java.io.*;

public class Parser {
	
	String line = null;
	
	public Parser(String inputFileName){
		try{
			//Read Text File
			FileReader fileReader = new FileReader(inputFileName);
			
			//Wrap FileReader in BufferedReader
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			
			//Name
			while(!(line = bufferedReader.readLine()).isEmpty()){
				System.out.println(line);
			}
			
			//Course Slots
			while((line = bufferedReader.readLine()).isEmpty()){
				System.out.println("EMPTY");
			}
			System.out.println("\n" + line);
			while(!(line = bufferedReader.readLine()).isEmpty()){
				String[] info = new String[4];
				info = line.split(",");
				CourseSlot cs = new CourseSlot(info[0].replaceAll("\\s+", ""), 
												info[1].replaceAll("\\s+", ""), 
												Integer.parseInt(info[2].replaceAll("\\s+", "")), 
												Integer.parseInt(info[3].replaceAll("\\s+", "")));
				System.out.println(cs.toString());
			}
			
			//Lab Slots
			while((line = bufferedReader.readLine()).isEmpty()){
				System.out.println("EMPTY");
			}
			System.out.println("\n" + line);
			while(!(line = bufferedReader.readLine()).isEmpty()){
				String[] info = new String[4];
				info = line.split(",");
				LabSlot ls = new LabSlot(info[0].replaceAll("\\s+", ""), 
												info[1].replaceAll("\\s+", ""), 
												Integer.parseInt(info[2].replaceAll("\\s+", "")), 
												Integer.parseInt(info[3].replaceAll("\\s+", "")));
				System.out.println(ls.toString());
			}
			
			//Courses
			
			//Labs
			
			//Not Compatible
			
			//Unwanted
			
			//Preference
			
			//Pair
			
			//Partial Assignments
			
			//Close file
			bufferedReader.close();
			
		} catch (FileNotFoundException e){
			System.out.println("Unable to open file '" + inputFileName + "'");
		} catch (IOException e){
			System.out.println("Error reading file '" + inputFileName + "'");
		}
	}
}
