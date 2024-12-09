public class Bat extends Mammal {

    public Bat() {
        this.energy = 300; 
    }

    public void fly() {
        energy -= 50;
        System.out.println("The bat is flying, energy reduced by 50.");
    }

    public void eatHumans() {
        energy += 25;
        System.out.println("The bat eats humans and feels satisfied, energy increased by 25.");
    }

    public void attackTown() {
        energy -= 100;
        System.out.println("The bat attacks a town, energy reduced by 100.");
    }
}
