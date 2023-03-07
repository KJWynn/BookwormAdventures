public class DamageOverTimes extends StatusEffect {
    public static enum DOTS {POISON, BLEED, BURN, DAMAGE_REFLECTION, CURSED_TILES}
    private DOTS type;
    private double damage;
    private final double multiplier;

    public DamageOverTimes(DOTS newType, double newDamage, int newDuration){
        setType(newType);
        setDamage(newDamage);
        setPurifiable(true);
        if (newType == DOTS.DAMAGE_REFLECTION || newType == DOTS.CURSED_TILES){
            setDuration(1);
        }
        else {
            setDuration(newDuration);
        }
        if (newType == DOTS.BURN){multiplier = 0.5;}
        else if (newType == DOTS.BLEED){multiplier = 2.0;}
        else {multiplier = 1.0;} // POISON

    }

    public boolean setDamage(double newDamage){
        if (newDamage >= 0.25 && newDamage <= 3.5) {
            damage = newDamage;
            return true;
        }
        return false;
    }
    public void setType(DOTS newType){
        type = newType;
    }

    public double getDamage(){
        return damage;
    }

    public double getMultiplier(){
        return multiplier;
    }
}
