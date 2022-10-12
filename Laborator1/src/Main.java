import laborator1.EcuatieGrad1;
import laborator1.Punct;

public class Main {
    public static void main(String[] args) {

        System.out.println("PROBLEMA 3");
        EcuatieGrad1 ecuatie =new EcuatieGrad1(3,4);
        System.out.println(ecuatie);
        System.out.println(ecuatie.rezolva());
        System.out.println();
        System.out.println("PROBLEMA 4");
        Punct punct= new Punct(7.1,8.7);
        Punct punct1= new Punct(7.5,8.6);
        System.out.printf("%,.1f%n",punct.distanta(punct1));

    }
}

        /*
        Problema 5

        import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.SQLOutput;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;




        String[] array = new String[10];
        int nr = 0, i, c;
        try {
            File myObj = new File("filename.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        System.out.print("Varfurile poligonului sunt urmatoarele:");
        for(i=0;i<array.length;i++)
            System.out.print(array[i]+" ");
        */
