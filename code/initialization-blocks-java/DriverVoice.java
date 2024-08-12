public class DriverVoice {
    public DriverVoice() {
    }

    public void reportStatus() {
        System.out.println("Loading The Voice Driver");
    }

    public void sing(String data) {
        System.out.println("\nPlaying Song...\n");

        String[] parts = data.split(" ");
        int syllableCount = 0;

        while (true) {
            for (String part : parts) {
                System.out.print(part + " ");
                syllableCount += countSyllables(part);

                if (syllableCount >= 15) {
                    System.out.println();
                    syllableCount = 0;
                }

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private int countSyllables(String word) {
        String lowerCaseWord = word.toLowerCase();
        int count = 0;
        boolean isPrevVowel = false;

        for (char c : lowerCaseWord.toCharArray()) {
            if ("aeiou".indexOf(c) != -1) {
                if (!isPrevVowel) {
                    count++;
                    isPrevVowel = true;
                }
            } else {
                isPrevVowel = false;
            }
        }

        // Adjust for silent 'e' at the end
        if (lowerCaseWord.endsWith("e") && count > 1) {
            count--;
        }

        return count;
    }
}
