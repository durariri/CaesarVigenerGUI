package Button;

import Button.CipherMetods.Caesar;
import Button.CipherMetods.Vigener;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static Button.CipherMetods.Caesar.*;
import static Button.CipherMetods.Vigener.*;
import static Button.Cipher.*;


    public class EncryptButtonHandler implements ActionListener {//start encrypt button class
        public  void actionPerformed(ActionEvent e) {
            sentence = inputTA.getText();
            if (sentence.isEmpty()) {
                sentence = sentenceFromFile.toString();
            }
            sentence = sentence.replaceAll("[^a-zA-Z ]+","");// removes all special characters

            try {
                keyVigener = inputKeyTF.getText();
                keyVigener = keyVigener.toLowerCase();
                keyVigener = keyVigener.replaceAll("[^a-zA-Z]+","");
                key = keyVigener.length();

                Caesar.encrypt();
                text = sentence;
                Vigener.encrypt();
                outputTA.append(text);
            }
            catch (Exception h) {
                outputTA.setForeground(Color.red);
                outputTA.setText("Please enter a number between -25 and 25.");
                inputKeyTF.requestFocusInWindow();
            }
            sentenceFromFile.delete(0, sentenceFromFile.length());
        }
    }

