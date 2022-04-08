import java.io.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import java.lang.Number;

/**
 * 
 * CSCU9T4 Java strings and files exercise.
 *
 */
public class FilesInOut {

    public static String capitalise(String name)
    {
        name=name.toLowerCase();
        char[] name_array=name.trim().toCharArray();
        name_array[0]=Character.toUpperCase(name_array[0]);
        for(int i=0;i< name_array.length;i++)
        {
            if(name_array[i]==' ' && (i+1)< name_array.length)
            {
                name_array[i+1]=Character.toUpperCase(name_array[i+1]);
            }
        }
        return new String(name_array);
    }
    public static String upper_case(String ip)
    {
        String op=ip.toUpperCase();
        return ip;
    }
    public static void main(String[] args) throws FileNotFoundException{
        Scanner console= new Scanner(System.in);
        System.out.println("Enter name of input file: ");
        String input_file=console.next();
        System.out.println("Enter name of output file: ");
        String output_file=console.next();
        System.out.println("The input file is: "+input_file);
        System.out.println("The output file is: "+output_file);
        File inputFile=new File(input_file);
        Scanner in= new Scanner(inputFile);
        PrintWriter out= new PrintWriter(output_file);
        System.out.println("Capitalising name");
        while(in.hasNext())
        {
            String output=capitalise(in.nextLine());
            System.out.println(output);
        }
        System.out.println("Converting name to Upper Case");
        while(in.hasNext())
        {
            upper_case(in.next());
        }
        in.close();
        out.close();
    }
}
