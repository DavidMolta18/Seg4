package main;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
	Main m = new Main();
		m.getData();
	}

	
	public void getData() {
		
		
		try {
			File f = new File("BillboardDataExported.csv");
			FileInputStream fis = new FileInputStream(f);
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			byte[] buffer = new byte[1024];
			int read = 0;
			while ((read=fis.read(buffer))!= -1) {
				
				baos.write(buffer,0,read);
				
			}
			fis.close();
			baos.close();
			
			String csv = baos.toString();
			System.out.println(csv);
			
			

		
		
		} catch (FileNotFoundException e) {
		
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
}
