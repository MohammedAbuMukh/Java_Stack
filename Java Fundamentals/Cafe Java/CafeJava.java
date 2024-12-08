public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app. 
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";

        // Menu variables (add yours below)
        double mochaPrice = 3.5;
        double dripCoffeePrice = 5.5;
        double lattePrice = 9.5;
        double cappuccinoPrice = 7.5;

        // Customer name variables (add yours below)
        String customer1 = "Shatha";
        String customer2 = "Ahmad";
        String customer3 = " Sali";
        String customer4 = "Adam";

        // Order completions (add yours below)
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = true;
        boolean isReadyOrder3 = false;
        boolean isReadyOrder4 = true;

        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:
        System.out.println(generalGreeting + customer1); // Displays "Welcome to Cafe Java, Shatha"
        // ** Your customer interaction print statements will go here ** //

        // Sali ordered a coffee
        System.out.println(generalGreeting + customer3);
        if (isReadyOrder3) {
            System.out.println(customer3 + readyMessage);
        } else {
            System.out.println(customer3 + pendingMessage);
        }

        // Ahmad ordered a cappuccino
        System.out.println(generalGreeting + customer2);
        if (isReadyOrder2) {
            System.out.println(customer2 + readyMessage);
            System.out.println(displayTotalMessage + cappuccinoPrice);
        } else {
            System.out.println(customer2 + pendingMessage);
        }

        // Sali just ordered 2 lattes
        double saliLatteTotal = lattePrice * 2;
        System.out.println(displayTotalMessage + saliLatteTotal);
        isReadyOrder3 = true; 
        if (isReadyOrder3) {
            System.out.println(customer3 + readyMessage);
        } else {
            System.out.println(customer3 + pendingMessage);
        }

         // Adam's order correction
         double originalCharge = dripCoffeePrice; 
         double correctCharge = lattePrice; 
         double difference = correctCharge - originalCharge;
         System.out.println("The new calculated total for Adam : " + displayTotalMessage + difference);

          // Testing changing variables
        mochaPrice = 4.0; 
        System.out.println("New mocha price: " + mochaPrice);
    }
    
}