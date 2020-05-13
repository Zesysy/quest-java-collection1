import java.util.*;

public class Thanos {

    public static void main(String[] args) {

        Hero blackWidow = new Hero("Black Widow", 34);
        Hero captainAmerica = new Hero("Captain America", 100);
        Hero vision = new Hero("Vision", 3);
        Hero ironMan = new Hero("Iron Man", 48);
        Hero scarlettWitch = new Hero("Scarlett Witch", 29);
        Hero thor = new Hero("Thor", 1500);
        Hero hulk = new Hero("Hulk", 49);
        Hero drStrange = new Hero("Doctor Strange", 42);

        // TODO 1 : Create an empty heroes list
        ArrayList<Hero> heroesList = new ArrayList<>();

        // TODO 2 : Add those heroes to the list
        heroesList.add(blackWidow);
        heroesList.add(captainAmerica);
        heroesList.add(vision);
        heroesList.add(ironMan);
        heroesList.add(scarlettWitch);
        heroesList.add(thor);
        heroesList.add(hulk);
        heroesList.add(drStrange);

        // TODO 3 : It's Thor birthday, now he's 1501
        thor.setAge(1501);

        // TODO 4 : Shuffle the heroes list
        Collections.shuffle(heroesList);

        // TODO 5 : Keep only the half of the list
        List<Hero> halfHeroesList = heroesList.subList(0, heroesList.size() / 2);

        // TODO 6 : Loop throught the list and display the name of the remaining heroes
        for (Hero hero : halfHeroesList) {
            System.out.println(hero.getName());
        }
    }
}
