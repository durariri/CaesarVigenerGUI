package Button;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Cipher extends JFrame {
    public static JTextField inputKeyTF;
    public static JTextArea outputTA, inputTA;
    public static JLabel file;
    static final int WIDTH = 1035;
    static final int HEIGHT = 600;
    static StringBuilder sentenceFromFile = new StringBuilder();
    public Cipher() {
        //Create borders
        Border loweredBevel, blackLine, compound;
        blackLine = BorderFactory.createLineBorder(Color.black);
        loweredBevel = BorderFactory.createLoweredBevelBorder();
        compound = BorderFactory.createCompoundBorder(loweredBevel, blackLine);
        //Create Fonts
        Font font =  new Font("Courier New", Font.BOLD, 30);
        Font font2 = new Font("Arial", Font.BOLD, 30);
        // Create labels
        JLabel headingL = new JLabel("Enter your text below and a shift key," +
                " then click Encrypt or Decrypt", SwingConstants.CENTER);
        JLabel encryptKeyL = new JLabel("Enter your key:");

        file = new  JLabel("");
        inputTA = new  JTextArea("",50,895);

        inputTA.setFont(font);
        JScrollPane scrollText2 = new JScrollPane(inputTA);//adds the scroll feature to the outputTA
        scrollText2.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        inputTA.setLineWrap(true);
        inputTA.setWrapStyleWord(true);

        inputKeyTF = new JTextField(3);
        inputKeyTF.setFont(font);

        outputTA = new JTextArea("",50,895);
        outputTA.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        outputTA.setFont(font);

        JScrollPane scrollText = new JScrollPane(outputTA);//adds the scroll feature to the outputTA
        scrollText.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        outputTA.setLineWrap(true);
        outputTA.setWrapStyleWord(false);
        outputTA.setEditable(false);

        JButton encryptB = new JButton("Encrypt");
        EncryptButtonHandler encrbHandler = new EncryptButtonHandler();
        encryptB.addActionListener(encrbHandler);
        encryptB.setFont(font2);

        JButton decryptB = new JButton("Decrypt");
        DecryptButtonHandler decryptHandler = new DecryptButtonHandler();
        decryptB.addActionListener(decryptHandler);
        decryptB.setFont(font2);

        JButton openFile = new JButton("Open file");
        FileButtonHandler fileHandler = new FileButtonHandler();
        openFile.addActionListener(fileHandler);
        openFile.setFont(font2);

        JLabel fileNAme = new JLabel("open file:");

        JButton exitB = new JButton("EXIT");
        ExitButtonHandler ebHandler = new ExitButtonHandler();
        exitB.addActionListener(ebHandler);
        exitB.setFont(font2);

        JButton clearB = new JButton("Clear All");
        ClearButtonHandler clbHandler = new ClearButtonHandler();
        clearB.addActionListener(clbHandler);
        clearB.setFont(font2);

        setTitle("The Caesar Button.Cipher");
        // Set the title by calling the parent class, JFrame

        Container myWindow = getContentPane();
        myWindow.setLayout(null);

        decryptB.setLocation(590, 232);
        encryptB.setLocation(380, 232);
        openFile.setLocation(800,232);
        exitB.setLocation(525, 503);
        clearB.setLocation(250, 503);

        scrollText2.setLocation(5,52);
        inputKeyTF.setLocation(250,233);
        scrollText.setLocation(5,323);

        decryptB.setSize(200,40);
        encryptB.setSize(200,40);
        openFile.setSize(200,40);
        exitB.setSize(225, 40);
        clearB.setSize(225, 40);

        headingL.setSize(1010,40);
        headingL.setLocation(5,5);
        headingL.setFont(font2);
        fileNAme.setSize(200, 40);
        fileNAme.setLocation(20, 283);
        fileNAme.setFont(font2);
        file.setFont(font);
        encryptKeyL.setSize(430,40);
        encryptKeyL.setLocation(20,233);
        encryptKeyL.setFont(font2);

        scrollText2.setSize(1010,180);
        inputKeyTF.setSize(120,40);
        scrollText.setSize(1010,180);
        scrollText.setBorder(compound);
        scrollText2.setBorder(compound);

        myWindow.add(decryptB);
        myWindow.add(encryptB);
        myWindow.add(exitB);
        myWindow.add(clearB);
        myWindow.add(headingL);
        myWindow.add(encryptKeyL);
        myWindow.add(scrollText2);
        myWindow.add(inputKeyTF);
        myWindow.add(scrollText);
        myWindow.add(openFile);
        myWindow.add(fileNAme);
        myWindow.add(file);

        setSize(WIDTH, HEIGHT);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        Cipher cipherObject = new Cipher();
        cipherObject.setLocationRelativeTo(null);
    }
}