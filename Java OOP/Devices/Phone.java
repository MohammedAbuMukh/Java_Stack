public class Phone extends Device {

    public Phone() {
        super();
    }

    public void makeCall() {
        if (this.battery >= 5) {
            this.battery -= 5;
            System.out.println("You make a call. " + getStatus());
        } else {
            System.out.println("Battery too low to make a call.");
        }
    }

    public void playGame() {
        if (this.battery < 25) {
            System.out.println("Battery too low to play a game.");
        } else {
            this.battery -= 20;
            System.out.println("You play a game. " + getStatus());
            if (this.battery < 10) {
                System.out.println("Battery critical! Please charge your phone.");
            }
        }
    }

    public void charge() {
        this.battery = Math.min(this.battery + 50, 100); 
        System.out.println("You charge the phone. " + getStatus());
    }
}
