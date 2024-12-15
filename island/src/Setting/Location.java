package Setting;

import Entity.Animal.Animal;

import java.util.Scanner;

public class Location {
    private static int x;
    private static int y;
    private Scanner input = new Scanner(System.in);
    private Animal[][] cellOnLocation;


    public Location()
    {
        System.out.println(Sentence.INPUT_SIZE_ISLAND);
        x = input.nextInt();
        y = input.nextInt();
        cellOnLocation = new Animal[x][y];
        System.out.printf(Sentence.CREATE_ISLAND, x, y);
    }


}
