/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.unit4test;

/**
 *
 * @author nlevy2025
 */
import java.util.Random;

public class Unit4Test {

    public static void main(String[] args) {
        // Create a place to store the cards
        Card[] hand = new Card[5];

        // get the random number
        Random rand = new Random();

        // Loop to create 5 unique cards
        for (int i = 0; i < hand.length; i++) {
            hand[i] = new Card(rand);  // Create a new Card object with random suit and value
        }

        // Variable to keep track of the highest card
        Card highestCard = hand[0];

        // Print the details of each card and find the highest card
        for (Card card : hand) {
            System.out.println(card.getValue() + " of " + card.getSuit());
            if (card.getValue() > highestCard.getValue()) {
                highestCard = card;
            }
        }

        // Print the highest card
        System.out.println("\nThe highest card is: " + highestCard.getValue() + " of " + highestCard.getSuit());
    }
}

class Card {
    private final String suit;
    private final int value;

    // gives the suites
    public Card(Random rand) {
        String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
        this.suit = suits[rand.nextInt(suits.length)]; // Pick a random suit
        this.value = rand.nextInt(13) + 1; // Pick a random value between 1 and 13
    }

    // Getters for suit and value
    public String getSuit() {
        return suit;
    }

    public int getValue() {
        return value;
    }
}
