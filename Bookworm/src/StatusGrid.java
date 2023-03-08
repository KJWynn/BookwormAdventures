import java.util.ArrayList;
/*
* The grid which tracks all statuses the BookwormCharacter(player/enemy) currently has. Can have a maximum of 12 at once
* Some statuses can have duplicates(POISON, BURN, BLEED, REFLECTED, CURSE) which are also DOTs
* Statuses are removed when purified or when duration ends
* TODO: in removeStatus should account for purification of grid
* */

public class StatusGrid {
    public ArrayList<StatusEffect> statuses;

    public StatusGrid(){
        this.statuses = new ArrayList<>();
    }

    public void addStatus(StatusEffect effect) {
        int numStatuses = this.statuses.size();
        if (numStatuses <= 11) { // must be 11 and not 12 because each time an element is added, the array size is increased
            this.statuses.add(effect);
        } else {
            System.out.println("exceeded");
        }
    }

    public void removeStatuses(){
        // When purified or when duration ends
        // TODO when purified
        ArrayList<StatusEffect> toBeRemoved = new ArrayList<>();
        for (StatusEffect effect:this.statuses){
            if (effect.duration == 0){
                System.out.println("Removing " + effect.toString());
                toBeRemoved.add(effect);
            }
        }
        for (StatusEffect effect: toBeRemoved){
            this.statuses.remove(effect);
        }
//        this.statuses.removeIf(status -> status.duration == 0);

    }

    public ArrayList<DamageOverTime> getDOTs(){
        ArrayList<DamageOverTime> dots = new ArrayList<>();
        for (StatusEffect status: this.statuses){
            if (status instanceof DamageOverTime){dots.add((DamageOverTime)status);}
        }
        return dots;
    }
}
