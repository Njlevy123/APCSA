/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.choose;

/**
 *
 * @author nlevy2025
 */
import java.util.Scanner;

// Base class for all characters and locations in the game
abstract class Adventure {
    public void start() {
        System.out.println("Welcome to the adventure!");
    }
}

// Class for the player's actions and decisions
class Player extends Adventure {
    private String name;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void choosePath(Scanner sc) {
        System.out.println("You, " + name + ", are standing at a crossroads.");
        System.out.println("Do you want to:");
        System.out.println("1. Take the left path towards the eerie glow?");
        System.out.println("2. Take the right path that leads to a cave?");
        System.out.print("Enter choice (1 or 2): ");
        int choice = sc.nextInt();
        takeAction(choice, sc);
    }

    public void takeAction(int choice, Scanner sc) {
        if (choice == 1) {
            LeftPath leftPath = new LeftPath();
            leftPath.explore(sc);
        } else if (choice == 2) {
            RightPath rightPath = new RightPath();
            rightPath.explore(sc);
        } else {
            System.out.println("Invalid choice, try again.");
            choosePath(sc);  // Prompt again if the choice is invalid
        }
    }
}

// Abstract class for paths
abstract class Path extends Adventure {
    public abstract void explore(Scanner sc);
}

// LeftPath class: Inherits from Path
class LeftPath extends Path {
    @Override
    public void explore(Scanner sc) {
        System.out.println("You take the left path, which leads you to an ancient stone archway.");
        System.out.println("The archway is covered in strange symbols, and a faint glow surrounds it.");
        System.out.println("Do you want to:");
        System.out.println("1. Walk through the archway?");
        System.out.println("2. Examine the carvings on the archway?");
        System.out.print("Enter choice (1 or 2): ");
        int choice = sc.nextInt();

        if (choice == 1) {
            walkThroughArchway(sc);
        } else if (choice == 2) {
            examineArchway(sc);
        } else {
            System.out.println("Invalid choice. The archway remains still.");
            explore(sc);  // Prompt again if the choice is invalid
        }
    }

    public void walkThroughArchway(Scanner sc) {
        System.out.println("You walk through the archway and find yourself in a hidden chamber filled with treasures.");
        System.out.println("A sudden rumble shakes the ground as a series of traps are triggered.");
        System.out.println("Do you:");
        System.out.println("1. Run for the exit?");
        System.out.println("2. Try to disable the traps?");
        System.out.print("Enter choice (1 or 2): ");
        int choice = sc.nextInt();

        if (choice == 1) {
            escapeChamber();
        } else if (choice == 2) {
            disableTraps();
        } else {
            System.out.println("Invalid choice, the chamber collapses!");
        }
    }

    public void examineArchway(Scanner sc) {
        System.out.println("You study the intricate carvings. It seems they depict a ritual involving sacrifices.");
        System.out.println("Suddenly, the archway begins to glow brighter, and a portal opens.");
        System.out.println("Do you:");
        System.out.println("1. Enter the portal?");
        System.out.println("2. Turn back to the crossroads?");
        System.out.print("Enter choice (1 or 2): ");
        int choice = sc.nextInt();

        if (choice == 1) {
            enterPortal();
        } else if (choice == 2) {
            System.out.println("You turn back to the crossroads, unsure of the path ahead.");
        } else {
            System.out.println("Invalid choice. The portal fades away.");
        }
    }

    public void escapeChamber() {
        System.out.println("You sprint for the exit, barely avoiding the falling rocks. You escape with your life!");
        System.out.println("You discover that the chamber was a trap, meant to guard a powerful artifact. You have no choice but to leave empty-handed.");
    }

    public void disableTraps() {
        System.out.println("You manage to disable the traps, but the chamber is unstable. As you collect the treasures, the walls begin to crumble.");
        System.out.println("You have no choice but to flee with what you can carry, narrowly escaping the collapsing chamber.");
    }

    public void enterPortal() {
        System.out.println("The portal transports you to a dark, endless void. A voice echoes, 'Only those pure of heart may return.'");
        System.out.println("You feel a surge of energy and are transported back to the crossroads, but the portal has disappeared.");
    }
}

// RightPath class: Inherits from Path
class RightPath extends Path {
    @Override
    public void explore(Scanner sc) {
        System.out.println("You take the right path and find yourself at the entrance of a dark cave.");
        System.out.println("The air grows cold as you approach. The echoes of distant noises chill you to the bone.");
        System.out.println("Do you want to:");
        System.out.println("1. Enter the cave and explore further?");
        System.out.println("2. Turn back, feeling uneasy?");
        System.out.print("Enter choice (1 or 2): ");
        int choice = sc.nextInt();

        if (choice == 1) {
            enterCave(sc);
        } else if (choice == 2) {
            turnBack();
        } else {
            System.out.println("Invalid choice. The cave entrance remains silent.");
            explore(sc);  // Prompt again if the choice is invalid
        }
    }

    public void enterCave(Scanner sc) {
        System.out.println("You step into the cave, and your footsteps echo through the empty darkness.");
        System.out.println("Suddenly, the ground shakes, and the entrance collapses behind you!");
        System.out.println("Do you:");
        System.out.println("1. Continue deeper into the cave?");
        System.out.println("2. Search for an escape route?");
        System.out.print("Enter choice (1 or 2): ");
        int choice = sc.nextInt();

        if (choice == 1) {
            deepCaveExploration(sc);
        } else if (choice == 2) {
            escapeCave();
        } else {
            System.out.println("Invalid choice. The darkness consumes you.");
        }
    }

