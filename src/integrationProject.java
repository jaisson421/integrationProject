//Gabriel Gusmao Almeida
//A interactive program that gives you information about the java language while being a little fun

import java.util.Random;
import java.util.Scanner;

public class integrationProject {

    public static void main(String args[]){
        System.out.println("\n\tWelcome to my Program");
        Scanner scan = new Scanner(System.in);
        String definition = "empty";
        //the .equals() method return a boolean depending if the argument String is equal or not to the object string
        while(definition.equals("empty")) {
            System.out.println("Firstly type in one of the primitive data types to get a definition or type skip:\nboolean, byte, char, short, int, long, float, double");
            String primitiveDataType = scan.nextLine();
            switch (primitiveDataType) {
                case "boolean":
                    definition = "A boolean is a binary datatype with only 2 possible values, true and false, it uses 1 bit of memory";
                    break;
                case "byte":
                    definition = "A byte is one of the ways to store integer numbers in java, it uses 1 byte of memory";
                    break;
                case "char":
                    definition = "A char is a way to store a single character in java, useful when storing simple characteristics like gender";
                    break;
                case "short":
                    definition = "A short is one of the ways to store integer numbers in java, but it uses 2 bytes of memory";
                    break;
                case "int":
                    definition = "A int is one of the ways to store integer numbers in java, but it uses 4 bytes of memory";
                    break;
                case "long":
                    definition = "A long is one of the ways to store integer numbers in java, but it uses 8 bytes of memory";
                    break;
                case "float":
                    definition = "A float is one of the ways to store decimal numbers in java, it uses 4 bytes of memory";
                    break;
                case "double":
                    definition = "A double is one of the ways to store decimal numbers in java, it uses 8 bytes of memory";
                    break;
                case "skip":
                    definition = "You chose to skip datatypes";
                    break;
            }
        }
        System.out.println(definition);
        String response = "empty";
        while(response.equals("empty")) {
            System.out.println("Do you know what is a non primitive datatype in java?\nType yes, no or skip");
            String nonPrimitive = scan.nextLine();
            switch (nonPrimitive){
                case "yes":
                    response = "You must be very smart, I guess no explanation is needed";
                    break;
                case "no":
                    response = "Non primitive data types are not defined by the programming language but by the programmer himself, in java these are called objects. A good example of a object is a String";
                    break;
                case "skip":
                    response = "Hmm... ok I'll let you skip it this time";
                    break;
            }
        }
        System.out.println(response);
        response = "empty";
        boolean smart = false;
        boolean lazy = false;
        while (response.equals("empty")){
            System.out.println("Do you know about variables?\nType yes, no or skip");
            String variables = scan.nextLine();
            switch (variables) {
                case "yes":
                    response = "You are too smart for this program! Let's do something else...";
                    smart = true;
                    break;
                case "no":
                    response = "Variables are the way for programmers to store data in the form of the datatypes we talked about before." +
                            "\nThere are 4 main types of variables that programmers create: boolean, int, double and String." +
                            "\nVariables have scopes which defines the space in which the variable exists. If you create a variable inside a" +
                            "\nloop, the variable will only exist in memory inside that loop so be careful when creating your variables.";
                    break;
                case "skip":
                    response = "Wow, you are lazy aren't you! Fine, since you don't wanna learn let's do somthing else...";
                    lazy = true;
                    break;
            }
        }
        System.out.println(response);
        response = "empty";
        if(smart || lazy){
            Random rand = new Random();
            boolean successfulRun = false;
            while(!successfulRun){
                System.out.println("Let's play a game... rock, paper, scissors. You can go first I promise I won't cheat ;)\nNo skiping this time...");
                //a method call is gameConverter() and the argument is the random number
                String myPlay = gameConverter(rand.nextInt(3));
                String userPlay = scan.nextLine();
                boolean win = false;
                //the length() method return the length of the String
                if(userPlay.length()>0){
                    if(myPlay.equals("rock") && userPlay.equals("paper")) {
                        win = false;
                        successfulRun = true;
                    }
                    else if(myPlay.equals("rock") && userPlay.equals("scissors")) {
                        win = true;
                        successfulRun = true;
                    }
                    else if(myPlay.equals("paper") && userPlay.equals("scissors")) {
                        win = false;
                        successfulRun = true;
                    }
                    else if(myPlay.equals("paper") && userPlay.equals("rock")) {
                        win = true;
                        successfulRun = true;
                    }
                    else if(myPlay.equals("scissors") && userPlay.equals("rock")) {
                        win = false;
                        successfulRun = true;
                    }
                    else if(myPlay.equals("scissors")&& userPlay.equals("paper")) {
                        win = true;
                        successfulRun = true;
                    }
                    else if(myPlay.equals(userPlay)) {
                        System.out.println("I choose " + myPlay);
                        System.out.println("It's a draw let's go again");
                    }
                    else
                        continue;
                }
                if(successfulRun) {
                    String winner = (win) ? "Me" : "You";
                    System.out.println("I choose " + myPlay);
                    System.out.println("The winner is... " + winner);
                }
            }
        }
        else{
            while(response.equals("empty")){
                System.out.println("\nLet's talk about some operators now.\nType in one of these operators: +, -, *, /, %, ++, --, +=");
                String operator = scan.nextLine();
                int numberInput;
                switch (operator) {
                    case "+":
                        System.out.println("Addition, this operator will add a number to another. For example choose a number to add to 5:");
                        numberInput = scan.nextInt();
                        response = "The result would be "+(5 + numberInput);
                        break;
                    case "-":
                        System.out.println("Subtraction, this operator will subtract a number by another. For example choose a number to subtract by 5:");
                        numberInput = scan.nextInt();
                        response = "The result would be "+(numberInput - 5);
                        break;
                    case "*":
                        System.out.println("Multiplication, this operator will multiply a number by another. For example choose a number to multiply by 5:");
                        numberInput = scan.nextInt();
                        response = "The result would be "+(5 * numberInput);
                        break;
                    case "/":
                        System.out.println("Division, this operator will divide a number by another. For example choose a number to divide by 5:");
                        numberInput = scan.nextInt();
                        //On the line below I casted a int as a double in case the division turns out to be a decimal
                        response = "The result would be "+(double)(numberInput/5);
                        break;
                    case "%":
                        System.out.println("Modulus, this operator give you the remainder of a number divided by another. For example choose a number to perform mod by 5:");
                        numberInput = scan.nextInt();
                        response = "The result would be "+(numberInput % 5);
                        break;
                    case "++":
                        response = "This operator will increase a variable by 1. For example if x = 2 and we printed x++ the result would be 3";
                        break;
                    case "--":
                        response = "This operator will decrease a variable by 1. For example if x = 2 and we printed x-- the result would be 1";
                        break;
                    case "+=":
                        response = "This operator will increase a variable by any number. For example, let x = 2, if we typed x += 2 the values of x would be 4 now";
                        break;
                }
                System.out.println(response);
            }
        }
        //the final keyword means that the variable's value cannot be changed later on in the program.
        final String mathMessage = "Ok, now I want to test your math skills. First type in a number:";
        System.out.println(mathMessage);
        double mathInput = scan.nextDouble();
        double squareRoot = Math.sqrt(mathInput);
        System.out.println("Ok, now what is the square root of this number??");
        mathInput = scan.nextDouble();
        if(mathInput == squareRoot){
            System.out.println("Wow, you really are smart");
        }
        else{
            System.out.println("Nope, wrong answer");
        }
        System.out.println("Now I want to test if you know alphabetical orders. Type in a word that would come before awoken in the dictionary");
        String word = scan.nextLine();
        if(word.substring(0,2).equals("aa")){
            System.out.println("Not sure if that's a word but I'll let you pass this time");
        }
        //If you use the == operator on objects java will compare the location in memory for the objects not their content. That's why we use methods to compare objects like Strings
        else if(word.compareTo("awoken")==1){
            System.out.println("Well done you know your alphabet");
        }
        else{
            System.out.println("Well... that's not quite right you should google the alphabet song.");
        }
        System.out.println("\nThat is the end of my program so far hope you enjoyed the ride.");


    }
    //header is gameConverter and parameter is n
    private static String gameConverter(int n){te
        String result = "";
        if(n==1){
            result = "rock";
        }
        else if(n==2){
            result = "paper";
        }
        else{
            result = "scissors";
        }
        return result;
    }
}
