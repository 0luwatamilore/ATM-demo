package com.example.demo4;

// Screen.java
// Represents the Automated Teller Machine

// class imports
import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;


public class Screen extends Application {

    // empty account
    Account account;

    // account number
    Long accountNumber;

    // ATM screen stage
    Stage stage;

    // LoginGUI grid
    GridPane grid1;

    // menuGUI grid
    GridPane grid2;

    // balanceGUI grid
    GridPane grid3;

    // withdrawGUI grid
    GridPane grid4;

    // depositGUI grid
    GridPane grid5;

    // WithdrawPage grid
    GridPane grid6;

    // DepositPage grid
    GridPane grid7;

    // loginGUI scene
    Scene scene1;

    // menuGUI scene
    Scene scene2;

    // balanceGUI scene
    Scene scene3;

    // withdrawGUI scene
    Scene scene4;

    // depositGUI scene
    Scene scene5;

    // WithdrawPage scene
    Scene scene6;

    // DepositPage scene
    Scene scene7;
    Text empty;

    // create balance information variable
    Text balanceInformation;
    Text withdrawInformation;
    Text depositInformation;

    // create balance variable
    Text balance;

    // create loginGUI scene title
    Text scenetitle1;

    // create menuGUI scene title
    Text scenetitle2;

    // balanceGUI scene title
    Text scenetitle3;

    // withdrawGUI scene title
    Text scenetitle4;

    // depositGUI scene title
    Text scenetitle5;
    Text scenetitle6;
    Text scenetitle7;

    // create account number input variable
    TextField accountinput;

    // create PIN input variable
    TextField PINinput;

    // creates amount input variable
    TextField otherfield;
    // creates amount input variable
    TextField otherfieldWithdraw;

    // create account number variable
    Label label1;

    // create PIN variable
    Label label2;

    // create balance variable
    Label label3;

    // create withdraw variable
    Label label4;

    // create deposit variable
    Label label5;

    // create exit variable
    Label label6;

    // create available balance variable
    Label label7;

    // create withdraw $20 variable
    Label label8;

    // create withdraw $40 variable
    Label label9;

    // create withdraw $80 variable
    Label label10;

    // create withdraw $100 variable
    Label label11;

    // create withdraw $200 variable
    Label label12;

    // create withdraw other amount variable
    Label label13;

    // create withdraw amount input variable
    Label label14;

    // create deposit variable
    Label label15;

    // create deposit $20 variable
    Label label16;

    // create deposit $40 variable
    Label label17;

    // create deposit $80 variable
    Label label18;

    // create deposit $100 variable
    Label label19;

    // create deposit $200 variable
    Label label20;

    // create deposit other amount input variable
    Label label21;
    Label label22;
    Label label23;
    Label label24;
    Label label25;
    Label label26;
    Label label27;

    Button loginbutton;

    // create withdraw $20 button
    Button B1;

    // create withdraw $40 button
    Button B2;

    // create withdraw $80 button
    Button B3;

    // create withdraw $100 button
    Button B4;

    // create withdraw $200 button
    Button B5;

    // create deposit $20 button
    Button B6;

    // create deposit $40 button
    Button B7;

    // create deposit $80 button
    Button B8;

    // create deposit $100 button
    Button B9;

    // create deposit $200 button
    Button B10;
    Button Exit;

    // create exit button on menuGUI
    Button MenuExit;

    // create exit button on balanceGUI
    Button BalanceExit;

    // create exit button on withdrawGUI
    Button WithdrawExit;

    // create exit button on depositGUI
    Button DepositExit;

    Button WithdrawPageBack;
    Button WithdrawPageExit;
    Button DepositPageBack;
    Button DepositPageExit;

    // create enter button on withdrawGUI
    Button WithdrawEnter;

    // create enter button on depositGUI
    Button DepositEnter;

    // create login button on loginGUI
    Button signinbutton;

    // create Balance button
    Button Balance;

    // create withdraw button
    Button Withdraw;

    // create deposit button
    Button Deposit;

    // create account number variable
    int accnum = 0;

    // create PIN variable
    int pin = 0;

    // create count variable
    int count;

    // create HBox variable
    HBox hbtn;
    HBox hbtn2;


    // prints information out on the console
    public void displayMessage (String message){
        System.out.print(message);
    }
    // end method displayMessage

    // prints message onto the console
    public void displayMessageLine(String message){
        System.out.println(message);
    }
    // end method displayMessageLine