    public void turnBack() {
        System.out.println("You turn back, realizing that your fear has gotten the best of you. Perhaps another day...");
    }

    public void deepCaveExploration(Scanner sc) {
        System.out.println("You continue into the cave and discover a hidden underground temple.");
        System.out.println("A mystical voice whispers, 'Only those who pass the trials may enter the temple.'");
        System.out.println("Do you:");
        System.out.println("1. Accept the challenge and enter the temple?");
        System.out.println("2. Leave the cave, unsure of what dangers lie ahead?");
        System.out.print("Enter choice (1 or 2): ");
        int choice = sc.nextInt();  // New scanner instance to capture the choice

        if (choice == 1) {
            System.out.println("You accept the challenge and enter the temple. Your trials begin...");
            beginTrials(sc);
        } else if (choice == 2) {
            System.out.println("You leave the cave, unsure of what dangers lie ahead. The adventure continues...");
        } else {
            System.out.println("Invalid choice. The temple doors remain closed.");
        }
    }

    public void escapeCave() {
        System.out.println("You find an exit in the cave's side, barely escaping the collapse. You emerge into the jungle, injured but alive.");
    }

    // New method for starting the trials inside the temple
    public void beginTrials(Scanner sc) {
        System.out.println("Inside the temple, you are greeted by an imposing statue of a forgotten deity.");
        System.out.println("The trials consist of three challenges: Wisdom, Courage, and Strength.");

        // First trial: Wisdom
        System.out.println("The first trial begins: Wisdom.");
        System.out.println("A riddle appears before you. 'I am not alive, but I grow. I don't have lungs, but I need air. What am I?'");
        System.out.println("Do you:");
        System.out.println("1. Guess 'fire'?");
        System.out.println("2. Guess 'water'?");
        System.out.print("Enter choice (1 or 2): ");
        int choice1 = sc.nextInt();

        if (choice1 == 1) {
            System.out.println("The statue nods approvingly. 'Correct. The trial of Wisdom is passed.'");
        } else {
            System.out.println("The statue shakes its head. 'Incorrect. You must face the consequences.'");
            return;  // End the game or go back to start of the trials
        }

        // Second trial: Courage
        System.out.println("The second trial begins: Courage.");
        System.out.println("A deep, dark pit opens in front of you. You can hear distant sounds of something lurking below.");
        System.out.println("Do you:");
        System.out.println("1. Jump into the pit to face whatever awaits?");
        System.out.println("2. Find a way around the pit?");
        System.out.print("Enter choice (1 or 2): ");
        int choice2 = sc.nextInt();

        if (choice2 == 1) {
            System.out.println("You leap into the pit, and after a tense moment, you find yourself safely on the other side.");
            System.out.println("You pass the trial of Courage!");
        } else {
            System.out.println("You find another route around the pit, but the statue seems displeased. 'Your courage was tested, but you avoided the trial.'");
            return;  // End the game or go back to start of the trials
        }

        // Final trial: Strength
        System.out.println("The final trial begins: Strength.");
        System.out.println("You are faced with a massive door that can only be opened by brute force.");
        System.out.println("Do you:");
        System.out.println("1. Try to push the door open with all your strength?");
        System.out.println("2. Look for another way to open the door?");
        System.out.print("Enter choice (1 or 2): ");
        int choice3 = sc.nextInt();

        if (choice3 == 1) {
            System.out.println("With all your might, you push the door open! The temple's final trial is passed.");
            System.out.println("You have completed the three trials and proven yourself worthy.");
            finalReward(sc);
        } else {
            System.out.println("You search for another way to open the door, but time runs out.");
            System.out.println("The temple doors close, and you are forced to leave. You have failed the trial.");
            return;  // End the game
        }
    }

    // Final reward after completing all three trials
    public void finalReward(Scanner sc) {
        System.out.println("As the final door opens, you step into a grand chamber filled with treasures and ancient artifacts.");
        System.out.println("A voice speaks: 'You have passed the trials. Choose wisely, adventurer.'");
        System.out.println("Do you:");
        System.out.println("1. Take the golden relic from the pedestal?");
        System.out.println("2. Take the ancient book that glows with mysterious light?");
        System.out.print("Enter choice (1 or 2): ");
        int choice = sc.nextInt();

        if (choice == 1) {
            System.out.println("You take the golden relic. A sudden surge of power fills your body. You feel invincible, but at a cost...");
            System.out.println("The relic is cursed, and you must now seek a way to break the curse.");
            System.out.println("Your journey has only just begun.");
        } else if (choice == 2) {
            System.out.println("You take the ancient book. Its pages are filled with secrets of forgotten magic.");
            System.out.println("With the knowledge within, you will become one of the most powerful mages in history.");
            System.out.println("You are now the guardian of the temple's secrets.");
        } else {
            System.out.println("You decide to leave the treasures behind, opting for a life of peace. Your adventure ends here, but your choices shape your future.");
        }
    }
}

// Main class to control the game flow
public class Choose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name, adventurer: ");
        String name = sc.nextLine();

        Player player = new Player(name);

        // Start the game
        player.start();

        // Present choices to the player
        player.choosePath(sc);

        sc.close();
    }
}
