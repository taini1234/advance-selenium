package AdvSel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ToReadDataFromPropertiFile {

	public static void main(String[] args) throws IOException {
		//STEP1:.....CREATE OBJ FOR FILE AND PASSING PATH FOR PROP FILE
				File file=new File("./Data/data.properties");
				
				//STEP2 ......CREATE OBJ FOR FILEINPUTSTREAM
				FileInputStream fis=new FileInputStream(file);
				
				
				//STEP3.....CREATE OBJ FOR PEOPERTIES FILE
				Properties prop=new Properties();
				
				prop.load(fis);
				
				System.out.println(prop.get("url"));
				System.out.println(prop.get("password"));
				System.out.println(prop.get("username"));

	}

}
