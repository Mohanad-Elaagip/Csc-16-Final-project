package UserInterface;

import java.sql.Connection;
import java.sql.DriverManager;

public class Main{
    public static void main(String[] args){
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:sqlite:C:/Users/mraut/Java_3/CSC-160-final-project-Pokedex/Database/Pokemon");
            System.out.println("conn");
        }
        catch (Exception e){

        }
    }
}