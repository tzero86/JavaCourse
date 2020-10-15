package chapter13;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {

    public static void main(String[] arg) throws IOException {
        //createNewFile();
        //numbersExceptionHandling();
        createNewFileRethrow();
    }

    public static void numbersExceptionHandling(){
        File file = new File("resources/numbers.txt");
        Scanner fileReader = null;
        try {
            fileReader = new Scanner(file);
            while(fileReader.hasNext()){
                double num = fileReader.nextDouble();
                System.out.println(num);
            }
        } catch (FileNotFoundException | InputMismatchException e){
            e.printStackTrace();
        } finally {
            fileReader.close();
        }
    }

    // automatically closes the resource once executed.
    // works only for classes that implement Closable or autoClosable interfaces.
    public static void numbersExceptionHandling2(){
        File file = new File("resources/numbers.txt");
        try(Scanner fileReader = new Scanner(file))  {
            while(fileReader.hasNext()){
                double num = fileReader.nextDouble();
                System.out.println(num);
            }
        } catch (FileNotFoundException | InputMismatchException e){
            e.printStackTrace();
        }
    }

    public static void createNewFile(){
        File file = new File("resources/test.txt");
        try {
            file.createNewFile();
        }catch (IOException e){
            System.out.println("Directory does not exist.");
            e.printStackTrace();
        }
    }

    public static void createNewFileRethrow() throws IOException{
        File file = new File("resources/test.txt");
        file.createNewFile();
    }
}
