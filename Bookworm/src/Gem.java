/*
* Gem class. 7 types (enum), each gem provides damage boost to word and with 7 different effects(enum). POISON and
* BURN(DamageOverTimes), POWER_DOWN(DmgModifiers), SHIELD(Blockers)
*
*
* */

public class Gem {
    public static enum GEMS {AMETHYST, EMERALD, GARNET, SAPPHIRE, RUBY, CRYSTAL, DIAMOND}
    public static enum EFFECT {POISON, HEAL, POWER_DOWN, FREEZE, BURN, SHIELD, THREE_POTIONS}

    public GEMS gemType;
    private double damageBoost;
    private EFFECT effect;

    public Gem(GEMS newGemType){
        setDamageBoostAndEffect(newGemType);
    }

    public void setDamageBoostAndEffect(GEMS newGemType) {
        switch (newGemType){
            case AMETHYST: {damageBoost = 1.15; effect = EFFECT.POISON;}
            case EMERALD: {damageBoost = 1.20;effect = EFFECT.HEAL;}
            case GARNET: {damageBoost = 1.30;effect = EFFECT.POWER_DOWN;}
            case SAPPHIRE: {damageBoost = 1.25;effect = EFFECT.FREEZE;}
            case RUBY: {damageBoost = 1.35;effect = EFFECT.BURN;}
            case CRYSTAL: {damageBoost = 1.50;effect = EFFECT.SHIELD;}
            case DIAMOND: {damageBoost = 2.00;effect = EFFECT.THREE_POTIONS;}
        }
    }

    public GEMS getGemType(){
        return gemType;
    }

    public EFFECT getEffect(){
        return effect;
    }
}
