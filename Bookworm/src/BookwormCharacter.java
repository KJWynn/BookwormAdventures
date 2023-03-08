import java.util.ArrayList;

public abstract class BookwormCharacter {

    private double hearts;

    private int defense;
    private int attack;

    private StatusEffect[] statuses;


    private boolean alive;
    private int maxHearts;
    private int maxDefense;
    private int maxAttack;

    public BookwormCharacter(int newHearts, int newDefense, int newAttack){
        setNumHearts(newHearts);
        setDefense(newDefense);
        setAttack(newAttack);
        statuses = new StatusEffect[8];
        alive = true;
    }

    public int getAttack() {
        return attack;
    }

    public int getDefense() {
        return defense;
    }

    public StatusEffect[] getStatuses() {
        return statuses;
    }


    public double getHearts() {
        return hearts;
    }

    public boolean setNumHearts(double newHearts) {
        if (newHearts >= 0 && newHearts <= maxHearts) {
            hearts = newHearts;
            return true;
        }
        return false;
    }

    public void setAlive(boolean state){
        alive = state;
    }
    public boolean setDefense(int newDefense) {
        if (newDefense >= 0 && newDefense <= maxDefense) {
            defense = newDefense;
            return true;
        }
        return false;
    }

    public boolean setAttack(int newAttack) {
        if (newAttack >= 0 && newAttack <= maxAttack) {
            attack = newAttack;
            return true;
        }
        return false;
    }

    public void heal(double healAmount) {
        setNumHearts(getHearts() + healAmount);
    }

//    public void purify(){
//        for (int i = 0; i < statuses.length; i++){
//            if (statuses[i].getPurifiable()) {
//                statuses[i] = null;
//            }
//        }
//        statuses = new StatusEffect[8];
//    }


//    public void preattack(){
//        for (StatusEffect effect: statuses){
//
//        }
//    }
}
