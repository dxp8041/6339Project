/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessObjects;

/**
 *
 * @author dpokhrel
 */
import java.io.File;

public class MoveFile {

	public static void main(String[] args) {
		try {

			File oldFile = new File("/home/dpokhrel/NetBeansProjects/site/dist/site.war");

			if (oldFile.renameTo(new File("/home/dpokhrel/GlassFish_Server/"+ oldFile.getName()))) {
				System.out.println("The file was moved successfully to the new folder");
			} else {
				System.out.println("The File was not moved.");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}