package day11.task2;

public class Paladin extends Hero implements PhysAttack, Healer{

    public Paladin() {
        setHealth(100);
        setPhysAtt(15);
        setPhysDef(0.5);
        setMagicDef(0.2);
    }

    @Override
    public void healHimself() {
        setHealth(getHealth() + 25);
        if (getHealth() > 100) {
            setHealth(100);
        }
    }

    @Override
    public void healTeammate(Hero hero) {
        hero.setHealth(hero.getHealth() + 10);
        if (hero.getHealth() > 100) {
            hero.setHealth(100);
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
        return "Paladin{" +
                "health=" + getHealth() + "}";
    }
}
