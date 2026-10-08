import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {
        Pet defaultPet = new Pet();
        System.out.println(defaultPet);

        Pet customPet = new Pet("Dog", "Buster", 11);
        System.out.println();
        System.out.println(customPet);

        Scanner input = new Scanner(System.in);

        System.out.print("Enter animal type: \n");
        String type = input.nextLine();
        System.out.print("Enter animal name: \n");
        String name = input.nextLine();
        System.out.print("Enter animal age: \n");
        int age = input.nextInt();

        Pet userPet = new Pet(type, name, age);
        System.out.println();
        System.out.println(userPet);

        input.close();
    }
}
