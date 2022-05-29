package com.example.demo4;

// Database.java
// Represent the Bank's information

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

// Represents information in an ArrayList

public class Database {

    // Array of the accounts
    static ArrayList<Account> accounts = new ArrayList<Account>();


    // create database
    public static void InitialiseDB(){
        // sample account
        Account acc104 = new Account(10L,"Sample",12L,20L);
        Account acc101 = new Account(10001L,"Tamilore",1234L,400L);
        Account acc102 = new Account(10002L,"Tobi",1324L,800L);
        Account acc103 = new Account(10003L,"Ife",1243L,700L);
        // sample ArrayList
        accounts.add(acc101);
        accounts.add(acc102);
        accounts.add(acc103);
        accounts.add(acc104);


        // create account objects

        Account acc1 = new Account(100000001L,"Joffrey",2266L,7614L);
        // create new account object
        Account acc2 = new Account(100000002L,"Ted",1861L,26990L);
        // create new account object
        Account acc3 = new Account(100000003L,"Zaha",2604L,27403L);
        // create new account object
        Account acc4 = new Account(100000004L,"Harry",1931L,25541L);
        // create new account object
        Account acc5 = new Account(100000005L,"Lampard",1293L,22884L);
        // create new account object
        Account acc6 = new Account( 100000006L,"Alexis",1465L,26265L);
        // create new account object
        Account acc7 = new Account(100000007L,"Jamie",2100L,2222L);
        // create new account object
        Account acc8 = new Account(100000008L,"Bran",1437L,11863L);
        // create new account object
        Account acc9 = new Account(100000009L,"Eddard",2051L,1843L);
        // create new account object
        Account acc10 = new Account(100000010L,"Samwell",2549L,5466L);
        // create new account object
        Account acc11 = new Account(100000011L,"Theon",1216L,24875L);
        // create new account object
        Account acc12 = new Account(100000012L,"Petyr",1292L,2255L);
        // create new account object
        Account acc13 = new Account(100000013L,"Robb",1972L,12502L);
        // create new account object
        Account acc14 = new Account( 100000014L,"Tuco",1302L,15723L);
        // create new account object
        Account acc15 = new Account( 100000015L,"Tywinn",2311L,28772L);
        // create new account object
        Account acc16 = new Account(100000016L,"Rue",2530L,12699L);
        // create new account object
        Account acc17 = new Account(100000017L,"Elliot",1583L,21330L);
        // create new account object
        Account acc18 = new Account( 100000018L,"Gia",1665L,21048L);
        // create new account object
        Account acc19 = new Account( 100000019L,"Otis",2320L,22463L);
        // create new account object
        Account acc20 = new Account(100000020L,"Maeve",1376L,2779L);
        // create new account object
        Account acc21 = new Account(100000021L,"Ruby",1483L,17968L);
        // create new account object
        Account acc22 = new Account(100000022L,"Jackson",1604L,18938L);
        // create new account object
        Account acc23 = new Account(100000023L,"Vivienne",2685L,18874L);
        // create new account object
        Account acc24 = new Account( 100000024L,"Olivia",1417L,1327L);
        // create new account object
        Account acc25 = new Account(100000025L,"Devi",1729L,18963L);
        // create new account object
        Account acc26 = new Account(100000026L,"Ben",2729L,19507L);
        // create new account object
        Account acc27 = new Account( 100000027L,"Aneesa",1129L,18390L);
        // create new account object
        Account acc28 = new Account(100000028L,"Haley",1579L,26062L);
        // create new account object
        Account acc29 = new Account(100000029L,"Alex",1218L,23423L);
        // create new account object
        Account acc30 = new Account(100000030L,"Phil",2605L,15309L);
        // create new account object
        Account acc31 = new Account(100000031L,"Claire",1897L,25477L);
        // create new account object
        Account acc32 = new Account(100000032L,"Lily",1831L,3948L);
        // create new account object
        Account acc33 = new Account(100000033L,"Jay",2114L,13162L);
        // create new account object
        Account acc34 = new Account(100000034L,"Joe",1973L,7227L);
        // create new account object
        Account acc35 = new Account(100000035L,"Mitchel",1773L,21035L);
        // create new account object
        Account acc36 = new Account(100000036L,"Andy",1087L,22258L);
        // create new account object
        Account acc37 = new Account(100000037L,"Asher",2905L,10105L);
        // create new account object
        Account acc38 = new Account(100000038L,"Andre",1562L,14037L);
        // create new account object
        Account acc39 = new Account(100000039L,"Kevin",1690L,22889L);
        // create new account object
        Account acc40 = new Account(100000040L,"Robert",2234L,29605L);
        // create new account object
        Account acc41 = new Account(100000041L,"Khal",2155L,8045L);
        // create new account object
        Account acc42 = new Account(100000042L,"Jaime",1692L,29509L);
        // create new account object
        Account acc43 = new Account(100000043L,"Sandor",2268L,26119L);
        // create new account object
        Account acc44 = new Account( 100000044L,"Tywin",1734L,27397L);
        // create new account object
        Account acc45 = new Account(100000045L,"Jean",1521L,9019L);
        // create new account object
        Account acc46 = new Account(100000046L,"Ife",2366L,14159L);
        // create new account object
        Account acc47 = new Account(100000047L,"Tobi",2077L,28127L);
        // create new account object
        Account acc48 = new Account(100000048L,"Collins",1749L,1472L);
        // create new account object
        Account acc49 = new Account(100000049L,"Chucks",1102L,24864L);
        // create new account object
        Account acc50 = new Account(100000050L,"Joshua",2041L,16017L);
        // create new account object
        Account acc51 = new Account(100000051L,"Shalom",1969L,2635L);
        // create new account object
        Account acc52 = new Account(100000052L,"Obiaga",1238L,10903L);
        // create new account object
        Account acc53 = new Account(100000053L,"Prosper",2707L,27766L);
        // create new account object
        Account acc54 = new Account(100000054L,"Ikechi",1779L,29025L);
        // create new account object
        Account acc55 = new Account(100000055L,"Feyisayo",1286L,13038L);
        // create new account object
        Account acc56 = new Account(100000056L,"Foluso",2956L,17205L);
        // create new account object
        Account acc57 = new Account(100000057L,"Elijah",1084L,14833L);
        // create new account object
        Account acc58 = new Account( 100000058L,"Philip",1966L,16925L);
        // create new account object
        Account acc59 = new Account(100000059L,"Angel",2268L,24782L);
        // create new account object
        Account acc60 = new Account(100000060L,"Camari",1823L,1432L);
        // create new account object
        Account acc61 = new Account(100000061L,"Okoroh",1705L,11006L);
        // create new account object
        Account acc62 = new Account(100000062L,"Wisdom",1306L,15747L);
        // create new account object
        Account acc63 = new Account(100000063L,"Mayorkun",1478L,27695L);
        // create new account object
        Account acc64 = new Account(100000064L,"Emmanuel",2585L,24900L);
        // create new account object
        Account acc65 = new Account(100000065L,"Kelechi",2167L,15855L);
        // create new account object
        Account acc66 = new Account(100000066L,"Amarachi",2270L,3275L);
        // create new account object
        Account acc67 = new Account(100000067L,"Layomi",1569L,13445L);
        // create new account object
        Account acc68 = new Account(100000068L,"Jowayne",1228L,12544L);
        // create new account object
        Account acc69 = new Account(100000069L,"Ayomide",2781L,23064L);
        // create new account object
        Account acc70 = new Account(100000070L,"Chibuikem",1708L,14086L);
        // create new account object
        Account acc71 = new Account(100000071L,"Dinesh",1211L,27559L);
        // create new account object
        Account acc72 = new Account(100000072L,"Rejin",1086L,2113L);
        // create new account object
        Account acc73 = new Account(100000073L,"Mariam",2417L,16644L);
        // create new account object
        Account acc74 = new Account(100000074L,"Onyinye",1813L,29038L);
        // create new account object
        Account acc75 = new Account(100000075L,"Derin",1500L,29667L);
        // create new account object
        Account acc76 = new Account(100000076L,"Hephzibah",1086L,14719L);
        // create new account object
        Account acc77 = new Account(100000077L,"Akwesi",2179L,29191L);
        // create new account object
        Account acc78 = new Account(100000078L,"Sopuruchi",1136L,16315L);
        // create new account object
        Account acc79 = new Account(100000079L,"Awantika",1666L,27907L);
        // create new account object
        Account acc80 = new Account(100000080L,"Bethel",2081L,14472L);
        // create new account object
        Account acc81 = new Account(100000081L,"Chinaza",1975L,6735L);
        // create new account object
        Account acc82 = new Account(100000082L,"Ann",1840L,15391L);
        // create new account object
        Account acc83 = new Account(100000083L,"Benzema",1400L,3659L);
        // create new account object
        Account acc84 = new Account(100000084L,"Karim",1704L,26181L);
        // create new account object
        Account acc85 = new Account(100000085L,"Robert",1563L,14961L);
        // create new account object
        Account acc86 = new Account(100000086L,"Okafor",1902L,17531L);
        // create new account object
        Account acc87 = new Account(100000087L,"King",1632L,20036L);
        // create new account object
        Account acc88 = new Account(100000088L,"Mike",2704L,23370L);
        // create new account object
        Account acc89 = new Account(100000089L,"Buhari",2130L,23896L);
        // create new account object
        Account acc90 = new Account(100000090L,"Musa",1443L,12690L);
        // create new account object
        Account acc91 = new Account(100000091L,"Victor",2056L,15819L);
        // create new account object
        Account acc92 = new Account(100000092L,"Davies",2205L,18084L);
        // create new account object
        Account acc93 = new Account(100000093L,"Timothy",2982L,23313L);
        // create new account object
        Account acc94 = new Account(100000094L,"Rodri",2889L,28919L);
        // create new account object
        Account acc95 = new Account(100000095L,"Ben",2250L,11734L);
        // create new account object
        Account acc96 = new Account(100000096L,"Kante",1817L,8240L);
        // create new account object
        Account acc97 = new Account(100000097L,"Chisom",2415L,10436L);
        // create new account object
        Account acc98 = new Account(100000098L,"Hota",1162L,26654L);
        // create new account object
        Account acc99 = new Account(100000099L,"Oxlade",1694L,13282L);
        // create new account object
        Account acc100 = new Account(100000100L,"Stones",1074L,25498L);


        // ArrayList Database

        // Add object to Array List
        accounts.add(acc1);
        // Add object to Array List
        accounts.add(acc2);
        // Add object to Array List
        accounts.add(acc3);
        // Add object to Array List
        accounts.add(acc4);
        // Add object to Array List
        accounts.add(acc5);
        // Add object to Array List
        accounts.add(acc6);
        // Add object to Array List
        accounts.add(acc7);
        // Add object to Array List
        accounts.add(acc8);
        // Add object to Array List
        accounts.add(acc9);
        // Add object to Array List
        accounts.add(acc10);
        // Add object to Array List
        accounts.add(acc11);
        // Add object to Array List
        accounts.add(acc12);
        // Add object to Array List
        accounts.add(acc13);
        // Add object to Array List
        accounts.add(acc14);
        // Add object to Array List
        accounts.add(acc15);
        // Add object to Array List
        accounts.add(acc16);
        // Add object to Array List
        accounts.add(acc17);
        // Add object to Array List
        accounts.add(acc18);
        // Add object to Array List
        accounts.add(acc19);
        // Add object to Array List
        accounts.add(acc20);
        // Add object to Array List
        accounts.add(acc21);
        // Add object to Array List
        accounts.add(acc22);
        // Add object to Array List
        accounts.add(acc23);
        // Add object to Array List
        accounts.add(acc24);
        // Add object to Array List
        accounts.add(acc25);
        // Add object to Array List
        accounts.add(acc26);
        // Add object to Array List
        accounts.add(acc27);
        // Add object to Array List
        accounts.add(acc28);
        // Add object to Array List
        accounts.add(acc29);
        // Add object to Array List
        accounts.add(acc30);
        // Add object to Array List
        accounts.add(acc31);
        // Add object to Array List
        accounts.add(acc32);
        // Add object to Array List
        accounts.add(acc33);
        // Add object to Array List
        accounts.add(acc34);
        // Add object to Array List
        accounts.add(acc35);
        // Add object to Array List
        accounts.add(acc36);
        // Add object to Array List
        accounts.add(acc37);
        // Add object to Array List
        accounts.add(acc38);
        // Add object to Array List
        accounts.add(acc39);
        // Add object to Array List
        accounts.add(acc40);
        // Add object to Array List
        accounts.add(acc41);
        // Add object to Array List
        accounts.add(acc42);
        // Add object to Array List
        accounts.add(acc43);
        // Add object to Array List
        accounts.add(acc44);
        // Add object to Array List
        accounts.add(acc45);
        // Add object to Array List
        accounts.add(acc46);
        // Add object to Array List
        accounts.add(acc47);
        // Add object to Array List
        accounts.add(acc48);
        // Add object to Array List
        accounts.add(acc49);
        // Add object to Array List
        accounts.add(acc50);
        // Add object to Array List
        accounts.add(acc51);
        // Add object to Array List
        accounts.add(acc52);
        // Add object to Array List
        accounts.add(acc53);
        // Add object to Array List
        accounts.add(acc54);
        // Add object to Array List
        accounts.add(acc55);
        // Add object to Array List
        accounts.add(acc56);
        // Add object to Array List
        accounts.add(acc57);
        // Add object to Array List
        accounts.add(acc58);
        // Add object to Array List
        accounts.add(acc59);
        // Add object to Array List
        accounts.add(acc60);
        // Add object to Array List
        accounts.add(acc61);
        // Add object to Array List
        accounts.add(acc62);
        // Add object to Array List
        accounts.add(acc63);
        // Add object to Array List
        accounts.add(acc64);
        // Add object to Array List
        accounts.add(acc65);
        // Add object to Array List
        accounts.add(acc66);
        // Add object to Array List
        accounts.add(acc67);
        // Add object to Array List
        accounts.add(acc68);
        // Add object to Array List
        accounts.add(acc69);
        // Add object to Array List
        accounts.add(acc70);
        // Add object to Array List
        accounts.add(acc71);
        // Add object to Array List
        accounts.add(acc72);
        // Add object to Array List
        accounts.add(acc73);
        // Add object to Array List
        accounts.add(acc74);
        // Add object to Array List
        accounts.add(acc75);
        // Add object to Array List
        accounts.add(acc76);
        // Add object to Array List
        accounts.add(acc77);
        // Add object to Array List
        accounts.add(acc78);
        // Add object to Array List
        accounts.add(acc79);
        // Add object to Array List
        accounts.add(acc80);
        // Add object to Array List
        accounts.add(acc81);
        // Add object to Array List
        accounts.add(acc82);
        // Add object to Array List
        accounts.add(acc83);
        // Add object to Array List
        accounts.add(acc84);
        // Add object to Array List
        accounts.add(acc85);
        // Add object to Array List
        accounts.add(acc86);
        // Add object to Array List
        accounts.add(acc87);
        // Add object to Array List
        accounts.add(acc88);
        // Add object to Array List
        accounts.add(acc89);
        // Add object to Array List
        accounts.add(acc90);
        // Add object to Array List
        accounts.add(acc91);
        // Add object to Array List
        accounts.add(acc92);
        // Add object to Array List
        accounts.add(acc93);
        // Add object to Array List
        accounts.add(acc94);
        // Add object to Array List
        accounts.add(acc95);
        // Add object to Array List
        accounts.add(acc96);
        // Add object to Array List
        accounts.add(acc97);
        // Add object to Array List
        accounts.add(acc98);
        // Add object to Array List
        accounts.add(acc99);
        // Add object to Array List
        accounts.add(acc100);

    }
    // end method



