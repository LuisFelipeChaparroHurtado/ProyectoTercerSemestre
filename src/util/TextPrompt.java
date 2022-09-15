/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.text.*;

public class TextPrompt extends JLabel implements FocusListener, DocumentListener {

    private static final long serialVersionUID = 1L;

    public enum Mirart {
        ALWAYS, FOCUS_GAINED, FOCUS_LOST;
    }

    private JTextComponent component;
    private Document document;

    private Mirart show;
    private boolean showPromptOnce;
    private int focusLost;

    public TextPrompt(String text, JTextComponent component) {
        this(text, component, Mirart.ALWAYS);
    }

    public TextPrompt(String text, JTextComponent component, Mirart show) {
        this.component = component;
        setShow(show);
        document = component.getDocument();

        setText(text);
        setFont(component.getFont());

        setForeground(Color.gray);

        setHorizontalAlignment(JLabel.LEADING);

        component.addFocusListener(this);
        document.addDocumentListener(this);

        component.setLayout(new BorderLayout());
        component.add(this);
        checkForPrompt();
    }

    public void changeAlpha(float alpha) {
        changeAlpha((int) (alpha * 255));
    }

    public void changeAlpha(int alpha) {
        alpha = alpha > 255 ? 255 : alpha < 0 ? 0 : alpha;

        Color foreground = getForeground();
        int red = foreground.getRed();
        int green = foreground.getGreen();
        int blue = foreground.getBlue();

        Color withAlpha = new Color(red, green, blue, alpha);
        super.setForeground(withAlpha);
    }

    public void changeStyle(int style) {
        setFont(getFont().deriveFont(style));
    }

    public Mirart getShow() {
        return show;
    }

    public void setShow(Mirart show) {
        this.show = show;
    }

    public boolean getShowPromptOnce() {
        return showPromptOnce;
    }

    public void setShowPromptOnce(boolean showPromptOnce) {
        this.showPromptOnce = showPromptOnce;
    }

    private void checkForPrompt() {

        if (document.getLength() > 0) {
            setVisible(false);
            return;
        }

        if (showPromptOnce && focusLost > 0) {
            setVisible(false);
            return;
        }

        if (component.hasFocus()) {
            if (show == Mirart.ALWAYS || show == Mirart.FOCUS_GAINED) {
                setVisible(true);
            } else {
                setVisible(false);
            }
        } else {
            if (show == Mirart.ALWAYS || show == Mirart.FOCUS_LOST) {
                setVisible(true);
            } else {
                setVisible(false);
            }
        }
    }

    public void focusGained(FocusEvent e) {
        checkForPrompt();
    }

    public void focusLost(FocusEvent e) {
        focusLost++;
        checkForPrompt();
    }

    public void insertUpdate(DocumentEvent e) {
        checkForPrompt();
    }

    public void removeUpdate(DocumentEvent e) {
        checkForPrompt();
    }

    public void changedUpdate(DocumentEvent e) {
    }
}
