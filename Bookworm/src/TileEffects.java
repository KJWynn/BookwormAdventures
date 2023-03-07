public class TileEffects extends StatusEffect {
    public static enum TILE_EFFECTS {TILE_SMASH, TILE_LOCK, PLAGUED_TILE, WARPED_TILE, CURSED_TILE, FIRE_TILE}
    private TILE_EFFECTS effect;

    public TileEffects(TILE_EFFECTS newTileEffect, int newDuration){
        effect = newTileEffect;

        // All purifiable and have duration(max 9) except fire tiles
        if (newTileEffect == TILE_EFFECTS.FIRE_TILE){
            setPurifiable(false);
            setDuration(999);
        } else {
            setPurifiable(true);
            setDuration(newDuration);
        }

    }
}
