  import java.util.*;
  public class Operators {
      public static void main(String[] args) {
        //   these are most used operators that I have been used so far 

      System.out.println("most used operatprs [+,-,*,/,&&,||]");
      Scanner input = new Scanner(System.in);

      System.out.println("enter first number ");
      int inputNumber1 = input.nextInt();
      System.out.println("enter second number ");
      int inputNumber2= input.nextInt();
      
      float addition =inputNumber1+inputNumber2;
      System.out.println("addition result is : " + addition);

      float subtraction = inputNumber1-inputNumber2;
      System.out.println("subtraction result is : " + subtraction);

      float multiplication = inputNumber1*inputNumber2;
      System.out.println("multiplication result is : " + multiplication);

      float division = inputNumber1/inputNumber2;
      System.out.println("division result is : " + division);
      
      if (inputNumber1>=10 && inputNumber2<=20 ){

        System.out.println("system and CPU is working fine"); 
        inputNumber1++;
        System.out.println(inputNumber1);
        
      }
      else{
        System.out.println("system and CPU isn't working fine"); 
        inputNumber2++;
        System.out.println(inputNumber2);
      }
    
      if (inputNumber1>=10 || inputNumber2<=20 ){

        System.out.println("system or CPU is working fine"); 
        inputNumber1--;
        System.out.println(inputNumber1);
        
      }
      else{
        System.out.println("system or CPU isn't working fine"); 
        inputNumber2--;
        System.out.println(inputNumber2);
      }
      }
  }