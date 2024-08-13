//Program 3
//Extension of program 2 that now asks for user input when assigning the length and width of the sides
import java.util.Scanner; //This imports the console scanner that reads user input

public class Program3 {
    public static void main(String[] args) {
        int length = 0, width = 0, area = 0, perimeter = 0;     //declare all variables, set to 0
        
        Scanner myObj = new Scanner(System.in);     //declare new scanner
        
        System.out.println("Enter a length: ");
        length = myObj.nextInt();   //get length with user input and scanner
        
        System.out.println("Enter a width: ");
        width = myObj.nextInt();    //get width with user input and scanner
        
        area = length * width;      //calculate area
        perimeter = 2 * (length + width);   //calculate perimeter
        
        System.out.println("The length is " + length);
        System.out.println("The width is " + width);
        System.out.println("The area is " + area);
        System.out.print("The perimeter is " + perimeter);  //print everything
        
    }
}



//Paste console output below:
/*
Enter a length: 
185
Enter a width: 
233
The length is 185
The width is 233
The area is 43105
The perimeter is 836

*/
