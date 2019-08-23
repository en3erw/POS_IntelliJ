package com.qa;
import java.sql.*;

/**
 * Hello world!
 *
 */
public class App 
{

    static Connection conn = null;
  //  static ArrayList<AccountManage> accounts;

  //  static ArrayList<Product> products;

 //   static ArrayList<Category> categories;

    // static Connection conn = null;
    public static void main( String[] args ) throws SQLException
    {



asdqweq;[][)
       // System.out.println(args[0]);
        ConnectDatabase();
    }



    public static void ConnectDatabase() throws SQLException {

        conn = DriverManager.
                getConnection("jdbc:h2:~/test", "sa", "");


        System.out.println("Connection successful!");

    }


    public static int calculate(int num1, int num2)
    {
        int temp = 0;
        temp = num1 + num2;
        return temp;
    }

}
