public class App {
    public static void main(String[] args) {

        Character knight = new Character();

        knight.strength = 10;
        knight.agility = 5;
        knight.intelligence = 0;
        knight.name = "Chen";
        knight.sayMyName();
        knight.sayMystrength();
        knight.sayMyAgility();
        knight.sayMyIntelligence();

        Character mage = new Character();

        mage.strength = 0;
        mage.agility = 5;
        mage.intelligence = 10;
        mage.name = "Akasha";
        mage.sayMyName();
        mage.sayMystrength();
        mage.sayMyAgility();
        mage.sayMyIntelligence();


        Character thief = new Character();

        thief.strength = 5;
        thief.agility = 10;
        thief.intelligence = 0;
        thief.name = "Gondar";
        thief.sayMyName();
        thief.sayMystrength();
        thief.sayMyAgility();
        thief.sayMyIntelligence();

        Character archer = new Character();

        archer.strength = 5;
        archer.agility = 5;
        archer.intelligence = 5;
        archer.name = "miya";
        archer.sayMyName();
        archer.sayMystrength();
        archer.sayMyAgility();
        archer.sayMyIntelligence();
        
    } 
} 

