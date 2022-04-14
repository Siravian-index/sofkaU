package account.types;

public class Id {
    String id;

    public Id() {
        this.id = generateRandomCharacters() + generateRandomNumber();
    }
    private String generateRandomNumber() {
        int random = (int) (Math.random() * 1000000000);
        return random + "";
    }

    private String generateRandomCharacters() {
        final int NUMBER_OF_CHARS = 3;
        String abc = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < NUMBER_OF_CHARS; i++) {
            int charIndex = (int) (Math.random() * abc.length());
            stringBuilder.append(abc.charAt(charIndex));
        }
        return stringBuilder.toString();
    }
}