    // prints the amount onto the console
    public void displayAmount(double amount){
        System.out.println("$"+amount);
    }
    // end of displayAmount method



    // create a login page
    public void loginGUI(){
        // initialize the stage variable
        stage = new Stage();

        // set a title to the stage
        stage.setTitle("ATM");
        // initialize the grid1
        grid1 = new GridPane();
        // format grid1
        grid1.setAlignment(Pos.CENTER);
        grid1.setVgap(20);
        grid1.setHgap(20);
        grid1.setPadding(new Insets(25, 25, 25, 25));

        // initialize scene1
        scene1 = new Scene(grid1, 350, 275);
        // add scene1 to the stage
        stage.setScene(scene1);

        // Scene title
        scenetitle1= new Text("Welcome");
        // initialize scenetitle1
        scenetitle1.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        grid1.add(scenetitle1, 0, 0, 2, 1);

        // Label
        label1 = new Label("Account number:");
        // initialize label1
        label1.setWrapText(true);
        grid1.add(label1, 0, 1);

        // account number field
        accountinput = new TextField("Acc.no");
        // initialize account input textfield
        grid1.add(accountinput, 1, 1);

        // PIN label
        label2 = new Label("PIN:");
        // initialize label2
        grid1.add(label2, 0, 2);

        // PIN field
        PINinput = new TextField();
        // initialize PIN textfield
        PINinput.setPromptText("PIN");
        grid1.add(PINinput, 1, 2);


        // sign in button
        signinbutton = new Button("Sign in");
        // initialize signin button
        HBox hbtn = new HBox(10);
        // initialize HBox
        hbtn.setAlignment(Pos.BOTTOM_RIGHT);
        hbtn.getChildren().add(signinbutton);
        grid1.add(hbtn, 1, 4);


        // attach an action to signin button
        signinbutton.setOnAction(e -> {
            // attach accountinput value to accountNumber
            accountNumber = Long.parseLong(accountinput.getText());
            // attach PINinput value to pinNumber
            Long pinNumber = Long.parseLong(PINinput.getText());
            // checks if the user credentials are valid
            account = new Account();
            // initialize account object
            account = Database.validateUser(accountNumber,pinNumber);
            if (account != null){

                // if the user is valid it connects the user to scene2
                menuGUI();
                stage.setScene(scene2);
                displayMessageLine("-------------------------------------------------------------------------------------------------");
                // prints the user's name onto the console
                displayMessageLine("Welcome " + account.getAccountName());
                displayMessageLine("-------------------------------------------------------------------------------------------------");
                // prints the user's credentials onto the console
                displayMessageLine("Account Number: " + account.getAccountNumber());
                displayMessageLine("PIN: " + account.getPinNumber());
                displayMessageLine("Available Balance: $" + account.getAvailableBalance());
                displayMessageLine("-------------------------------------------------------------------------------------------------");

            }
            // end if statement
            else{
                // prints text on the loginGUI
                Text invalid = new Text("INVALID Credentials");
                grid1.add(invalid,1,5);
            }
            // end else statement
        });
        // end button method

        // display GUI on screen
        stage.show();

    }
    // end loginGUI method



    // create menu page
    public void menuGUI(){
        // attach accountinput value to accountNumber
        Long accountNumber = Long.parseLong(accountinput.getText());
        // attach accountName to name
        String name = account.getAccountName();

        // initialize grid2
        grid2 = new GridPane();
        grid2.setVgap(20);
        grid2.setHgap(20);
        // initialize scenetitle2
        scenetitle2 = new Text("Welcome " + name);
        grid2.add(scenetitle2,1,2,2,1);

        // initialize scene2
        scene2 = new Scene(grid2, 480, 300);
//        stage.setScene(scene2);

        // initialize label3
        label3 = new Label("1 - Balance");
        grid2.add(label3,1,4);
        // initialize label4
        label4 = new Label("2 - Withdrawal");
        grid2.add(label4,3,4);
        // initialize label5
        label5 = new Label("3 - Deposit");
        grid2.add(label5,5,4);
        // initialize label6
        label6 = new Label("4 - Exit");
        grid2.add(label6,7,4);

        // initialize Balance Button
        Balance = new Button("  Balance  ");
        grid2.add(Balance,1, 6);
        // attach action to Balance Button
        Balance.setOnAction(e -> {
            // connect user to scene 3
            balanceGUI();
            stage.setScene(scene3);
        });
        // end of button method

        // initialize Withdraw button
        Withdraw = new Button("  Withdraw  ");
        grid2.add(Withdraw, 3, 6);
        // attach action to withdraw button
        Withdraw.setOnAction(e ->{
            // connect the user to scene 4
            withdrawGUI();
            stage.setScene(scene4);
        });
        // end of button method

        // initialize deposit button
        Deposit = new Button("  Deposit  ");
        grid2.add(Deposit,5, 6);
        // attach action to deposit button
        Deposit.setOnAction(e ->{
            // connects the user to scene 5
            depositGUI();
            stage.setScene(scene5);
        });
        // end of button method

        // initialize menu exit button
        MenuExit = new Button("  Exit  ");
        grid2.add(MenuExit, 7, 6);
        // attach action to button
        MenuExit.setOnAction(e ->{
            // force program to stop
            Platform.exit();
        });
        // end of method

//        stage.show();

    }
    // end menuGUI method



