public class Device {
    protected int battery;

    public Device() {
        this.battery = 100; 
    }

    public String getStatus() {
        return "Battery remaining: " + this.battery + "%";
    }
}
