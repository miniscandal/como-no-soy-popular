class Descendants {
    public static void main(String[] args) {
        System.out.println("Descendants");
        useMagicForGood("evil");
        useMagicForGood("good");
    }

    public static void useMagicForGood(String action) {
        if (action.equals("evil")) {
            System.out.println("Mal has decided to use her magic only for good");

            return;
        }

        System.out.println("Mal is using her magic for good!");

        // Rest of the code...
    }
}
