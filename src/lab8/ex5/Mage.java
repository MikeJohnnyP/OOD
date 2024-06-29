package lab8.ex5;

public class Mage extends GameCharacter {

    @Override
    String selectAbilities() {
        return "Pyromancy Flame\nDemon's Scar\nHurls a black fireball";
    }

    @Override
    String baseStat() {
        return "Vigor: 14\nAttunement: 5\nEndurance: 13\nVitality: 10\nStrength: 7\nDexterity: 10\nIntelligence: 18\nFaith: 8\nLuck: 4";
    }

    @Override
    String classType() {
        return "Mage";
    }

}