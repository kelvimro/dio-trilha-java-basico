public class ExercicioMetodos {
    /*
     * This exercise is about methods and classes, how to define and use their
     * methods.
     * The exercise is part of the DIO Java course.
     */

    public static class SmartTv {
        boolean on = false;
        int channel = 1;
        int volume = 25;

        public void changeChannel(int newChannel) {
            System.out.println("Channel changed: " + channel + " -> " + newChannel);
            channel = newChannel;
        }

        public void riseChannel() {
            channel++;
            System.out.println("Channel increased by 1");
        }

        public void lowerChannel() {
            channel--;
            System.out.println("Channel decreased by 1");
        }

        public void turnOn() {
            on = true;
            System.out.println("TV is now on");
        }

        public void turnOff() {
            on = false;
            System.out.println("TV is now off");
        }

        public void riseVolume() {
            volume++;
            System.out.println("Volume increased by 1");
        }

        public void lowerVolume() {
            volume--;
            System.out.println("Volume decreased by 1");
        }

        public void printTvStatus(SmartTv tv) {
            System.out.println(
                    "Tv status: " + (tv.on ? "On" : "Off")
                            + ", Channel: " + tv.channel
                            + ", Volume: " + tv.volume);
        }
    }

    public static void main(String[] args) {
        SmartTv tv = new SmartTv();
        // Print the initial values
        System.out.println("Initial TV status:");
        tv.printTvStatus(tv);

        // Example of how to use the methods
        tv.turnOn();
        tv.changeChannel(5); // Change channel to 5
        tv.riseVolume(); // Increase volume by 1

        // Print the final values after changes
        System.out.println("Final TV status:");
        tv.printTvStatus(tv);

    }

}
