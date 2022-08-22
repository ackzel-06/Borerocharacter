public class Character {
    int strength;
    int agility;
    int intelligence;
    String name;

    public void sayMyName() {
        System.out.println("Hello I am " + name);
    }   
    public void sayMystrength() {   
        System.out.println("strength: " + strength);
    }
    public void sayMyAgility() {
        System.out.println("Agility: " + agility);
    }
    public void sayMyIntelligence() {
        System.out.println("Intellegence: " + intelligence + "\n");
    }
}