/*
* Base class for effects which have duration and may be purified.
* The duration decrements or increments based on certain conditions implemented on a Turn
* Derived classes: TileEffect, StatusEffect
* */

public abstract class Effect {
    public int duration;
    public boolean purifiable;

    public boolean getPurifiable() {
        return this.purifiable;
    }


    public abstract void setDuration(int duration);
    public abstract void setPurifiable();


}
