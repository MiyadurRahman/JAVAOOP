package arraylist;

import java.util.*;

class Cow implements Comparable<Cow> {
    String name;
    int price;

    public Cow(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String toString() {
        return name + " costs " + price + " taka.";
    }

    // (i) compareTo method — sort by price (ascending)
    public int compareTo(Cow other) {
        return this.price - other.price;
    }
}

// (ii) Comparator class — sort by name
class NameComparator implements Comparator<Cow> {
    public int compare(Cow c1, Cow c2) {
        return c1.name.compareTo(c2.name);
    }
}

class fall2024 {
    public static void main(String[] args) {
        ArrayList<Cow> cows = new ArrayList<>();

        cows.add(new Cow("Raja Babu", 2700000));
        cows.add(new Cow("Hero Alom", 1500000));
        cows.add(new Cow("Sultan", 1800000));
        cows.add(new Cow("Minister", 1200000));
        cows.add(new Cow("Shahid", 2200000));

        System.out.println("Before Sorting:");
        for (Cow c : cows) {
            System.out.println(c);
        }

        // Sort by price (uses compareTo)
        Collections.sort(cows);
        System.out.println("\nAfter Sorting by Price:");
        for (Cow c : cows) {
            System.out.println(c);
        }

        // (iii) Sort by name (uses Comparator)
        Collections.sort(cows, new NameComparator());
        System.out.println("\nAfter Sorting by Name:");
        for (Cow c : cows) {
            System.out.println(c);
        }
    }
}
