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
        System.out.println("Initial credits: ");
        System.out.println("    Player A: "+playerA.toString());
        System.out.println("    Player B: "+playerB.toString());
        System.out.println("Lets start the game!");
        System.out.println("-----------------------");
        while (true) {
            // playerA's turn
            if (playerA.isAlive()) {
                int attackRoll = attackDice.roll();
                int defenseRoll = defenseDice.roll();
                int attackDamage = playerA.getAttackDamage(attackRoll);
                int defenseStrength = playerB.getDefenseStrength(defenseRoll);
                int damageDealt = Math.max(0, attackDamage - defenseStrength);
                playerB.takeDamage(damageDealt);
                System.out.println(playerA.getName()+" attacks with damage: " + attackDamage);
                System.out.println(playerB.getName()+" defends with strength: " + defenseStrength);
                System.out.println(playerB.getName()+" health reduced to: " + playerB.getHealth());
            }
            // playerB's turn
            if (playerB.isAlive()) {
                int attackRoll = attackDice.roll();
                int defenseRoll = defenseDice.roll();
                int attackDamage = playerB.getAttackDamage(attackRoll);
                int defenseStrength = playerA.getDefenseStrength(defenseRoll);
                int damageDealt = Math.max(0, attackDamage - defenseStrength);
                playerA.takeDamage(damageDealt);
                System.out.println(playerB.getName()+" attacks with damage: " + attackDamage);
                System.out.println(playerA.getName()+" defends with strength: " + defenseStrength);
                System.out.println(playerA.getName()+" health reduced to: " + playerA.getHealth());
            }
            if (!playerA.isAlive() || !playerB.isAlive()){
                break;
            }
            System.out.println("---------Next Cycle--------");
        }

        System.out.println("-----------------------");
        if (!playerA.isAlive()) {
            System.out.println("RESULT: Hurrayyy! "+playerB.getName()+" wins this Arena!");
        } else {
            System.out.println("RESULT: Hurrayyy! "+playerA.getName()+" wins this Arena!");
        }
        System.out.println("-----------------------");
    }
}

