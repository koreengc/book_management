package Assignment;

import java.util.Scanner;

public class DateTime {
    int date;
    int month;
    int year;

    public DateTime() {
    }
    
    public void input()
    {
        Scanner sc = new Scanner (System.in);
        System.out.print("Date:");
        this.date = sc.nextInt();
        System.out.print("Month:");
        this.month = sc.nextInt();
        System.out.print("Year:");
        this.year = sc.nextInt();   
    }
    
    public void output()
    {
        System.out.println("Publish Date: " + this.date +"/"+ this.month + "/"+ this.year);
    }
    
}
