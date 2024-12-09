public class Gorilla extends Mammal {

    public void throwSomething() {
        energy -= 5;
        System.out.println("The gorilla has thrown something, energy reduced by 5.");
    }

    public void eatBananas() {
        energy += 10;
        System.out.println("The gorilla eats bananas and feels satisfied, energy increased by 10.");
    }

    public void climb() {
        energy -= 10;
        System.out.println("The gorilla has climbed a tree, energy reduced by 10.");
    }
}
