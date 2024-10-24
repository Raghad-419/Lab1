import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        //Question 1 (Calculator)

        System.out.println("Please enter first number");
        double num1 = input.nextInt();
        System.out.println("Please enter second number");
        double num2 = input.nextInt();

        double sum = num1+num2;
        double subtract= num1 - num2;
        double multiply = num1*num2;
        double mod = num1%num2;
        double divide = 0;

        System.out.println(num1+" + "+num2+" = "+ sum);
        System.out.println(num1+" - "+num2+" = "+ subtract);
        System.out.println(num1+" * "+num2+" = "+ multiply);
        System.out.println(num1+" % "+num2+" = "+ mod);

        if(num2 != 0){
            divide = num1/num2;
            System.out.println(num1+" / "+num2+" = "+ divide);
        }else  System.out.println("Sorry can't divide on zero");


//*********************************************************************
 //       Question 2(multiplication table)

        System.out.println("Please enter number");

        int num = input.nextInt();

        for (int i = 1; i <=10 ; i++) {
            System.out.println(num +" * "+ i +" = "+ (num*i));
        }

//*********************************************************************
   //     Question 3(Area of a circle)
        System.out.println("Please enter radius of circle ");
        double radius = input.nextDouble();

        double parameter = 2*3.14*radius ;
        double area = 3.14 *(Math.pow(radius,2));

        System.out.println("Perimeter = "+parameter);
        System.out.println("Area = "+area);


//*********************************************************************
 //       Question 4(Average)


        System.out.println("Please enter count of numbers");
        double count = input.nextInt();

        double sum =0;
        double i= count;

        while (i != 0 ){

            System.out.println("Enter an integer");
            int num = input.nextInt();

            sum = sum +num ;
            i--;

        }
        System.out.println("The average is "+ sum/count);

//*********************************************************************
//        Question 5(add 2 integer and determine if equal to the third number)

        System.out.println("Please enter first number");
        int first = input.nextInt();
        System.out.println("Please enter second number");
        int second = input.nextInt();
        System.out.println("Please enter third number");
        int third = input.nextInt();

        int sum = first+second;

        if(sum == third){
            System.out.println("The result is : true");
        }else System.out.println("The result is: false");

// *********************************************************************
//        Question 6(Revers a word)

        System.out.println("Please enter word");
        String word = input.nextLine();

        char ch ;
        String revers= ""  ;

        for (int i =0; i<word.length() ; i++) {
            ch = word.charAt(i);
            revers = ch+revers;
        }
        System.out.println("Revers word : "+revers);

//*********************************************************************
//        Question 7 (Even or odd)

        System.out.println("Please enter number");
        int num = input.nextInt();

        if(num %2 == 0){
            System.out.println("Number "+num+" is even");
        }else System.out.println("Number "+num+" is odd");

 //********************************************************************
        // Question  8(Temperature)

        System.out.println("Please enter temperature in centigrade");
        double tempC = input.nextDouble();

        double tempF = (tempC*1.8) +32 ;

        System.out.println("Temperature in Fahrenheit is: "+tempF);


//********************************************************************
//        Question  9 (Print the index)

        System.out.println("Enter a string");
        String str = input.nextLine();
        System.out.println("Enter number");
        int index = input.nextInt();

        char ch = str.charAt(index);

        System.out.println("Char at index "+ index + " is "+ ch);

//********************************************************************
//         Question  10 (Area and perimeter of rectangle)

        System.out.println("Please enter width");
        double width = input.nextDouble();
        System.out.println("Please enter height");
        double height = input.nextDouble();

        double area = width*height;
        double perimeter = 2*(width+height);

        System.out.println("Area is : "+ area +"\nPerimeter is : "+perimeter);


//********************************************************************
//         Question  11 (Compare two numbers)
        System.out.println("Please enter first number");
        int num1 = input.nextInt();
        System.out.println("Please enter second number");
        int num2 = input.nextInt();

        if(num1 == num2){
            System.out.println(num1+" = "+num2);
        } else if (num1 > num2) {
            System.out.println(num1+" > "+num2);
            System.out.println(num1+" != "+num2);
        }else {
            System.out.println(num1+" < "+num2);
             System.out.println(num1+" != "+num2);}

//********************************************************************
//     Question  12 (Convert from seconds to hours and minute)
        System.out.println("Please enter seconds");
        int seconds = input.nextInt();

        int hours = seconds/3600 ;
        int minute = (seconds%3600)/60;
        int sec =seconds%60;
        System.out.println(hours+":"+minute+":"+sec);

//********************************************************************
//         Question  13 (Four integers if equal or not)

        System.out.println("please enter first integer");
        int num1= input.nextInt();
        System.out.println("please enter second integer");
        int num2= input.nextInt();
        System.out.println("please enter third integer");
        int num3= input.nextInt();
        System.out.println("please enter fourth integer");
        int num4= input.nextInt();

        if(num1 == num2 && num1==num3 &&num1==num4){
            System.out.println("Numbers are equals");
            } else
            System.out.println("Numbers are not equals!");



//        ********************************************************************
//         Question  14 (Check if number is positive or negative or zero)

        System.out.println("Please enter number");
        int num = input.nextInt();

        if (num > 0) {
            System.out.println(num+" is Positive number");
        }else if(num<0){
            System.out.println(num+" is negative number");
        }else System.out.println(" Zero number");

// ********************************************************************
//   Question  15 (count positive and negative)

        System.out.println("Please enter numbers or -1 to end");
        int number = input.nextInt();

        int positives =0;
        int nagetives =0;
        int countZeros = 0;

        while (number != -1){

            if(number>0){
                positives++;
            }else
                if(number== 0){
                countZeros++;
            }else nagetives++;

            System.out.println("Please enter numbers or -1 to end");
            number = input.nextInt();

        }

        System.out.println(positives+ " Positive numbers\n"+
               nagetives+ " Negative numbers\n"+
                countZeros+" Zero ");

//        ********************************************************************
//         Question  16 (Revers integer)

        System.out.println("please enter integer");
        String number = input.nextLine();

        String revers="" ;
        char ch ;

        for (int i = 0 ; i<number.length() ;i++){
            ch= number.charAt(i);
            revers = ch+revers;

        }
        System.out.println(revers);


//********************************************************************
//         Question  17 (Large and small number)
        int num ;
        int max =0 ;
        int min = 0;
        do {
            System.out.println("Enter numbers or 0 to end");
             num =input.nextInt();

             if(num>max)
            max = num ;

             if(num<min)
                 min =num;

        }while (num != 0);

        System.out.println("Large number is : "+max+"\nMinimum number is : "+min);

//********************************************************************
        // Question  18 ("a" appear in input)

        System.out.println("Enter String");
        String str = input.nextLine();

        char ch ;
       int counter=0 ;
        for(int i = 0 ; i<str.length() ; i++){
         ch = str.charAt(i);
           if(ch=='A' || ch=='a'){
               counter++;
           }
        }

        System.out.println("Numbers of a's = "+counter);


    }
}