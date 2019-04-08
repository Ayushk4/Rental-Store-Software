import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class Main {

    public static void main(String[] args) {
        // Loads password & Loads from Database

        // Threads for Updating database & time to time check for remove items after
        // year goes to `swingWindows`

        password p1 = new password();
        swingWindows frame = new swingWindows(p1);
    }
}