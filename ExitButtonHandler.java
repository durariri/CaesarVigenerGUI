package Button;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

 public class ExitButtonHandler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            System.exit(0);//allows the exit button to close the JFrame window
        }
    }// End of EXIT BUTTON actionPerformed

