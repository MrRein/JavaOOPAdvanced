package contracts;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
public interface Weapon {
    public int getAttackPoints();

    public int getDurabilityPoints();

    public void attack(Target target);
}