    // create balance page
    public void balanceGUI(){

        // initialize grid3
        grid3 = new GridPane();
        grid3.setVgap(20);
        grid3.setHgap(20);
        // initialize scenetitle3
        scenetitle3 = new Text("Hello");
        scenetitle3.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        grid3.add(scenetitle3,1,2,2,1);

        // initialize scene3
        scene3 = new Scene(grid3, 450, 300);
//        stage.setScene(scene3);

        // initialize balanceinformation text
        balanceInformation = new Text("Balance Information ");
        grid3.add(balanceInformation, 1, 4, 2, 1);
        // initialize label7
        label7 = new Label("Available Balance: ");
        grid3.add(label7,1,5);

        // attach user balance to bal
        Long bal = account.getAvailableBalance();

        // initialize balance
        balance = new Text("Your Available Balance is $" + Long.toString(bal));
        grid3.add(balance,2,5);

        // initialize balance exit button
        BalanceExit = new Button("    Back    ");
        hbtn = new HBox(10);
        hbtn.setAlignment(Pos.BOTTOM_RIGHT);
        hbtn.getChildren().add(BalanceExit);
        grid3.add(hbtn, 2, 7);

        // attach an action to button
        BalanceExit.setOnAction(e ->{
            // take the user back to menu page
            stage.setScene(scene2);
        });
        // end of button method


        stage.show();
    }
    // end of balanceGUI method



