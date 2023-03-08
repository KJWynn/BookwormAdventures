import java.util.ArrayList;


public class Enemy extends BookwormCharacter{
    private double armor;
    public static enum IMMUNITIES {POISON, BURN, FREEZE}
    public ArrayList<IMMUNITIES> immunities;
    public Enemy(int newHearts, int newDefense, int newAttack, double newArmor, ArrayList<IMMUNITIES> newImmunities){
        super(newHearts, newDefense, newAttack);
        armor = newArmor;
        immunities = newImmunities;

    }
    public void attackEnemy(Player player) {
        // take player's defense into account, shields if present, treasures that negate damage

    }

    public double damageDealt(){
        // based on power-up/down, damage from tiles
        return 1;
    }

//    public boolean checkImmunity(Gem newGem){
//        boolean immune = false;
//        switch (newGem.getGemType()){
//            case AMETHYST:
//            if (getImmunities().contains(IMMUNITIES.POISON))
//                immune = true;
//            case RUBY:
//            if (getImmunities().contains(IMMUNITIES.BURN))
//                immune = true;
//            case SAPPHIRE:
//            if (getImmunities().contains(IMMUNITIES.FREEZE))
//                immune = true;
//        }
//        return immune;
//    }

    private ArrayList<IMMUNITIES> getImmunities() {
        return immunities;
    }

    public double getArmor(){
        return armor;
    }
}
