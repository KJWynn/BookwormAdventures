import org.javatuples.*;

import java.util.ArrayList;

public class Player extends BookwormCharacter{

    private Potions[] potions;
    public static enum IMMUNITIES {POISON, BURN, STUN, PETRIFY, POWER_DOWN, TILE_SMASH, TILE_LOCK }
    public ArrayList<IMMUNITIES> immunities;
    public Player(int newHearts, int newDefense, int newAttack, ArrayList<IMMUNITIES> newImmunities){
        super(newHearts, newDefense, newAttack);
        setPotions();
        immunities = newImmunities;


    }
    public ArrayList<IMMUNITIES> getImmunities() {
        return immunities;
    }
    public double attackEnemy(Enemy enemy) {
        // returns overkill
        // damage: take enemy's armor into consideration and damage absorbing shield,
        double shieldMultiplier = 0;
        StatusEffect[] statuses = enemy.getStatuses();
        for (StatusEffect elem: statuses) {
            if ((elem instanceof Blockers) && (((Blockers) elem).getShieldType() == Blockers.DEFEND.DAMAGE_ABSORBING_SHIELD)) {
                shieldMultiplier = 0.75;
                break;
            }
        }

        // effects: considers gems in player's word, depends on whether enemy is immune
        Gem[] gems = wordDamageDealt().getValue1();
        for (Gem elem: gems){

        }


        double actual_damage = wordDamageDealt().getValue0() * enemy.getArmor() * shieldMultiplier;
        double roundedDamage = Math.round(actual_damage*4)/4f;
        if (enemy.getHearts() <= roundedDamage){enemy.setAlive(false);}
        double overkill = roundedDamage - enemy.getHearts();
        enemy.setNumHearts(enemy.getHearts() - roundedDamage);

        return overkill;
    }

    public void setPotions(){
        Potions health = new Potions(Potions.POTIONS.HEALTH);
        Potions powerUp = new Potions(Potions.POTIONS.POWER_UP);
        Potions purify = new Potions(Potions.POTIONS.PURIFY);
        potions = new Potions[3];
        potions[0] = health;
        potions[1] = powerUp;
        potions[2] = purify;
    }

    public Pair<Double, Gem[]> wordDamageDealt(){
        // based on gem boost and attack power, power-up/down, bonus damage, damage from tiles
        double wordDamage = 0;
        Gem amethyst = new Gem(Gem.GEMS.AMETHYST);
        Gem[] gems = {amethyst};
        return new Pair<>(wordDamage, gems);
    }
}
