package day11.task2;

public class Shaman extends Hero implements PhysAttack, MagicAttack, Healer {

    public Shaman() {
        setHealth(100);
        setPhysAtt(10);
        setMagicAtt(15);
        setPhysDef(0.2);
        setMagicDef(0.2);
    }

    @Override
    public void healHimself() {
        setHealth(getHealth() + 50);
        if (getHealth() > 100) {
            setHealth(100);
        }
    }

    @Override
    public void healTeammate(Hero hero) {
        hero.setHealth(hero.getHealth() + 30);
        if (hero.getHealth() > 100) {
            hero.setHealth(100);
        }
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
        return "Shaman{" +
                "health=" + getHealth() + "}";
    }
}
