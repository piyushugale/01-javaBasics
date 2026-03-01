package com.piyush.net;

// 1. The ABSTRACTION (The Interface / The Button)
interface CoffeeMachine {
    void makeCoffee(); // No code here, just the "idea"
}

// 2. The IMPLEMENTATION (The Details / The Wires)
class EspressoMachine implements CoffeeMachine {
    public void makeCoffee() {
        System.out.println("Boiling water + High pressure = Espresso!");
    }
}

class FilterMachine implements CoffeeMachine {
    public void makeCoffee() {
        System.out.println("Dripping water + Paper filter = Black Coffee!");
    }
}


// extends: add something additional to it
// implements: like implementing the interface (which defines default structure)

