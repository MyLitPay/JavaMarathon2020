package day11.task2;

public class Warrior extends Hero implements PhysAttack {

    public Warrior() {
        setHealth(100);
        setPhysAtt(30);
        setPhysDef(0.8);
    }

    @Override
    public void physicalAttack(Hero hero) {
        double attack = getPhysAtt() - (getPhysAtt() * hero.getPhysDef());
        double newHealth = hero.getHealth() - attack;
        hero.setHealth((int) newHealth);
        if (newHealth < 0) {
            hero.setHealth(0);
        }
    }

    @Override
    public String toString() {
        return "Warrior{" +
                "health=" + getHealth() + "}";
    }
}
