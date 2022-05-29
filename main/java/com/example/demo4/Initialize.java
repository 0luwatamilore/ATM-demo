package com.example.demo4;

import java.io.*;
import java.util.ArrayList;

public class Initialize {

    public void writeDatabase() throws IOException {

        // File class
        // Created a File object called file
        File file = new File("BankDatabase2.csv");
        // An empty text file is created

        // FileWriter class
        // Created a FileWriter Object called fw
        FileWriter fw = new FileWriter(file);

        // PrintWriter class
        // Created a PrintWriter Object called pw
        PrintWriter pw = new PrintWriter(fw);

        // CSV Header
        pw.println("Acc.No,Acc.Name,PIN,Balance");
        Long num = 100000000L;

        // increase account number
        num++;
        // print record
        pw.println(num + "," + "Joffrey" + "," + 2266 + "," + 7614);
        // increase account number
        num++;
        // print record
        pw.println(num + "," + "Ted" + "," + 1861 + "," + 26990);
        // increase account number
        num++;
        // print record
        pw.println(num + "," + "Zaha" + "," + 2604 + "," + 27403);
        // increase account number
        num++;
        // print record
        pw.println(num + "," + "Hazard" + "," + PINgenerator() + "," + Balancegenerator());
        // increase account number
        num++;
        // print record
        pw.println(num + "," + "Lampard" + "," + PINgenerator() + "," + Balancegenerator());
        // increase account number
        num++;
        // print record
        pw.println(num + "," + "Alexis" + "," + PINgenerator() + "," + Balancegenerator());
        // increase account number
        num++;
        // print record
        pw.println(num + "," + "Jamie" + "," + PINgenerator() + "," + Balancegenerator());
        // increase account number
        num++;
        // print record
        pw.println(num + "," + "Bran" + "," + PINgenerator() + "," + Balancegenerator());
        // increase account number
        num++;
        // print record
        pw.println(num + "," + "Eddard" + "," + PINgenerator() + "," + Balancegenerator());
        // increase account number
        num++;
        // print record
        pw.println(num + "," + "Samwell" + "," + PINgenerator() + "," + Balancegenerator());
        // increase account number
        num++;
        // print record
        pw.println(num + "," + "Theon" + "," + PINgenerator() + "," + Balancegenerator());
        // increase account number
        num++;
        // print record
        pw.println(num + "," + "Petyr" + "," + PINgenerator() + "," + Balancegenerator());
        // increase account number
        num++;
        // print record
        pw.println(num + "," + "Robb" + "," + PINgenerator() + "," + Balancegenerator());
        // increase account number
        num++;
        // print record
        pw.println(num + "," + "Tuco" + "," + PINgenerator() + "," + Balancegenerator());
        // increase account number
        num++;
        // print record
        pw.println(num + "," + "Tywinn" + "," + PINgenerator() + "," + Balancegenerator());
        // increase account number
        num++;
        // print record
        pw.println(num + "," + "Rue" + "," + PINgenerator() + "," + Balancegenerator());
        // increase account number
        num++;
        // print record
        pw.println(num + "," + "Elliot" + "," + PINgenerator() + "," + Balancegenerator());
        // increase account number
        num++;
        // print record
        pw.println(num + "," + "Gia" + "," + PINgenerator() + "," + Balancegenerator());
        // increase account number
        num++;
        // print record
        pw.println(num + "," + "Otis" + "," + PINgenerator() + "," + Balancegenerator());
        // increase account number
        num++;
        // print record
        pw.println(num + "," + "Maeve" + "," + PINgenerator() + "," + Balancegenerator());
        // increase account number
        num++;
        // print record
        pw.println(num + "," + "Ruby" + "," + PINgenerator() + "," + Balancegenerator());
        // increase account number
        num++;
        // print record
        pw.println(num + "," + "Jackson" + "," + PINgenerator() + "," + Balancegenerator());
        // increase account number
        num++;
        // print record
        pw.println(num + "," + "Vivienne" + "," + PINgenerator() + "," + Balancegenerator());
        // increase account number
        num++;
        // print record
        pw.println(num + "," + "Olivia" + "," + PINgenerator() + "," + Balancegenerator());
        // increase account number
        num++;
        // print record
        pw.println(num + "," + "Devi" + "," + PINgenerator() + "," + Balancegenerator());
        // increase account number
        num++;
        // print record
        pw.println(num + "," + "Ben" + "," + PINgenerator() + "," + Balancegenerator());
        // increase account number
        num++;
        // print record
        pw.println(num + "," + "Aneesa" + "," + PINgenerator() + "," + Balancegenerator());
        // increase account number
        num++;
        // print record
        pw.println(num + "," + "Haley" + "," + PINgenerator() + "," + Balancegenerator());
        // increase account number
        num++;
        // print record
        pw.println(num + "," + "Alex" + "," + PINgenerator() + "," + Balancegenerator());
        // increase account number
        num++;
        // print record
        pw.println(num + "," + "Phil" + "," + PINgenerator() + "," + Balancegenerator());
        // increase account number
        num++;
        // print record
        pw.println(num + "," + "Claire" + "," + PINgenerator() + "," + Balancegenerator());
        // increase account number
        num++;
        // print record
        pw.println(num + "," + "Lily" + "," + PINgenerator() + "," + Balancegenerator());
        // increase account number
        num++;
        // print record
        pw.println(num + "," + "Jay" + "," + PINgenerator() + "," + Balancegenerator());
        // increase account number
        num++;
        // print record
        pw.println(num + "," + "Joe" + "," + PINgenerator() + "," + Balancegenerator());
        // increase account number
        num++;
        // print record
        pw.println(num + "," + "Mitchel" + "," + PINgenerator() + "," + Balancegenerator());
        // increase account number
        num++;
        // print record
        pw.println(num + "," + "Andy" + "," + PINgenerator() + "," + Balancegenerator());
        // increase account number
        num++;
        // print record
        pw.println(num + "," + "Asher" + "," + PINgenerator() + "," + Balancegenerator());
        // increase account number
        num++;
        // print record
        pw.println(num + "," + "Andre" + "," + PINgenerator() + "," + Balancegenerator());
        // increase account number
        num++;
        // print record
        pw.println(num + "," + "Kevin" + "," + PINgenerator() + "," + Balancegenerator());
        // increase account number
        num++;
        // print record
        pw.println(num + "," + "Robert" + "," + PINgenerator() + "," + Balancegenerator());
        // increase account number
        num++;
        // print record
        pw.println(num + "," + "Khal" + "," + PINgenerator() + "," + Balancegenerator());
        // increase account number
        num++;
        // print record
        pw.println(num + "," + "Jaime" + "," + PINgenerator() + "," + Balancegenerator());
        // increase account number
        num++;
        // print record
        pw.println(num + "," + "Sandor" + "," + PINgenerator() + "," + Balancegenerator());
        // increase account number
        num++;
        // print record
        pw.println(num + "," + "Tywin" + "," + PINgenerator() + "," + Balancegenerator());
        // increase account number
        num++;
        // print record
        pw.println(num + "," + "Jean" + "," + PINgenerator() + "," + Balancegenerator());
        // increase account number
        num++;
        // print record
        pw.println(num + "," + "Ife" + "," + PINgenerator() + "," + Balancegenerator());
        // increase account number
        num++;
        // print record
        pw.println(num + "," + "Tobi" + "," + PINgenerator() + "," + Balancegenerator());
        // increase account number
        num++;
        // print record
        pw.println(num + "," + "Collins" + "," + PINgenerator() + "," + Balancegenerator());
        // increase account number
        num++;
        // print record
        pw.println(num + "," + "Chucks" + "," + PINgenerator() + "," + Balancegenerator());
        // increase account number
        num++;
        // print record
        pw.println(num + "," + "Joshua" + "," + PINgenerator() + "," + Balancegenerator());
        // increase account number
        num++;
        // print record
        pw.println(num + "," + "Shalom" + "," + PINgenerator() + "," + Balancegenerator());
        // increase account number
        num++;
        // print record
        pw.println(num + "," + "Obiaga" + "," + PINgenerator() + "," + Balancegenerator());
        // increase account number
        num++;
        // print record
        pw.println(num + "," + "Prosper" + "," + PINgenerator() + "," + Balancegenerator());
        // increase account number
        num++;
        // print record
        pw.println(num + "," + "Ikechi" + "," + PINgenerator() + "," + Balancegenerator());
        // increase account number
        num++;
        // print record
        pw.println(num + "," + "Feyisayo" + "," + PINgenerator() + "," + Balancegenerator());
        // increase account number
        num++;
        // print record
        pw.println(num + "," + "Foluso" + "," + PINgenerator() + "," + Balancegenerator());
        // increase account number
        num++;
        // print record
        pw.println(num + "," + "Elijah" + "," + PINgenerator() + "," + Balancegenerator());
        // increase account number
        num++;
        // print record
        pw.println(num + "," + "Philip" + "," + PINgenerator() + "," + Balancegenerator());
        // increase account number
        num++;
        // print record
        pw.println(num + "," + "Angel" + "," + PINgenerator() + "," + Balancegenerator());
        // increase account number
        num++;
        // print record
        pw.println(num + "," + "Camari" + "," + PINgenerator() + "," + Balancegenerator());
        // increase account number
        num++;
        // print record
        pw.println(num + "," + "Okoroh" + "," + PINgenerator() + "," + Balancegenerator());
        // increase account number
        num++;
        // print record
        pw.println(num + "," + "Wisdom" + "," + PINgenerator() + "," + Balancegenerator());
        // increase account number
        num++;
        // print record
        pw.println(num + "," + "Mayorkun" + "," + PINgenerator() + "," + Balancegenerator());
        // increase account number
        num++;
        // print record
        pw.println(num + "," + "Emmanuel" + "," + PINgenerator() + "," + Balancegenerator());
        // increase account number
        num++;
        // print record
        pw.println(num + "," + "Kelechi" + "," + PINgenerator() + "," + Balancegenerator());
        // increase account number
        num++;
        // print record
        pw.println(num + "," + "Amarachi" + "," + PINgenerator() + "," + Balancegenerator());
        // increase account number
        num++;
        // print record
        pw.println(num + "," + "Layomi" + "," + PINgenerator() + "," + Balancegenerator());
        // increase account number
        num++;
        // print record
        pw.println(num + "," + "Jowayne" + "," + PINgenerator() + "," + Balancegenerator());
        // increase account number
        num++;
        // print record
        pw.println(num + "," + "Ayomide" + "," + PINgenerator() + "," + Balancegenerator());
        // increase account number
        num++;
        // print record
        pw.println(num + "," + "Chibuikem" + "," + PINgenerator() + "," + Balancegenerator());
        // increase account number
        num++;
        // print record
        pw.println(num + "," + "Dinesh" + "," + PINgenerator() + "," + Balancegenerator());
        // increase account number
        num++;
        // print record
        pw.println(num + "," + "Rejin" + "," + PINgenerator() + "," + Balancegenerator());
        // increase account number
        num++;
        // print record
        pw.println(num + "," + "Mariam" + "," + PINgenerator() + "," + Balancegenerator());
        // increase account number
        num++;
        // print record
        pw.println(num + "," + "Onyinye" + "," + PINgenerator() + "," + Balancegenerator());
        // increase account number
        num++;
        // print record
        pw.println(num + "," + "Derin" + "," + PINgenerator() + "," + Balancegenerator());
        // increase account number
        num++;
        // print record
        pw.println(num + "," + "Hephzibah" + "," + PINgenerator() + "," + Balancegenerator());
        // increase account number
        num++;
        // print record
        pw.println(num + "," + "Akwesi" + "," + PINgenerator() + "," + Balancegenerator());
        // increase account number
        num++;
        // print record
        pw.println(num + "," + "Sopuruchi" + "," + PINgenerator() + "," + Balancegenerator());
        // increase account number
        num++;
        // print record
        pw.println(num + "," + "Awantika" + "," + PINgenerator() + "," + Balancegenerator());
        // increase account number
        num++;
        // print record
        pw.println(num + "," + "Bethel" + "," + PINgenerator() + "," + Balancegenerator());
        // increase account number
        num++;
        // print record
        pw.println(num + "," + "Chinaza" + "," + PINgenerator() + "," + Balancegenerator());
        // increase account number
        num++;
        // print record
        pw.println(num + "," + "Ann" + "," + PINgenerator() + "," + Balancegenerator());
        // increase account number
        num++;
        // print record
        pw.println(num + "," + "Benzema" + "," + PINgenerator() + "," + Balancegenerator());
        // increase account number
        num++;
        // print record
        pw.println(num + "," + "Karim" + "," + PINgenerator() + "," + Balancegenerator());
        // increase account number
        num++;
        // print record
        pw.println(num + "," + "Robert" + "," + PINgenerator() + "," + Balancegenerator());
        // increase account number
        num++;
        // print record
        pw.println(num + "," + "Okafor" + "," + PINgenerator() + "," + Balancegenerator());
        // increase account number
        num++;
        // print record
        pw.println(num + "," + "King" + "," + PINgenerator() + "," + Balancegenerator());
        // increase account number
        num++;
        // print record
        pw.println(num + "," + "Mike" + "," + PINgenerator() + "," + Balancegenerator());
        // increase account number
        num++;
        // print record
        pw.println(num + "," + "Buhari" + "," + PINgenerator() + "," + Balancegenerator());
        // increase account number
        num++;
        // print record
        pw.println(num + "," + "Musa" + "," + PINgenerator() + "," + Balancegenerator());
        // increase account number
        num++;
        // print record
        pw.println(num + "," + "Victor" + "," + PINgenerator() + "," + Balancegenerator());
        // increase account number
        num++;
        // print record
        pw.println(num + "," + "Davies" + "," + PINgenerator() + "," + Balancegenerator());
        // increase account number
        num++;
        // print record
        pw.println(num + "," + "Timothy" + "," + PINgenerator() + "," + Balancegenerator());
        // increase account number
        num++;
        // print record
        pw.println(num + "," + "Rodri" + "," + PINgenerator() + "," + Balancegenerator());
        // increase account number
        num++;
        // print record
        pw.println(num + "," + "Ben" + "," + PINgenerator() + "," + Balancegenerator());
        // increase account number
        num++;
        // print record
        pw.println(num + "," + "Kante" + "," + PINgenerator() + "," + Balancegenerator());
        // increase account number
        num++;
        // print record
        pw.println(num + "," + "Chisom" + "," + PINgenerator() + "," + Balancegenerator());
        // increase account number
        num++;
        // print record
        pw.println(num + "," + "Hota" + "," + PINgenerator() + "," + Balancegenerator());
        // increase account number
        num++;
        // print record
        pw.println(num + "," + "Oxlade" + "," + PINgenerator() + "," + Balancegenerator());
        // increase account number
        num++;
        // print record
        pw.println(num + "," + "Stones" + "," + PINgenerator() + "," + Balancegenerator());


        pw.close();
    }


    // function to randomly generate a unique pin for each user
    public static Long PINgenerator(){
        // pin range value
        Long max = 3000L;
        Long min = 1000L;

        String S_PIN = String.valueOf((int) (((Math.random())*(max-min)) + min));
        Long L_PIN = Long.parseLong(S_PIN);

        return L_PIN;
    }
    // end method

    // function to randomly generate a unique balance for each user
    public static Long Balancegenerator(){
        // balance range value
        Long max = 30000L;
        Long min = 1001L;

        String Sbal= String.valueOf((int) (((Math.random())*(max-min)) + min));
        Long Lbal = Long.parseLong(Sbal);

        return Lbal;
    }
    // end  method
}
