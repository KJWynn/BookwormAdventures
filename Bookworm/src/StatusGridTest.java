import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatusGridTest {

    DamageOverTime burn = new DamageOverTime(StatusEffect.STATUS_EFFECTS.BURN, 3, 2.0);
    DamageOverTime poison = new DamageOverTime(StatusEffect.STATUS_EFFECTS.POISON, 2, 1.0);
    DamageOverTime bleed = new DamageOverTime(StatusEffect.STATUS_EFFECTS.BLEED, 4, 0.5);
    StatusEffect powerDown = new DamageModifier(StatusEffect.STATUS_EFFECTS.POWER_DOWN, 2, 0.75);

    StatusGridTest() throws Exception {
    }

    @org.junit.jupiter.api.Test


    void getDOTs() {
        StatusGrid grid = new StatusGrid();
        for (int i=1; i <= 1; i++) {
            grid.addStatus(burn);
        }
        for (int i=1; i <= 2; i++) {
            grid.addStatus(poison);
        }
        for (int i=1; i <= 3; i++) {
            grid.addStatus(bleed);
        }
        for (int i=1; i <= 3; i++) {
            grid.addStatus(powerDown);
        }
        for (DamageOverTime dot: grid.getDOTs()){
            System.out.println(dot);
        }
    }

    @Test
    void addStatus() {
        StatusGrid grid = new StatusGrid();
        for (int i=0; i <= 11; i++) {
            grid.addStatus(burn);
        }
    }

    @Test
    void removeStatuses() throws Exception {
        StatusGrid grid = new StatusGrid();
        for (int i=1; i <= 3; i++) {
            grid.addStatus(bleed);
        }
        grid.addStatus(new DamageOverTime(StatusEffect.STATUS_EFFECTS.CURSED, 0, 2.0));
        grid.removeStatuses();

        for (StatusEffect effect: grid.statuses){
            System.out.println(effect);
        }
    }
}