package Project3;

import java.io.File;

public class Test {
	
	public static void main(String[] args) {
		
		File f = new File("C:\\Users\\asus\\eclipse-workspace\\3rd Proj\\src");
		
		if(f.exists())
			
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}
