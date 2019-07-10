import javax.swing.*;
import java.sql.*;
import java.util.Date;

import java.awt.*;
import java.awt.event.*;

public class Main {

    public static void main(String[] args) {
        // Loads password & Loads from Database

        // Threads for Updating database & time to time check for remove items after
        // year goes to `swingWindows`-> Constructor Function

        Rentalstore rstore = new Rentalstore();
        Connection con = rstore.makeConnection();
        try {
            rstore.createTables(con);
        } catch (Exception e) {
            System.out.println("not created");
        }
        Inventory obj = new Inventory();

        try {
            rstore.populateLists(con, obj);
            // System.out.println("try");
        } catch (Exception e) {
            System.out.println("exc");
        }

        for (int i = 0; i < Account.plAccount.size(); i++)
            System.out.println(Account.plAccount.get(i).getActivity());

        // Member m1 = new Member(true, "Bedu", 21, "fdse");
        // MemberList.memberList.add(m1);
        // m1 = new Member(true, "vedant", 21, "fdse");
        // MemberList.memberList.add(m1);
        // m1 = new Member(true, "Beant", 21, "fdse");
        // MemberList.memberList.add(m1);

        // Password p1 = new Password();
        // Inventory inv = new Inventory();

        // swingWindows frame = new swingWindows(p1, inv);

    }
}