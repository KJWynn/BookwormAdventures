/*
* A StatusEffect is anything that can appear on StatusGrid
* ChildClass: DamageOverTime(DOT)
* */

public abstract class StatusEffect extends Effect{

    public static enum STATUS_EFFECTS {POWER_DOWN, POWER_UP, POISON, FREEZE, BURN, BLEED, STUN, PETRIFY, STASIS, SHIELD,
        REFLECTED, CURSED, ABSORBER, REFLECTOR, WORD_LENGTH_IMMUNITY}

    private STATUS_EFFECTS status;

    public StatusEffect(STATUS_EFFECTS status, int duration){
        this.status = status;
        setDuration(duration);
        setPurifiable();
    }

    public void setPurifiable() {
        switch (this.status){
            case SHIELD:
            case ABSORBER:
            case REFLECTOR:
            case WORD_LENGTH_IMMUNITY:
            case POWER_UP: this.purifiable = false;
            default: this.purifiable = true;
        }

    }

    public void setDuration(int duration){
        this.duration = duration;
    }
    public String toString() {
        return "StatusEffect: " + status;
    }
}
