/*
* Tiles make up the Tile Grid and can have one effect per tile. If tile is present in word spelled, the effect
* is taken into consideration. Certain effects can be removed(Gem steal)
* Gems are added to tiles/upgraded when
*    Words of certain length are spelled
*    Certain treasures are used(Scramble)
*    Overkill bonus
*    Moxie's Mini Game prizes
*    Certain companions are used(Skeletrox upgrades tiles)
* */
public class Tile {
    private char letter;
    private TileEffect effect; // can be null or a particular TileEffect only

//    case AMETHYST: {damageBoost = 1.15; effect = EFFECT.POISON;}
//    case EMERALD: {damageBoost = 1.20;effect = EFFECT.HEAL;}
//    case GARNET: {damageBoost = 1.30;effect = EFFECT.POWER_DOWN;}
//    case SAPPHIRE: {damageBoost = 1.25;effect = EFFECT.FREEZE;}
//    case RUBY: {damageBoost = 1.35;effect = EFFECT.BURN;}
//    case CRYSTAL: {damageBoost = 1.50;effect = EFFECT.SHIELD;}
//    case DIAMOND: {damageBoost = 2.00;effect = EFFECT.THREE_POTIONS;}


}
