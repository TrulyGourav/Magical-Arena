package main.java;

public class Arena {
    private final Player playerA;
    private final Player playerB;
    private final Dice attackDice;
    private final Dice defenseDice;

    public Arena(Player playerA, Player playerB, Dice attackDice, Dice defenseDice) {
        this.playerA = playerA;
        this.playerB = playerB;
        this.attackDice = attackDice;
        this.defenseDice = defenseDice;
    }

    public void play() {
        while (playerA.isAlive() && playerB.isAlive()) {
            int attackRoll = attackDice.roll();
            int defenseRoll = defenseDice.roll();

            if (playerA.isAlive()) {
                int attackDamage = playerA.getAttackDamage(attackRoll);
                int defenseStrength = playerB.getDefenseStrength(defenseRoll);
                int damageDealt = Math.max(0, attackDamage - defenseStrength);
                playerB.takeDamage(damageDealt);
                System.out.println(playerA.getName()+" attacks with damage: " + attackDamage);
                System.out.println(playerB.getName()+" defends with strength: " + defenseStrength);
                System.out.println(playerB.getName()+" health reduced to: " + playerB.getHealth());
            }

            if (playerB.isAlive()) {
                int attackDamage = playerB.getAttackDamage(attackRoll);
                int defenseStrength = playerA.getDefenseStrength(defenseRoll);
                int damageDealt = Math.max(0, attackDamage - defenseStrength);
                playerA.takeDamage(damageDealt);
                System.out.println(playerB.getName()+" attacks with damage: " + attackDamage);
                System.out.println(playerA.getName()+" defends with strength: " + defenseStrength);
                System.out.println(playerA.getName()+" health reduced to: " + playerA.getHealth());
            }
        }

        if (!playerA.isAlive()) {
            System.out.println("Hurrayyy! "+playerB.getName()+" wins this Arena!");
        } else {
            System.out.println("Hurrayyy! "+playerA.getName()+" wins this Arena!");
        }
    }
}