    // create withdraw page
    public void withdrawGUI(){

        // initialize grid 4
        grid4 = new GridPane();
        grid4.setVgap(10);
        grid4.setHgap(10);
        // initialize scene 4
        scene4 = new Scene(grid4, 650, 300);
        // initialize scenetitle4
        scenetitle4 = new Text("Hello");
        scenetitle4.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        grid4.add(scenetitle4,1,2,2,1);
//        stage.setScene(scene4);

        // create withdraw information label
        Label WithdrawInformation = new Label("Withdraw Menu: ");
        WithdrawInformation.setMaxWidth(100);
        grid4.add(WithdrawInformation,1,3,2,1);
        // initialize label 8
        label8 = new Label(" 1 - $20 ");
        grid4.add(label8,2,4);
        // initialize button 1
        B1 = new Button();
        B1.setText(" $20 ");
        grid4.add(B1,2,6);
        // initialize label 9
        label9 = new Label(" 2 - $40 ");
        grid4.add(label9,4,4);
        // initialize button 2
        B2 = new Button();
        B2.setText(" $40 ");
        grid4.add(B2,4,6);
        // initialize label 10
        label10 = new Label(" 3 - $80 ");
        grid4.add(label10,6,4);
        // initialize button3
        B3 = new Button();
        B3.setText(" $80 ");
        grid4.add(B3,6,6);
        // initialize label 11
        label11 = new Label(" 4 - $100 ");
        grid4.add(label11,8,4);
        // initialize button 4
        B4 = new Button();
        B4.setText(" $100 ");
        grid4.add(B4,8,6);
        // initialize label 12
        label12 = new Label(" 5 - $200 ");
        grid4.add(label12,10,4);
        // initialize button 5
        B5 = new Button();
        B5.setText(" $200 ");
        grid4.add(B5,10,6);
        // initialize label 13
        label13 = new Label("Choose an Amount ");
        label13.setWrapText(true);
//        label13.setMaxWidth(400);
        grid4.add(label13,1,4);
        // initialize label 14
        label14 = new Label();
        label14.setText("Other: ");
        grid4.add(label14,1,8);
        // initialize other text field
        otherfieldWithdraw = new TextField();
        otherfieldWithdraw.setPromptText(" Input amount in Dollars ");
        otherfieldWithdraw.setMinWidth(80);
        grid4.add(otherfieldWithdraw,2,8);

        // initialize count variable
        count = 1;
        // withdraw == 1


        // attach action to B1 button
        B1.setOnAction(e -> {
            // call withdraw function
            B1WithdrawMethod();
            // call withdrawPage method
            WithdrawPage();
            stage.setScene(scene6);
        });
        // end button method

        // attach action to B2 button
        B2.setOnAction(e -> {
            // call withdraw method
            B2WithdrawMethod();
            // call withdrawPage method
            WithdrawPage();
            stage.setScene(scene6);
        });
        // end button method

        //attach action B3 button
        B3.setOnAction(e -> {
            // call withdraw function
            B3WithdrawMethod();
            // call withdrawPage method
            WithdrawPage();
            stage.setScene(scene6);
        });
        // end button method

        // attach action to B4 button
        B4.setOnAction(e -> {
            // call withdraw function
            B4WithdrawMethod();
            // call withdrawPage method
            WithdrawPage();
            stage.setScene(scene6);
        });
        // end button method

        // attach action to B5 button
        B5.setOnAction(e -> {
            // call withdraw function
            B5WithdrawMethod();
            // call withdrawPage method
            WithdrawPage();
            stage.setScene(scene6);
        });
        // end button method


        // initialize withdraw enter button
        WithdrawEnter = new Button();
        WithdrawEnter.setText(" Enter ");
        // attach action to button
        WithdrawEnter.setOnAction(e ->{
            count = 1;
            // call OtherWithdrawMethod() function
            OtherWithdrawMethod();
            // call withdrawPage method
            WithdrawPage();
            stage.setScene(scene6);
        });
        // end button method

        grid4.add(WithdrawEnter,3,9);

        // initialize withdraw exit button
        WithdrawExit = new Button("Cancel");
        grid4.add(WithdrawExit, 4, 9);

        // attach action to withdraw exit button
        WithdrawExit.setOnAction(e ->{
            // take the user to menu page
            stage.setScene(scene2);
        });
        // end button method

        stage.show();

    }
    // end withdrawGUI method

    public void WithdrawPage(){
        // initialize grid 6
        grid6 = new GridPane();
        grid6.setHgap(20);
        grid6.setVgap(20);

        // initialize scene title 6
        scenetitle6 = new Text("Hello");
        scenetitle6.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        grid6.add(scenetitle6,1,2,2,1);

        // initialize scene 6
        scene6 = new Scene(grid6,450,300);

        // initialize label 22
        label22 = new Label();
        label22.setText("Please Wait..... Dispensing cash.....");
        grid6.add(label22,1,3);

        // initialize label 23
        label23 = new Label();
        label23.setText("PLEASE DO NOT REMOVE ATM CARD!");
        grid6.add(label23,1,4);

        // create new balance variable
        Long bal = account.getAvailableBalance();
        // initialize label 24
        label24 = new Label();
        label24.setText("Your Available Balance is now......... $" + Long.toString(bal));
        grid6.add(label24,1,5);


        // initialize WithdrawPage Back button
        WithdrawPageBack = new Button();
        WithdrawPageBack.setText("    Back    ");
        grid6.add(WithdrawPageBack,2,7);


        // attach action to button
        WithdrawPageBack.setOnAction(e ->{
            // take the user back to withdraw page
            stage.setScene(scene4);
        });
        // end button method



        // initialize WithdrawPage Exit button
        WithdrawPageExit = new Button();
        WithdrawPageExit.setText("    Cancel    ");
        grid6.add(WithdrawPageExit,3,7);


        // attach action to button
        WithdrawPageExit.setOnAction(e ->{
            // take the user back to menu page
            stage.setScene(scene2);
        });
        // end button method




        stage.show();

    }
    // end method


    // create B1 withdrawal method
    public void B1WithdrawMethod(){

        // call debit method
        account.debit(20L);
        displayMessageLine("Transaction Complete ");
        displayMessageLine("New Balance - $" + account.getAvailableBalance());
        displayMessageLine("-------------------------------------------------------------------------------------------------");

    }
    // end method


    // create B2WithdrawMethod method
    public void B2WithdrawMethod(){

        // call debit method
        account.debit(40L);
        displayMessageLine("New Balance - $" + account.getAvailableBalance());
        displayMessageLine("-------------------------------------------------------------------------------------------------");

    }
    // end method


