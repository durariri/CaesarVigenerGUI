package Button;

import Button.CipherMetods.Caesar;
import Button.CipherMetods.Vigener;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static Button.CipherMetods.Caesar.key;
import static Button.CipherMetods.Caesar.sentence;
import static Button.CipherMetods.Vigener.keyVigener;
import static Button.CipherMetods.Vigener.text;
import static Button.Cipher.*;


public class DecryptButtonHandler implements ActionListener {
    public  void actionPerformed(ActionEvent e) {

        sentence = inputTA.getText();

        if (sentence.isEmpty()) {
            sentence = sentenceFromFile.toString();
        }

        try {
            keyVigener = inputKeyTF.getText();
            keyVigener = keyVigener.toLowerCase();
            keyVigener = keyVigener.replaceAll("[^a-zA-Z]+","");
            key = keyVigener.length();

            outputTA.setForeground(Color.blue);
            outputTA.setText("");

            Caesar.decrypt();
            text = sentence;
            Vigener.decrypt();
            outputTA.append(text); //Decrypted Output

        }
        catch (Exception h) {
            outputTA.setForeground(Color.red);
            outputTA.setText("Please enter a number between -25 and 25.");
            inputKeyTF.requestFocusInWindow();
        }
        sentenceFromFile.delete(0, sentenceFromFile.length());
    }
}