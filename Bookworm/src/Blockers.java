public class Blockers extends StatusEffect {
    public static enum DEFEND {CRYSTAL_SHIELD, COMPANION_SHIELD, DAMAGE_ABSORBING_SHIELD};
    public static final int multiplier = 0;
    private DEFEND shieldType;

    public Blockers(DEFEND newShield, int newDuration){
        setShieldType(newShield);
        if (newShield == DEFEND.COMPANION_SHIELD) {setDuration(1);}
        else if (newShield == DEFEND.CRYSTAL_SHIELD || newShield == DEFEND.DAMAGE_ABSORBING_SHIELD) {setDuration(newDuration);}
    }

    public DEFEND getShieldType(){
        return shieldType;
    }

    public void setShieldType(DEFEND newShield){
        shieldType = newShield;
    }
}
