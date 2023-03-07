public class Denies extends StatusEffect {
    public static enum DENIES {STUN, PETRIFY, FREEZE};
    public DENIES denyType;

    public Denies(DENIES newDeny){
        setPurifiable(true);
        if (newDeny == DENIES.STUN || newDeny == DENIES.FREEZE) {setDuration(1);}
        else if (newDeny == DENIES.PETRIFY){setDuration(2);}
    }

    public DENIES getDenyType(){
        return denyType;
    }

    public void setDenyType(DENIES newDenyType) {
        denyType = newDenyType;
    }
}
