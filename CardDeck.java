/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.carddeck;

/**
 *
 * @author nlevy2025
 */
import java.util.*;

public class CardDeck {
    public static void main(String[] args) {
        // Step 1: Create the deck of cards as a 2D string array
        String[][] deckOfCards = new String[4][13];
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] values = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        
        // Initialize the deck
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 13; j++) {
                deckOfCards[i][j] = values[j] + " of " + suits[i];
            }
        }
        
        // Step 2: Flatten the deck into a list and shuffle it
        List<String> shuffledDeck = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 13; j++) {
                shuffledDeck.add(deckOfCards[i][j]);
            }
        }
        
        // Shuffle the deck
        Collections.shuffle(shuffledDeck);

        // Step 3: Deal 4 hands of 5 cards each
        String[][] hands = new String[4][5];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                hands[i][j] = shuffledDeck.get(i * 5 + j);
            }
        }

        // Step 4: Display the hands
        System.out.println("Hand A: " + Arrays.toString(hands[0]));
        System.out.println("Hand B: " + Arrays.toString(hands[1]));
        System.out.println("Hand C: " + Arrays.toString(hands[2]));
        System.out.println("Hand D: " + Arrays.toString(hands[3]));
    }
}

