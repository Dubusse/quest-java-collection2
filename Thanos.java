import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Thanos {

	
	static Comparator<Hero> comparator = new Comparator<Hero>() {

	    @Override
	    public int compare(Hero hero1, Hero hero2) {
	        return hero1.getName().compareTo(hero2.getName());
	    }
	};
	

    public static void main(String[] args) {

        List<Hero> heroes = new ArrayList<>();
        heroes.add(new Hero("Hulk", 49));
        heroes.add(new Hero("Black Widow", 34));
        heroes.add(new Hero("Captain America", 100));
        heroes.add(new Hero("Thor", 1501));

     // TODO 1: Modifier Hero pour implémenter Comparable et trier par nom (croissant)
        
        Collections.sort(heroes, comparator);
            System.out.println("\nOrder by name:");
            showList(heroes);


     // TODO 2: Ajouter un comparateur et trier par âge (décroissant)

        Collections.sort(heroes);
        System.out.println("\nOrder by age:");
        showList(heroes);
    }

    private static void showList(List<Hero> heroes) {
        for (Hero heroe : heroes) {
            System.out.println(heroe.getName() + ", " + heroe.getAge());
        }
    }




}