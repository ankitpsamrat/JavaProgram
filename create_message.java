import java.awt.*;

public class create_message {
    Frame f; // Creates object of Frame and Label
    Label lb1, lb2, lb3, lb4;

    create_message() {
        f = new Frame("AWT message");
        lb1 = new Label("Hi !");
        lb2 = new Label("Dear");
        lb3 = new Label("Have a great day, Take care !");
        lb4 = new Label("Thanks");
        lb4.setText("Thank you and love you !"); // Setting text on the Labels
        f.add(lb1); // Add Labels on the Frame
        f.add(lb2);
        f.add(lb3);
        f.add(lb4);
        f.setLayout(new FlowLayout()); // Set properties of the Frame
        f.setSize(260, 220);
        f.setVisible(true);
    }

    public static void main(String[] ar) {
        new create_message();
    }
}
