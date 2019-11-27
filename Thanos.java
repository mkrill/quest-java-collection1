import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Thanos {

    public static void main(String[] args) {

        // TODO 1 : Create an empty heroes list
    	ArrayList<Hero> heroes = new ArrayList<Hero>();

        // TODO 2 : Add those heroes to the list
        // name: Black Widow, age: 34
    	heroes.add(new Hero("Black Widow", 34));
    	
        // name: Captain America, age: 100
    	heroes.add(new Hero("Captain America", 100));
        // name: Vision, age: 3
    	heroes.add(new Hero("Vision", 3));    	
        // name: Iron Man, age: 48
    	heroes.add(new Hero("Iron Man", 48));
        // name: Scarlet Witch, age: 29
    	heroes.add(new Hero("Scarlet Witch", 29));
        // name: Thor, age: 1500
    	Hero thor = new Hero("Thor", 1500);
    	heroes.add(thor);
        // name: Hulk, age: 49
    	heroes.add(new Hero("Hulk", 49));
        // name: Doctor Strange, age: 42
    	heroes.add(new Hero("Doctor Strange", 42));

        // TODO 3 : It's Thor birthday, now he's 1501
    	thor.setAge(thor.getAge()+1);
    	System.out.println("Thor has turned: " + thor.getAge() + ".\n");

        // TODO 4 : Shuffle the heroes list
        Collections.shuffle(heroes);

        // TODO 5 : Keep only the half of the list
        List<Hero> lastHeroes = heroes.subList(0,  (int) heroes.size() / 2);

        // TODO 6 : Loop through the list and display the name of the remaining heroes
        
        for (Hero hero : lastHeroes) {
        	System.out.println(hero.getName());
        }
    }
}
