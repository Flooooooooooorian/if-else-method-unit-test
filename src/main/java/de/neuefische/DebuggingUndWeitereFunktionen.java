package de.neuefische;

public class DebuggingUndWeitereFunktionen {
    /*
    Prüfe und verstehe Dein Programm. Dann erweitere es.

    Schritt 1: Debugge Dein Programm: gehe jede Zeile Deines Programms Schritt für Schritt durch.
    Schritt 2: Erweitere die 'add'-Methode, um auch Gleitkommazahlen (double) zu unterstützen. (Recherchiere dazu, wie eine Java-Methode verschiedene Parameter-/Rückgabetypen unterstützen kann)
    Schritt 3: Schreibe eine weitere Methode namens 'subtract', die zwei int-Parameter entgegennimmt und die Differenz der beiden Zahlen zurückgibt.
    Schritt 4: Schreibe eine weitere Methode namens 'makePositive', die positive Zahlen einfach zurückgibt und negative Zahlen zu positiven Zahlen umwandelt. (bei Argument '5' wird '5' zurückgegeben, aber bei Argument '-28' wird '28' zurückgegeben)
     */
    public static void main(String[] args) {
        System.out.println(add(5, 6));
        System.out.println(add(1, 2));
        System.out.println(add(3, 4));

        System.out.println(add(5.5, 6.6));
        System.out.println(add(1.1, 2.2));
        System.out.println(add(3.3, 4.4));

        System.out.println(subtract(5, 6));
        System.out.println(subtract(1, 2));
        System.out.println(subtract(3, 4));

        System.out.println(makePositive(5));
        System.out.println(makePositive(-28));
    }

    public static int add(int a, int b){
        return a + b;
    }

    public static double add(double a, double b){
        return a + b;
    }

    public static int subtract(int a, int b){
        return a - b;
    }

    public static int makePositive(int a){
        if (a < 0) {
            return -a;
        } else {
            return a;
        }
    }
}
