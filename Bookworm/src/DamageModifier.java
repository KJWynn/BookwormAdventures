/*
 * ParentClass: StatusEffect
 * During instantiation, type(enum, see StatusEffect class), duration and multiplier of the modifier are set
 * The multiplier is constant for each modifier and does not change after each Turn
* */
public class DamageModifier extends StatusEffect {

    private STATUS_EFFECTS modifier;
    private double multiplier;
    public DamageModifier(STATUS_EFFECTS modifier, int duration, double multiplier) throws Exception{
        super(modifier, duration);
        if (!(modifier == STATUS_EFFECTS.POWER_UP || modifier == STATUS_EFFECTS.POWER_DOWN || modifier == STATUS_EFFECTS.ABSORBER))
        {throw new Exception("Can only instantiate DamageModifiers");}

        this.multiplier = multiplier; // should change with player level; whereas for enemies it is constant
    }

    public double getMultiplier() {
        return multiplier;
    }
}

