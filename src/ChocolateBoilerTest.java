public class ChocolateBoilerTest {
    public static void main(String[] args) {
        ChocolateBoiler chocolateBoiler = ChocolateBoiler.getInstance();
        chocolateBoiler.fill();
        System.out.println("fill - " + !chocolateBoiler.isEmpty());
        chocolateBoiler.boil();
        System.out.println("boil - " + chocolateBoiler.isBoiled());
        chocolateBoiler.drain();
        System.out.println("fill - " + !chocolateBoiler.isEmpty());
    }
}
