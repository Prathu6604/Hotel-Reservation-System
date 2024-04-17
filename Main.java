/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codealpha;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
class A {
    Scanner sc = new Scanner (System.in);
    int room1p = 600;
    int room2p = 700;
    int suit1p = 900;
    int suit2p = 1100;
    int suit3p = 1500;
    int room1a = 20;
    int room2a = 15;
    int suit1a = 10;
    int suit2a = 12;
    int suit3a = 5;
    int nroom1,nroom2,nsuit1,nsuit2,nsuit3;
    int indt,inmon,inyr,chooseroom;
    long daysDifference;
    long monthsDifference;
    A(){
    System.out.println("Book a Stay ?...");
    }
    void hotels(){
    System.out.println("\nRoom And Suits \n");
    System.out.println("STUDIO QUEEN \nThe studio queen is 230 square feet sleeps two in a Queen bed and "
            + "features a walk-in shower and high Celling.\n\n$" +room1p+"\night inc.taxes | "+room1a+"Available\nReserve Room? ...Press1\n_____________________\n");
    System.out.println("CLASSIC QUEEN \nThe classic queen is 260 square feet sleeps two in a Queen bed and "
            + "features large windows and a custom desk.\n\n$" +room2p+"\night inc.taxes | "+room2a+"Available\nReserve Room? ...Press2\n_____________________\n");
    System.out.println("CHARIOT LOFT SUITE \nThe Orchard Loft Suit is 600 square feet sleeps two in a King bed and "
            + "features an Expensive living area. oversized wrap-around windows and a large European style"
            + " bathroom with either a walk-in showeror tub\n\n$" +suit1p+"\night inc.taxes | "+suit1a+"Available\nReserve Room? ...Press3\n_____________________\n");
    System.out.println("TWO BEDROOM SUPREME SUIT \nThe two bedroom supreme Suit has king beds and sleeps four in the style of a classic two bed rooms / two bath. the suit is 800 square feet, with a private foyer,"
            + "and features twositting and dinning areas, and swepping city skyline views " +suit2p+"\night inc.taxes | "+suit2a+"Available\nReserve Room? ...Press4\n_____________________\n");
    System.out.println("(Special) DESIGN SUIT \n our largest room,the design suit is 800 square feet and feature a living room dinning room,bedroom, walkthrough closet and oversized bathrooms.it also boasts sweeping views of the Manhatian skyline has two televisions with Apple TV and an enhanced minibar with Subzero fridge.\n\n$"+suit3p+"/night inc.taxes |" +suit3a+"Available\nReserve Room? ...Press5\n_____________________\n");

    System.out.print("Which Room You'd like to book?....");
    chooseroom = sc.nextInt();
    }
    void detail(){
    Scanner ss=new Scanner(System.in);
    System.out.print("\nEnter Your Name : ");
    String name= ss.nextLine();
    }
    void room(){
     System.out.println("\nCheck In : ");
      System.out.print("Year : ");
      int iyy = sc.nextInt();
      System.out.print("Month : ");
      int imm = sc.nextInt();
       System.out.print("Date : ");
       int idd = sc.nextInt();
       LocalDate date1 = LocalDate.of( iyy,imm,idd);
           System.out.println("\nCheck out : ");
               System.out.println("Year : ");
                int oyy = sc.nextInt();
      System.out.print("Month : ");
      int omm = sc.nextInt();
       System.out.print("Date : ");
       int odd = sc.nextInt();
       LocalDate date2 = LocalDate.of( oyy,omm,odd);
    }
    void book(){
    System.out.print("\nNumber of Rooms : ");
    switch(chooseroom){
        case 1:
            nroom1=sc.nextInt();
            if(nroom1 <= room1a && daysDifference >=1){
            System.out.println("\nTotal Amount :$"+(nroom1*room1p*daysDifference));
            room1a = room1a - nroom1;
            }
            else if(nroom1 <= room1a && daysDifference ==0){
             System.out.println("\nTotal Amount :$"+(nroom1*room1p));
             room1a = room1a - nroom1;
            }
            else if(nroom1 <= room1a && daysDifference < 0){
             System.out.println("\nInvalid Date");
            }
            else{
                System.out.println("Only"+room1a+"Available");
            }
        break;
        case 2:
            nroom2 = sc.nextInt();
           if(nroom1 <= room2a && daysDifference >=1){
            System.out.println("\nTotal Amount :$"+(nroom2*room2p*daysDifference));
            room2a = room2a - nroom2;
            }
           else if(nroom2 <= room2a && daysDifference ==0){
             System.out.println("\nTotal Amount :$"+(nroom1*room1p));
             room2a = room2a - nroom2;
            }
            else if(nroom2 <= room2a && daysDifference < 0){
             System.out.println("\nInvalid Date");
            }
            else{
                System.out.println("Only"+room2a+"Available");
            }
        break;
        case 3 :
            nsuit1 = sc.nextInt();
           if(nsuit1 <= suit1a && daysDifference >=1){
            System.out.println("\nTotal Amount :$"+(nsuit1*suit1a*daysDifference));
            suit1a = suit1a - nsuit1;
            }
           else if(nsuit1 <= suit1a && daysDifference ==0){
             System.out.println("\nTotal Amount :$"+(suit1a*nsuit1));
             suit1a = suit1a - nsuit1;
            }
            else if(nsuit1 <= suit1a && daysDifference < 0){
             System.out.println("\nInvalid Date");
            }
            else{
                System.out.println("Only"+suit1a+"Available");
            }
        break;
        case 4 :
            nsuit2 = sc.nextInt();
           if(nsuit2 <= suit2a && daysDifference >=1){
            System.out.println("\nTotal Amount :$"+(nsuit2*suit2a*daysDifference));
            suit2a = suit2a - nsuit2;
            }
           else if(nsuit2 <= suit2a && daysDifference ==0){
             System.out.println("\nTotal Amount :$"+(suit2a*nsuit2));
             suit2a = suit2a - nsuit2;
            }
            else if(nsuit2 <= suit2a && daysDifference < 0){
             System.out.println("\nInvalid Date");
            }
            else{
                System.out.println("Only"+suit2a+"Available");
            }
        break;
        case 5:
            nsuit3=sc.nextInt();
            if(nsuit3 <= suit3a && daysDifference >= 1){
            System.out.println("\n Total Amount : $"+(nsuit3 * suit3p * daysDifference));
            suit3a = suit3a - nsuit3;
            }
            else if(nsuit3 <= suit3a && daysDifference == 0){
            System.out.println("\nTotal Amount : $"+(nsuit3 * suit3p));
            suit3a = suit3a - nsuit3;
            }
            else if(nsuit3 <= suit2a && daysDifference < 0){
            System.out.println("Invalid Date");
            }
            else{
            System.out.print("Only"+suit3a+"Available");
            }
            break;
        default:
            System.out.println("\nInvalid Action");
    }
    }
    void payment(){
        System.out.print("\nChoose a Payment Method \n1.Cash \n2.Credit/Debit Card \n");
        int pay = sc.nextInt();
        switch (pay){
            case 1:   System.out.print("\nPayment Successful");
             System.out.print("\nYour Booking is Confirmed");
             break;
            case 2:
                System.out.print("\nEnter Your Card Number : ");
                long cr = sc.nextLong();
                System.out.print("Expiry Date : \nMM : ");
                int exm = sc.nextInt();
                System.out.print("YY : ");
                int exyy = sc.nextInt();
                System.out.print("CV : ");
            int cv = sc.nextInt();
                System.out.print("\nPayment Successful");
                 System.out.print("\nYour Booking Is Confirmed!");
                break;
                
            default:
                 System.out.println("\nInvalid Action");
                break;
    }
    }
}
public class Main{
public static void main(String[] args){
long daysDifference = 0;
long monthsDifference = 0;
 System.out.println("************* WELCOME TO THE CHARIOT **************");
 A b = new A();
 Scanner s = new Scanner(System.in);
 int ch;
 int choice = s.nextInt();
 if(choice == 1){
 do{b.hotels();
 b.detail();
 b.room();
 b.book();
 b.payment();
  System.out.println("\n Book Another Stay ?...Press 1");
  ch = s.nextInt();
 }while(ch == 1);
 
 }
}
}