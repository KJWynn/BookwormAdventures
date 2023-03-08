/*
 * ParentClass: StatusEffect
 * During instantiation, type(enum, see StatusEffect class) and duration are set.
 * The multiplier is constant for each modifier and does not change after each Turn
* */


public class Deny extends StatusEffect {

    private STATUS_EFFECTS deny;

    public Deny(STATUS_EFFECTS deny, int duration, BookwormCharacter character) throws Exception{
        super(deny, duration);
        if (!(deny == STATUS_EFFECTS.FREEZE || deny == STATUS_EFFECTS.STUN|| deny == STATUS_EFFECTS.PETRIFY))
        {throw new Exception("Can only instantiate denies");}
    }

}
