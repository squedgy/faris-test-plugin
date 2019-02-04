package com.squedgy.test.gradle.plugin;

import javax.swing.JOptionPane;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Testy {

    @Test
    public void doesOutput() {
        System.out.println("You should see this message without qualifiers");
        assertEquals(
            0,
            JOptionPane.showConfirmDialog(
                null,
                "Did you see the message in console?"
            )
        );
    }
}
