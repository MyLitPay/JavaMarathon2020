package day11.task2;

public class Magician extends Hero implements PhysAttack, MagicAttack {

    public Magician() {
        setHealth(100);
        setPhysAtt(5);
        setMagicAtt(20);
        setMagicDef(0.8);
    }

    @Override
    public void magicalAttack(Hero hero) {
        double attack = getMagicAtt() - (getMagicAtt() * hero.getMagicDef());
        double newHealth = hero.getHealth() - attack;
        hero.setHealth((int) newHealth);
        if (newHealth < 0) {
            hero.setHealth(0);
        }
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
        return "Magician{" +
                "health=" + getHealth() + "}";
    }
}
