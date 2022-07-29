import java.io.*;
import java.util.ArrayList;
import java.util.List;
public class Load {
	
	public ArrayList<String> readFile(String filename) throws IOException {
		ArrayList<String> dataList = new ArrayList<String>();
		BufferedReader br = new BufferedReader(new FileReader(filename+".txt"));
		
		String line = br.readLine();
		while (line != null) {
			dataList.add(line);
            line = br.readLine();
        }
		br.close();
		return dataList;
	}
	
	
	public ArrayList<String> LoadGame(String filename) throws IOException  {
		//ArrayList<String> dataList = new ArrayList<String>();
		return readFile(filename);
		/*
		playerClass.setName(dataList.get(0));
		playerClass.setHeroType(dataList.get(1));
		currentFloor = Integer.parseInt(dataList.get(2));
		totalHunt = Integer.parseInt(dataList.get(3));
		
		for(int i = 0; i < dataList.size(); i++) {
			System.out.println(dataList.get(i));
		}*/
	}
	
	public Load() {
		
	}
}
