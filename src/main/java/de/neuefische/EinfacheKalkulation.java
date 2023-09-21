package de.neuefische;

public class EinfacheKalkulation {
    /*
    Schreibt eine Java-Methode, die zwei Zahlen als Parameter entgegennimmt und das Ergebnis ihrer Addition zurückgibt.

    Schritt 1: Schreibe eine Methode mit dem Namen 'add', die zwei int-Parameter entgegennimmt und die Summe der beiden Zahlen zurückgibt.
    Schritt 2: Rufe die Methode innerhalb deiner main() Methode auf und gib das Ergebnis auf der Konsole aus.
     */
    public static void main(String[] args) {
        System.out.println(add(5, 6));
        System.out.println(add(1, 2));
        System.out.println(add(3, 4));
    }

    public static int add(int a, int b){
        return a + b;
    }
}
