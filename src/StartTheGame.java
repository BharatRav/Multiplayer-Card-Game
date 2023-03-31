public class StartTheGame {

    public StartTheGame() {
        for (int i=0;i<60;i++) {
            System.out.print("*");
        }
        System.out.println();

        for (int i=0;i<18;i++) {
            System.out.print("-");
        }
        System.out.print("WELCOME_TO_THE_CARD_GAME");
        for (int i=0;i<18;i++) {
            System.out.print("-");
        }

        System.out.println();

        for (int i=0;i<60;i++) {
            System.out.print("*");
        }
        System.out.println();
        System.out.println();
    }
    public static void main(String[] args) {
        StartTheGame game = new StartTheGame();
    }
}
