import java.util.Scanner;

public class PetQuestions
{
    public static void main( String[] args )
    {
        String name;
        String breed;
        int age;

        System.out.print( "Greetings. What is your pet's name? " );
        Scanner keyboard = new Scanner(System.in);
        name = keyboard.next();

        System.out.print( "What kind of animal is " + name + "? " );
        breed = keyboard.next();
        System.out.print( "How old is " + name + "? ");
        age = keyboard.nextInt();

        System.out.println( name + " is your " + breed + " and it is " + age );
    }
}