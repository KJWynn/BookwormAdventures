/*
* Positive(Gems) are unpurifiable with unlimited duration) and Negative effects(purifiable and limited duration, except
  FIRE_TILE)
* Attribute of Tile class.
* Contains getters and setters for duration and purifiable, and method to decrement duration of effects that allow so.
* */


public class TileEffect extends Effect{
    public static enum TILE_EFFECTS {TILE_SMASH, TILE_LOCK, PLAGUED_TILE, WARPED_TILE, CURSED_TILE, FIRE_TILE, AMETHYST,
        EMERALD, GARNET, SAPPHIRE, RUBY, CRYSTAL, DIAMOND, RAINBOW_TILE};
    private TILE_EFFECTS effect;

    public TileEffect(TILE_EFFECTS effect, int duration){
        this.effect = effect;
        setDuration(duration);
        setPurifiable();
    }


    public void setDuration(int duration) {
        switch (this.effect){
            case FIRE_TILE:
            case AMETHYST:
            case SAPPHIRE:
            case GARNET:
            case RUBY:
            case EMERALD:
            case DIAMOND:
            case RAINBOW_TILE:
            case CRYSTAL: this.duration = 10;
            default: this.duration = duration;
        }

    }

    public void setPurifiable() {
        switch (this.effect){
            case FIRE_TILE:
            case AMETHYST:
            case SAPPHIRE:
            case GARNET:
            case RUBY:
            case EMERALD:
            case DIAMOND:
            case RAINBOW_TILE:
            case CRYSTAL: this.purifiable = false;
            default: this.purifiable = true;
        }

    }


}