    // create B3WithdrawMethod method
    public void B3WithdrawMethod(){

        // call debit method
        account.debit(80L);
        displayMessageLine("New Balance - $" + account.getAvailableBalance());
        displayMessageLine("-------------------------------------------------------------------------------------------------");

    }
    // end method


    // create B4WithdrawMethod method
    public void B4WithdrawMethod(){

        // call debit method
        account.debit(100L);
        displayMessageLine("New Balance - $" + account.getAvailableBalance());
        displayMessageLine("-------------------------------------------------------------------------------------------------");
    }
    // end method


    // create B5WithdrawMethod method
    public void B5WithdrawMethod(){

        // call debit method
        account.debit(200L);
        displayMessageLine("New Balance - $" + account.getAvailableBalance());
        displayMessageLine("-------------------------------------------------------------------------------------------------");
    }
    // end method


    // create OtherWithdrawMethod method
    public void OtherWithdrawMethod(){
        count = 1;

        Long amt = Long.parseLong(otherfieldWithdraw.getText());
        // call debit method
        account.debit(amt);
        displayMessageLine("New Balance - $" + account.getAvailableBalance());
        displayMessageLine("-------------------------------------------------------------------------------------------------");

    }
    // end method



    // create deposit page
    public void depositGUI(){

        // initialize grid 5
        grid5 = new GridPane();
        grid5.setVgap(10);
        grid5.setHgap(10);
        // initialize scene 5
        scene5 = new Scene(grid5, 650, 300);
        scenetitle5 = new Text("Hello");
        scenetitle5.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        grid5.add(scenetitle5,1,2,2,1);


        // initialize label 15
        label15 = new Label("Please enter a deposit amount");
        grid5.add(label15,1,3,2,1);

        // create deposit information label
        Label DepositInformation = new Label();
        DepositInformation.setText("Deposit Menu: ");
        DepositInformation.setMaxWidth(100);
        grid5.add(DepositInformation,1,4);
        // initialize label 16
        label16 = new Label(" 1 - $20 ");
        grid5.add(label16,2,4);
        // initialize B6 button
        B6 = new Button();
        B6.setText(" $20 ");
        grid5.add(B6,2,6);
        // initialize label 17
        label17 = new Label(" 2 - $40 ");
        grid5.add(label17,4,4);
        // initialize B7 button
        B7 = new Button();
        B7.setText(" $40 ");
        grid5.add(B7,4,6);
        // initialize label 18
        label18 = new Label(" 3 - $80 ");
        grid5.add(label18,6,4);
        // initialize B8 button
        B8 = new Button();
        B8.setText(" $80 ");
        grid5.add(B8,6,6);
        // initialize label 19
        label19 = new Label(" 4 - $100 ");
        grid5.add(label19,8,4);
        // initialize B9 button
        B9 = new Button();
        B9.setText(" $100 ");
        grid5.add(B9,8,6);
        // initialize label 20
        label20 = new Label(" 5 - $200 ");
        grid5.add(label20,10,4);
        // initialize B10 button
        B10 = new Button();
        B10.setText(" $200 ");
        grid5.add(B10,10,6);
        // initialize label 21
        label21 = new Label();
        label21.setText("Other: ");
        grid5.add(label21,1,8);
        // initialize otherfield TextField
        otherfield = new TextField();
        otherfield.setPromptText(" Input amount in Dollars ");
        otherfield.setMinWidth(80);
        grid5.add(otherfield,2,8);

        // initialize count
        count = 2;
        // deposit == 2

        // attach action to B6 button
        B6.setOnAction(e -> {
            // call deposit function
            B6DepositMethod();
            // call DepositPage function
            DepositPage();
            stage.setScene(scene7);
        });
        // end button method

        // attach action to B7 button
        B7.setOnAction(e -> {
            // call deposit function
            B7DepositMethod();
            // call DepositPage function
            DepositPage();
            stage.setScene(scene7);
        });
        // end button method

        // attach action to B8 button
        B8.setOnAction(e -> {
            // call deposit function
            B8DepositMethod();
            // call DepositPage function
            DepositPage();
            stage.setScene(scene7);
        });
        // end button method

        // attach action to B9 button
        B9.setOnAction(e -> {
            // call deposit function
            B9DepositMethod();
            // call DepositPage function
            DepositPage();
            stage.setScene(scene7);
        });
        // end button method

        // attach action to B10 button
        B10.setOnAction(e -> {
            // call deposit function
            B10DepositMethod();
            // call DepositPage function
            DepositPage();
            stage.setScene(scene7);
        });
        // end button method


        // initialize Deposit enter button
        DepositEnter = new Button();
        DepositEnter.setText(" Enter ");
        // attach action to button
        DepositEnter.setOnAction(e ->{
            if (count == 2){
                // call deposit function
                OtherDepositMethod();
                // call DepositPage function
                DepositPage();
                stage.setScene(scene7);
            }
            // end if statement
        });
        // end button method

        grid5.add(DepositEnter,3,9);


        // initialize deposit exit button
        DepositExit = new Button("Cancel");
        grid5.add(DepositExit, 4, 9);
        // attach action to button
        DepositExit.setOnAction(e ->{
            // take user back menu page
            stage.setScene(scene2);
        });
        // end button method

        stage.show();


    }
    // end method


