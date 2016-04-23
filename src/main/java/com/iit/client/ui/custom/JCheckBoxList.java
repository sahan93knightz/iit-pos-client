/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iit.client.ui.custom;

import java.awt.Color;
import java.awt.GridLayout;
import java.util.Vector;
import javax.swing.BorderFactory;
import javax.swing.JCheckBox;
import javax.swing.JScrollPane;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author Sahan Ranasinghe
 */
public final class JCheckBoxList extends javax.swing.JPanel {

    private final Vector<JCheckBox> chkBx = new Vector();

    public JCheckBoxList(final Vector displays, Vector values, JScrollPane parent) {
        addItem(displays, values);
        setBorder(new EmptyBorder(0, 5, 0, 0));
        parent.getVerticalScrollBar().setUnitIncrement(15);
        parent.setViewportView(this);
    }

    public int getItemCount() {
        return chkBx.size();
    }

    public JCheckBox getItemAt(int i) {
        if (chkBx.size() - 1 > i) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return chkBx.get(i);
    }

    public void addItem(String display, String value) {
        if (display == null || value == null) {
            throw new NullPointerException();
        }
        Vector v = new Vector();
        Vector v1 = new Vector();
        v.add(display);
        v.add(value);
        addItem(v, v1);
    }

    public void addItem(Vector displays, Vector value) {
        if (displays.size() != value.size()) {
            throw new IllegalArgumentException("displays count != values count");
        }
        setLayout(new GridLayout(chkBx.size() + displays.size(), 1));
        Border border1 = BorderFactory.createLineBorder(Color.gray);
        for (int i = 0; i < displays.size(); i++) {
            JCheckBox cb = new JCheckBox(displays.get(i).toString());
            cb.setName(value.get(i).toString());
            cb.setBorder(border1);
            cb.setBorderPainted(true);
            add(cb);
            chkBx.add(cb);
        }
    }

    public Vector getSelectedValues() {
        Vector v = new Vector();
        for (int i = 0; i < chkBx.size(); i++) {
            JCheckBox cb = chkBx.get(i);
            if (cb.isSelected()) {
                v.add(cb.getName());
            }
        }
        return v;
    }

    public void setSelectedCheckBoxes(Vector idList) {
//        for (int i = 0; i < idList.size(); i++) {
//            String id = idList.get(i).toString();
//            for (int j = 0; j < getComponentCount(); j++) {
//                if (getComponent(j) instanceof JCheckBox) {
//                    JCheckBox cb = (JCheckBox) getComponent(j);
//                    if (cb.getName().equals(id)) {
//                        cb.setSelected(true);
//                    }
//                }
//            }
//        }
        deselectAll();
        for (int i = 0; i < getComponentCount(); i++) {
            if (getComponent(i) instanceof JCheckBox) {
                JCheckBox cb = (JCheckBox) getComponent(i);
                for (int j = 0; j < idList.size(); j++) {
                    if (cb.getName().equals(idList.get(j))) {
                        cb.setSelected(true);
                        break;
                    }
                }
            }
        }
    }

    public void reset() {
        for (int i = 0; i < getComponentCount(); i++) {
            if (getComponent(i) instanceof JCheckBox) {
                ((JCheckBox) getComponent(i)).setSelected(false);
            }
        }
    }

    public void setAllEnabled(boolean b) {
        Object[] o = getComponents();
        for (Object object : o) {
            if (object instanceof JCheckBox) {
                ((JCheckBox) object).setEnabled(b);
            }
        }
    }
    
    public void deselectAll() {
        Object[] o = getComponents();
        for (Object object : o) {
            if (object instanceof JCheckBox) {
                ((JCheckBox) object).setSelected(false);
            }
        }
    }
}
