public class DmgModifiers extends StatusEffect {
    public static enum DAMAGE_MODIFIERS {POWER_UP, POWER_DOWN};
    private double multiplier;

    public DmgModifiers(DAMAGE_MODIFIERS newType, int newDuration){
        if (newType == DAMAGE_MODIFIERS.POWER_DOWN){
            setPurifiable(true);
            multiplier = 0.5; // POWER_DOWN
        } else {
            setPurifiable(false);
            multiplier = 1.5; // POWER_UP
        }
        setDuration(newDuration);

    }

    public double getMultiplier(){
        return multiplier;
    }


}
