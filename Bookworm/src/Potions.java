public class Potions {
    public static enum POTIONS {HEALTH, POWER_UP, PURIFY};
    public int quantity;
    private POTIONS potionType;
    public static final int MAX_QUANTITY = 10;

    public Potions(POTIONS newPotion){
        potionType = newPotion;
        quantity = 0;
    }

    public int getQuantity() {
        return quantity;
    }

    public boolean increment(int newQuantity){
        if (getQuantity() < MAX_QUANTITY){
            quantity += newQuantity;
            if (quantity > MAX_QUANTITY){quantity = MAX_QUANTITY;}
            return true;
        } return false;
    }

    public void decrement(int newQuantity){
        quantity -= newQuantity;
        if (quantity < 0){quantity = 0;}
    }
}
