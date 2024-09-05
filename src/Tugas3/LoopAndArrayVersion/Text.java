package Tugas3.LoopAndArrayVersion;

public class Text {
    String Text;
    // Array
    String[] Bingo = new String[5];

    // Constructor
    public Text() {
        Text = "(clap)";
        Bingo[0] = "B";
        Bingo[1] = "I";
        Bingo[2] = "N";
        Bingo[3] = "G";
        Bingo[4] = "O";
    }

    // Method untuk menampilkan bingo
    public void getBingo() {
        for (int i = 0; i < 6; i++) {
            System.out.println("There was a farmer who had a dog,");
            System.out.println("And Bingo was his name-o.");
            for (int y = 0; y < 5; y++) {
                for (int j = 0; j < 5; j++) {
                    System.out.print(Bingo[j]+"  ");
                }
                System.out.println();
            }
            System.out.println("And Bingo was his name-o.");
            System.out.println();
            Bingo[i] = Text;
        }
    }

}
