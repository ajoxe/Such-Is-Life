package texteditor;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.BadLocationException;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	//TextEditor textEditor = new TextEditor();
	//textEditor.startProgram();
        //History.command();

        /*SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                //Turn off metal's use of bold fonts
                UIManager.put("swing.boldMetal", Boolean.FALSE);
                new texteditor.TextAreaDemo().setVisible(true);
            }
        });*/
        /*TextDocument nT = new TextDocument("new");
        nT.textArea();*/


            SwingUtilities.invokeLater(new Runnable() {
                public void run() {
                    //Turn off metal's use of bold fonts
                    UIManager.put("swing.boldMetal", Boolean.FALSE);
                    new TextAreaTests().setVisible(true);
                }
            });
        }


}
