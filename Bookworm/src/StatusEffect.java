public class StatusEffect {
    private int duration;
    private boolean purifiable;

    public int getDuration() {
        return duration;
    }
    public boolean getPurifiable(){
        return purifiable;
    }

    public void setDuration(int duration) {
        if (duration >= 0 || duration <= 9) {
            this.duration = duration;
        }
    }

    public void setPurifiable(boolean purifiable) {
        this.purifiable = purifiable;
    }
}
