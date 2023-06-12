package Button;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static Button.Cipher.*;


public  class ClearButtonHandler implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        inputTA.setText("");
        outputTA.setText("");

        inputKeyTF.setText("");
        file.setText("");
        inputTA.requestFocusInWindow();
    }
}