    public void DepositPage(){
        // initialize grid 7
        grid7 = new GridPane();
        grid7.setHgap(20);
        grid7.setVgap(20);
        // initialize scene title 7
        scenetitle7 = new Text("Hello");
        scenetitle7.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        grid7.add(scenetitle7,1,2,2,1);
        // initialize scene 7
        scene7 = new Scene(grid7,450,300);

        // initialize label 25
        label25 = new Label();
        label25.setText("Please Wait..... Depositing cash.....");
        grid7.add(label25,1,3);

        // initialize label 26
        label26 = new Label();
        label26.setText("PLEASE DO NOT REMOVE ATM CARD!");
        grid7.add(label26,1,4);

        // create new balance variable
        Long bal = account.getAvailableBalance();
        // initialize label 27
        label27 = new Label();
        label27.setText("Your Available Balance is now......... $" + Long.toString(bal));
        grid7.add(label27,1,5);


        // initialize DepositPage Back button
        DepositPageBack = new Button();
        DepositPageBack.setText("    Back    ");
        grid7.add(DepositPageBack,2,7);

        // attach action to button
        DepositPageBack.setOnAction(e ->{
            // take the user back to deposit page
            stage.setScene(scene5);
        });
        // end button method



        // initialize DepositPage Exit button
        DepositPageExit = new Button();
        DepositPageExit.setText("    Cancel    ");
        grid7.add(DepositPageExit,3,7);

        // attach action to button
        DepositPageExit.setOnAction(e ->{
            // take the user back to menu page
            stage.setScene(scene2);
        });
        // end button method



        stage.show();
    }
    // end method



    // create B6DepositMethod method
    public void B6DepositMethod(){
        // call credit function
        account.credit(20L);
        displayMessageLine("New Balance - $" + account.getAvailableBalance());
        displayMessageLine("-------------------------------------------------------------------------------------------------");

    }
    // end method


    // create B7DepositMethod method
    public void B7DepositMethod(){
        // call credit function
        account.credit(40L);
        displayMessageLine("New Balance - $" + account.getAvailableBalance());
        displayMessageLine("-------------------------------------------------------------------------------------------------");

    }
    // end method


    // create B8DepositMethod method
    public void B8DepositMethod(){
        // call credit function
        account.credit(80L);
        displayMessageLine("New Balance - $" + account.getAvailableBalance());
        displayMessageLine("-------------------------------------------------------------------------------------------------");

    }
    // end method


    // create B9DepositMethod method
    public void B9DepositMethod(){
        // call credit function
        account.credit(100L);
        displayMessageLine("New Balance - $" + account.getAvailableBalance());
        displayMessageLine("-------------------------------------------------------------------------------------------------");

    }
    // end method


    // create B10DepositMethod method
    public void B10DepositMethod(){
        // call credit function
        account.credit(200L);
        displayMessageLine("New Balance - $" + account.getAvailableBalance());
        displayMessageLine("-------------------------------------------------------------------------------------------------");

    }
    // end method


    // create OtherDepositMethod method
    public void OtherDepositMethod(){
        count = 2;
        Long amt = Long.parseLong(otherfield.getText());
        // call credit function
        account.credit(amt);
        displayMessageLine("New Balance - $" + account.getAvailableBalance());
        displayMessageLine("-------------------------------------------------------------------------------------------------");

    }
    // end method




    // Run function
    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("ATM");

        Database.InitialiseDB();

        loginGUI();

    }
    // end method

}
// end class
