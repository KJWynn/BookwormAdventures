/*
* ParentClass: StatusEffect
* During instantiation, type(enum, see StatusEffect class), damage, duration and multiplier of the DOT are set
* Multiplier is fixed throughout game and is set with private helper method
* The damage should change(except Poison) after each Turn due to the multiplier
*
* */
public class DamageOverTime extends StatusEffect {

    private STATUS_EFFECTS DOT;
    private double damage;
    private double multiplier;

    public DamageOverTime(STATUS_EFFECTS DOT, int duration, double damage) throws Exception{
        super(DOT, duration);
        if (!(DOT == STATUS_EFFECTS.BURN || DOT == STATUS_EFFECTS.BLEED || DOT == STATUS_EFFECTS.CURSED
        || DOT == STATUS_EFFECTS.POISON || DOT == STATUS_EFFECTS.REFLECTED))
        {throw new Exception("Can only instantiate DOTs");}

        this.damage = damage;
        setMultiplier();
    }

    private void setMultiplier() {
        if (this.DOT == STATUS_EFFECTS.BURN) {
            multiplier = 0.5;
        } else if (DOT == STATUS_EFFECTS.BLEED) {
            multiplier = 2.0;
        } else {
            multiplier = 1.0;
        } // POISON, REFLECTED, CURSE
    }

    private void updateDamage(){
        // After a Turn, damage is updated
        this.damage *= this.multiplier;
    }
}