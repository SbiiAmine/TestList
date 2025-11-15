import java.util.*;
public class Test {
    public static void main(String[] args) {

        List<Integer> integers = new ArrayList<>();
        integers.add(5);
        integers.add(1);
        integers.add(42);
        integers.add(7);
        System.out.println("avant tri " + integers);
        Collections.sort(integers);
        System.out.println("tri croissant : " + integers);
        Collections.sort(integers, Collections.reverseOrder());
        System.out.println("tri decroissant : " + integers);


        List<String> strings = new ArrayList<>();
        strings.add("banane");
        strings.add("pomme");
        strings.add("orange");
        System.out.println("Strings avant tri " + strings);
        Collections.sort(strings);
        System.out.println("Strings tri croissant " + strings);
        Collections.sort(strings, Collections.reverseOrder());
        System.out.println("Strings tri decroissant" + strings);

        Personne p1 = new Personne(1, "amine", "1", 23);
        Personne p2 = new Personne(2, "amine", "2", 25);
        Personne p3 = new Personne(3, "amine", "3", 27);


        List<Personne> personnes = new ArrayList<>();
        personnes.add(p1);
        personnes.add(p2);
        personnes.add(p3);

        personnes.sort(Comparator.comparingInt(Personne::getAge));
        System.out.println("croissant " + personnes);

        personnes.sort(Comparator.comparingInt(Personne::getAge).reversed());
        System.out.println("decroissant" + personnes);
    }
}