    // retrieving object information using accountnumber
    public static Account getAccount(Long accountnumber){
        for (Account currentaccount : accounts){
            if (currentaccount.getAccountNumber() == accountnumber){
                // if a match is found
                return currentaccount;
            }
        } // end for loop

        // if no match is found
        return null;
    }
    // end method



    // retrieving object information using PIN
    public static Account getAccountPin(Long pin){
        for (Account currentaccount : accounts){
            if (currentaccount.getPinNumber() == pin){
                // if a match is found
                return currentaccount;
            }
        } // end for loop

        // if no match is found
        return null;
    }
    // end method



    // check if user credentials are valid
    public static Account validateUser(Long accountNumber, Long pin){
        System.out.println("validateUser method");
        InitialiseDB();
        // verify the account
        System.out.println(accounts.toString());
        for (Account currentaccount : accounts) {
            System.out.println("ACNo " + currentaccount.getAccountNumber() + " - " + accountNumber);
            System.out.println("PinNo " + currentaccount.getPinNumber() + " - " + pin);

            if (currentaccount.getAccountNumber().equals(accountNumber) && currentaccount.getPinNumber().equals(pin)) {
                // if the credentials match database
                System.out.println("user is Valid");
                return currentaccount;
            } // end if statement
        } // end for loop
        return null;
    } // end method



    // return the available balance of a specific account
    public static double getBalance(int accountnumber){
        return getAccount((long) accountnumber).getAvailableBalance();
    }
    // end method getBalance()


    // credit a specific account with an amount
    public static void Credit(Long accountnumber, Long amount){
        getAccount(accountnumber).credit(amount);
    }
    // end method Credit()


    // debit an amount from a specific account
    public static void Debit(Long accountnumber, Long amount){
        getAccount(accountnumber).debit(amount);
    }
    // end method Debit()


    // read CSV file
    public static void readDatabase() throws IOException {
        FileReader fr = new FileReader("BankDatabase.csv");
        BufferedReader br = new BufferedReader(fr);

        String line = br.readLine();
        line = br.readLine();

        while(line!=null){
            String[] items = line.split(",");
            line = br.readLine();

            Long AccountNumber = Long.parseLong(items[0]);
            String AccountName = items[1];
            Long PIN = Long.parseLong(items[2]);
            Long Balance = Long.parseLong(items[3]);

            Account acc = new Account(AccountNumber,AccountName,PIN,Balance);


        }
        // end while loop
    }
    // end method

}
// end class
