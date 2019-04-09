import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class Main {

    public static void main(String[] args) {
        // Loads password & Loads from Database

        // Threads for Updating database & time to time check for remove items after
        // year goes to `swingWindows`-> Constructor Function
        Member m1 = new Member(true, "Bedu", 21, "fdse");
        MemberList.memberList.add(m1);
        m1 = new Member(true, "vedant", 21, "fdse");
        MemberList.memberList.add(m1);
        m1 = new Member(true, "Beant", 21, "fdse");
        MemberList.memberList.add(m1);
        
        password p1 = new password();
        Inventory inv = new Inventory();

        swingWindows frame = new swingWindows(p1, inv);

    }
}