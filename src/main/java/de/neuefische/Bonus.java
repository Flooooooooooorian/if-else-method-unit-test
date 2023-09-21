package de.neuefische;

public class Bonus {
    /*
    Erstelle eine bedingte Anweisung, um die Methode 'subtract' aufzurufen, wenn die erste Zahl größer ist als die zweite, andernfalls rufe die Methode 'add' auf.
    Schreibe eine Methode, die prüft, ob eine Zahl gerade ist. Gerade Zahlen sollen einfach zurückgegeben werden, ungerade Zahlen sollen verdoppelt werden.
    Schreibe eine Methode, die eine Zeichenkette als Parameter entgegennimmt und prüft, ob sie ein Palindrom ist (also von vorne und hinten gelesen gleich ist). Gib true zurück, wenn es ein Palindrom ist, sonst gib false zurück.
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

        System.out.println(isEvenNumber(5));
        System.out.println(isEvenNumber(6));

        System.out.println(isPalindrome("anna"));
        System.out.println(isPalindrome("otto"));
        System.out.println(isPalindrome("hanna"));
    }

    public static int add(int a, int b){
        return a + b;
    }

    public static double add(double a, double b){
        return a + b;
    }

    public static int subtract(int a, int b){
        if(b > a){
            return add(a, b);
        }
        return a - b;
    }

    public static int makePositive(int a){
        if (a < 0) {
            return -a;
        } else {
            return a;
        }
    }

    public static int isEvenNumber(int n){
        if(n % 2 == 0){
            return n;
        }
        return n * 2;
    }

    public static boolean isPalindrome(String s){
        String reverse = "";
        for(int i = s.length() - 1; i >= 0; i--){
            reverse += s.charAt(i);
        }
        return s.equals(reverse);
    }
}
