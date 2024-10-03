package myapp;

import java.io.Console;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HelloWorld{
    
    public static void main (String [] args){
        System.out.println ("Hello World...");

        Console console = System.console();

        /* String name = console.readLine("What is your name?");
        if (name.length() > 0) {
            System.out.printf("Hello %s\n", name);
        } else {
            System.err.println("you have not told me your name");
        }  

        String input = console.readLine ("what is your hobby?");
        input = input. trim();

        if (input.equals("swim")) {
        System.out.println("The nearest public swimming pool is in Clementi");

        } else if (input.equals("jog")){
        System.out.println("How fast can you jog a kilometer?");

        } else if (input.equals("code")) {
        System.out.println("Cool!");

        } else
        System.out.printf("What is this %s hobby of yours?", input); 
        
        String valueString = console.readLine("Enter your score between 0 to 100: ");
        Integer score = Integer.parseInt(valueString);

        switch (score) {
            case 100:
                    System.out.println("Perfect Score");
                break;
            case 90:
            case 91: 
            case 92: 
            case 93: 
            case 94: 
            case 95:

                System.out.println("You score A");
            default:
            System.out.println("Invalid ");
                break;
        }
        int i = 0;
        while (i < score ) {
            System.out.println(i + ",");
            i++;

        do {
            System.out.println(i + ",");
            i++;
        } while (i <score);
        }
        Integer[] numbers = new Integer[5];

        for (int j = 0; j < numbers.length; j++){
          Integer inputNumber = Integer.parseInt(console.readLine("Enter Your %d number : ", j));
        numbers[j] = inputNumber;
        }
        
        for (Integer pI : numbers){
            System.out.println(pI);
        }

        if (args.length > 0){
            String[] names = new String[5];

            int x = 0;
            while (x < args.length){
                names[x] = args[x];

                x++;
                
                if (x > 4){
                    break;
                }
            }
            for (int y = 0; y < names.length; y++){
                System.out.printf("name [%d]: %s ", y, names [y]);
            }

        } else {
            System.out.println("No argument passed");
        } */
        /*List<String> names = new ArrayList<>();

        String input = "";
        do {
            input = console.readLine("Enter a name: ");
            if (!input.equals("quit")) {
                names.add(input);
            }

        } while (!input.equals("quit"));

        // print out the names
        for(String name: names) {
            System.out.println(name);
        }*/

        List<String> words = new ArrayList<>();

        String keyboardInput = "";
        keyboardInput = console.readLine("Enter a sentence \n ");
        keyboardInput = keyboardInput.replace(',',' ');
        Scanner scan = new Scanner(keyboardInput);

        while (scan.hasNextLine()) {
            
            words.add(scan.next());

        }
        scan.close();

        for (int z = 0; z < words.size(); z++){
            System.out.printf("%d : %s \r\n",z+1, words.get(z));
            //System.out.println(i+1 + ":" + words.get(i));

        }

    }
}