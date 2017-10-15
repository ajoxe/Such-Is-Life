package texteditor;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.event.ActionEvent;
import javax.swing.text.BadLocationException;
import javax.swing.GroupLayout.*;


public class TextAreaTests extends JFrame implements DocumentListener {

    private JLabel jLabel1;
    private JScrollPane jScrollPane1;
    private JTextArea textArea;

    public TextAreaTests() {
        super("TextAreaDemo");

        initComponents();

        textArea.getDocument().addDocumentListener(this);
/*
        InputMap im = textArea.getInputMap();
        ActionMap am = textArea.getActionMap();*/
        /*im.put(KeyStroke.getKeyStroke("ENTER"), COMMIT_ACTION);
        am.put(COMMIT_ACTION, new CommitAction());

        words = new ArrayList<String>(5);
        words.add("spark");
        words.add("special");
        words.add("spectacles");
        words.add("spectacular");
        words.add("swing");*/
    }

    private void initComponents() {
        jLabel1 = new JLabel("Enter your text here");
        textArea = new JTextArea();
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        JScrollPane areaScrollPane = new JScrollPane(textArea);
        areaScrollPane.setVerticalScrollBarPolicy(
                JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        //areaScrollPane.setPreferredSize(new Dimension(800, 600));
        textArea.setFont(new Font("Serif", Font.ITALIC, 16));
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        String input = textArea.getText();
        textArea.setMinimumSize(new Dimension(800, 800));






        //jScrollPane1 = new JScrollPane(textArea);

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);

        //Create a parallel group for the horizontal axis
        ParallelGroup hGroup = layout.createParallelGroup(GroupLayout.Alignment.LEADING);
        //Create a sequential and a parallel groups
        SequentialGroup h1 = layout.createSequentialGroup();
        ParallelGroup h2 = layout.createParallelGroup(GroupLayout.Alignment.TRAILING);
        //Add a scroll panel and a label to the parallel group h2
        h2.addComponent(areaScrollPane, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE);
        h2.addComponent(jLabel1, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE);

        //Add a container gap to the sequential group h1
        h1.addContainerGap();
        // Add the group h2 to the group h1
        h1.addGroup(h2);
        h1.addContainerGap();
        //Add the group h1 to hGroup
        hGroup.addGroup(Alignment.TRAILING,h1);
        //Create the horizontal group
        layout.setHorizontalGroup(hGroup);

        //Create a parallel group for the vertical axis
        ParallelGroup vGroup = layout.createParallelGroup(GroupLayout.Alignment.LEADING);
        //Create a sequential group
        SequentialGroup v1 = layout.createSequentialGroup();
        //Add a container gap to the sequential group v1
        v1.addContainerGap();
        //Add a label to the sequential group v1
        v1.addComponent(jLabel1);
        v1.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED);
        //Add scroll panel to the sequential group v1
        v1.addComponent(areaScrollPane, GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE);
        v1.addContainerGap();
        //Add the group v1 to vGroup
        vGroup.addGroup(v1);
        //Create the vertical group
        layout.setVerticalGroup(vGroup);
        pack();

    }

    /**
     * Gives notification that there was an insert into the document.  The
     * range given by the DocumentEvent bounds the freshly inserted region.
     *
     * @param e the document event
     */
    @Override
    public void insertUpdate(DocumentEvent e) {

    }

    /**
     * Gives notification that a portion of the document has been
     * removed.  The range is given in terms of what the view last
     * saw (that is, before updating sticky positions).
     *
     * @param e the document event
     */
    @Override
    public void removeUpdate(DocumentEvent e) {

    }

    /**
     * Gives notification that an attribute or set of attributes changed.
     *
     * @param e the document event
     */
    @Override
    public void changedUpdate(DocumentEvent e) {

    }
}
