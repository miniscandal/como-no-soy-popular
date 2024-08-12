public class Main {
    public static void main(String... args) {
        Main main = new Main();

        // Evie y true son los argumentos que se pasan
        main.descendant("Evie", true);
    }

    // name y evil son parámetros
    public void descendant(String name, boolean evil) {
        String message;

        if (evil) {
            message = "embraces darkness and wreaks havoc.";
        } else {
            message = "radiates kindness and spreads joy.";
        }

        System.out.println(name + " " + message);
    }
}
