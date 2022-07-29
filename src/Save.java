import java.io.*;

public class Save {
	
	public File createFile(String filename) {
		File file = new File(filename+".txt");
		try {
			file.createNewFile();
			System.out.println(file.getName());
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		return file;
		
	}
	
	public void writeFile(File file, Job playerClass, int currentFloor, int totalHunt) {
		try {
	
			FileOutputStream fos = new FileOutputStream(file);
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));
			
			bw.write(playerClass.getName());
			bw.newLine();
			bw.write(playerClass.getHeroType());
			bw.newLine();
			bw.write(Integer.toString(currentFloor));
			bw.newLine();
			bw.write(Integer.toString(totalHunt));
			
			bw.close();
		} catch(IOException e) {
			System.out.println("An error occured");
			e.printStackTrace();
		}
	}
	
	public Save(String filename, Job playerClass, int currentFloor, int totalHunt){
		writeFile(createFile(filename), playerClass, currentFloor, totalHunt);
	}
	
}
