package lab8.ex5;

public class Warrior extends GameCharacter {

    @Override
    String selectAbilities() {
        return "Stamp\nWild strike\nLion's claw";
    }

    @Override
    String baseStat() {
        return "Vigor: 20\nAttunement: 5\nEndurance: 17\nVitality: 15\nStrength: 10\nDexterity: 10\nIntelligence: 15\nFaith: 10\nLuck: 8";
    }

    @Override
    String classType() {
        return "Warrior";
    }

}