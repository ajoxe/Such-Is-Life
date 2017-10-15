package texteditor;


import javax.swing.*;
import java.awt.*;
import javax.swing.GroupLayout.*;

public class TextDocument{
    private String text;


    public TextDocument(String text){
        this.text = text;

    }

    public String getText() {
        return text;
    }
    public void textArea(){


        /*JTextArea textArea = new JTextArea(
                "This is an editable JTextArea. " +
                        "A text area is a \"plain\" text component, " +
                        "which means that although it can display text " +
                        "in any font, all of the text is in the same font.");

        JScrollPane areaScrollPane = new JScrollPane(textArea);
        areaScrollPane.setVerticalScrollBarPolicy(
                JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        areaScrollPane.setPreferredSize(new Dimension(250, 250));
        textArea.setFont(new Font("Serif", Font.ITALIC, 16));
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setVisible(true);

        String input = textArea.getText();*/
    }




}
