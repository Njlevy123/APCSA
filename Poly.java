/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poly;

/**
 *
 * @author nlevy2025
 */
import java.util.ArrayList;

// Base class Aircraft
class Aircraft {
    String wings;

    public Aircraft(String wings) {
        this.wings = wings;
    }

    public void displayFeatures() {
        System.out.println("Aircraft with wings: " + wings);
    }
}

// SingleEnginePlane class that extends Aircraft
class SingleEnginePlane extends Aircraft {
    String rotaryEngine;

    public SingleEnginePlane(String wings, String rotaryEngine) {
        super(wings);
        this.rotaryEngine = rotaryEngine;
    }

    @Override
    public void displayFeatures() {
        super.displayFeatures();
        System.out.println("Single Engine Plane with rotary engine: " + rotaryEngine);
    }
}

// Helicopter class that extends SingleEnginePlane
class Helicopter extends SingleEnginePlane {
    String rotatingHelicopterBlades;

    public Helicopter(String wings, String rotaryEngine, String rotatingHelicopterBlades) {
        super(wings, rotaryEngine);
        this.rotatingHelicopterBlades = rotatingHelicopterBlades;
    }

    @Override
    public void displayFeatures() {
        super.displayFeatures();
        System.out.println("Helicopter with rotating helicopter blades: " + rotatingHelicopterBlades);
    }
}

public class Poly {
    public static void main(String[] args) {
        // Create objects of Aircraft, SingleEnginePlane, and Helicopter
        Aircraft aircraft = new Aircraft("Fixed Wings");
        SingleEnginePlane singleEnginePlane = new SingleEnginePlane("Fixed Wings", "Rotary Engine Model A");
        Helicopter helicopter = new Helicopter("No Wings", "Rotary Engine Model B", "Helicopter Blades Model X");

        // Place them in an ArrayList
        ArrayList<Aircraft> aircraftList = new ArrayList<>();
        aircraftList.add(aircraft);
        aircraftList.add(singleEnginePlane);
        aircraftList.add(helicopter);

        // Iterate over the ArrayList and display features of each object
        for (Aircraft a : aircraftList) {
            a.displayFeatures();
            System.out.println("------------------------------");
        }
    }
}
