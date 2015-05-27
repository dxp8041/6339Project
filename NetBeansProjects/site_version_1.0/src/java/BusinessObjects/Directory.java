/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package BusinessObjects;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;


/**
 *
 * @author dpokhrel
 */
public class Directory {
    public  void copyFileUsingFileChannels(File source, File dest)
            throws IOException {
        FileChannel inputChannel = null;
        FileChannel outputChannel = null;
        try {
            inputChannel = new FileInputStream(source).getChannel();
            outputChannel = new FileOutputStream(dest).getChannel();
            outputChannel.transferFrom(inputChannel, 0, inputChannel.size());
        } finally {
            
        }
    }
    public static void main(String[] args) throws IOException{
        String dest="/Library/tomcat/webapps/admin21.infinite-data.com.war";
        String source="/Users/deepak/NetBeansProjects/site/dist/site.war";
        
        
        File from =new File(source);
        File to =new File(dest);
        
        Directory d= new Directory();
        d.copyFileUsingFileChannels(from, to);
        
    }
}
