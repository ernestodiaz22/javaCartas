import cardsCollections.*;

public class Main {
    public static void main(String[] args) {
        final String ANSI_RESET = "\u001B[0m";
        final String ANSI_BLACK = "\u001B[30m";
        final String ANSI_RED = "\u001B[31m";
        final String ANSI_GREEN = "\u001B[32m";
        final String ANSI_YELLOW = "\u001B[33m";
        final String ANSI_BLUE = "\u001B[34m";
        final String ANSI_PURPLE = "\u001B[35m";
        final String ANSI_CYAN = "\u001B[36m";
        final String ANSI_WHITE = "\u001B[37m";

        System.out.println(ANSI_RED + "This text is RED" + ANSI_RESET);
        System.out.println(ANSI_GREEN + "This text is GREEN" + ANSI_RESET);
        System.out.println(ANSI_BLUE + "This text is BLUE" + ANSI_RESET);
        System.out.println(ANSI_YELLOW + "This text is YELLOW" + ANSI_RESET);

        System.out.println("\u2663 This should be a Clubs suit symbol.");
        System.out.println("\u2665 This should be a Hearts suit symbol.");
        System.out.println("\u2666 This should be a Diamonds suit symbol.");
        System.out.println("\u2660 This should be a Spades suit symbol.");

        ClassCard naipe1 = new ClassCard(Suit.DIAMONDS,CardRank.valueOf("TWO"));
        ClassCard naipe2 = new ClassCard(Suit.HEARTS,CardRank.valueOf("Q"));
        ClassCard naipe3= new ClassCard(Suit.CLUBS,CardRank.valueOf("THREE"));
        ClassCard naipe4 = new ClassCard(Suit.SPADES,CardRank.valueOf("J"));


        System.out.println(naipe1.toString() + "\n" + naipe2.toString() + "\n" + naipe3.toString() + "\n" + naipe4.toString());
    }

}