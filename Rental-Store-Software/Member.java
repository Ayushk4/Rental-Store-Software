/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bedant
 */

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Member {
    private String name, address;
    private int age;
    private boolean isPremium;
    // private List<Transaction> cd_issued_details = new ArrayList<>();
    // //<transaction id,customer name,cd name,date>
    public int video_cds_issued, music_cds_issued;
    // private int

    public Member(boolean isPremium, String name, int age, String address, int video_cds_issued, int music_cds_issued) {
        this.name = name;
        this.age = age;
        this.isPremium = isPremium; // 1 if premium 0 if normal
        this.address = address;
        this.video_cds_issued = video_cds_issued;
        this.music_cds_issued = music_cds_issued;
    }

    public Member(boolean isPremium, String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.isPremium = isPremium; // 1 if premium 0 if normal
        this.address = address;
        this.video_cds_issued = 0;
        this.music_cds_issued = 0;
    }

    public String issueItem(Item cd) {
        String ret;
        String cd_name = cd.getItemName();
        if ((video_cds_issued < 2 && cd.getItemFormat().equals("music") == false)
                || (music_cds_issued < 1 && cd.getItemFormat().equals("music") == true) || isPremium == true) {
            Transaction tr = new Transaction(name, cd_name);
            // store this transaction in database table
            // store in pl acc
            if (cd.getItemFormat().equals("music") == true)
                music_cds_issued += 1;
            if (cd.getItemFormat().equals("music") == false)
                video_cds_issued += 1;
            Records.records.add(tr);
            // cd_issued_details.add(tr);
            // change status in inventory
            ret = "Success";
        } else {
            ret = "fail";
        }
        return ret;
    }

    int calculateDuration(Date d1, Date d2) {
        LocalDate localDate = d1.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        int year1 = localDate.getYear();
        int month1 = localDate.getMonthValue();
        int day1 = localDate.getDayOfMonth();

        localDate = d2.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        int year2 = localDate.getYear();
        int month2 = localDate.getMonthValue();
        int day2 = localDate.getDayOfMonth();
        int ans = (year2 - year1) * 365 + (month2 - month1) * 30 + day2 - day1;
        if (ans < 0)
            return -1 * ans;
        return ans;
    }

    public String returnCD(Item cd) {
        String cd_name = cd.getItemName();
        for (int i = 0; i < Records.records.size(); i++) {
            Transaction temp_tr = Records.records.get(i);
            if (temp_tr.getCd_Name().equals(cd_name) == true) {
                Date curr_date = new Date();
                int amount = calculateDuration(curr_date, temp_tr.getDate()) * cd.getRentalPrice();
                // Display amount
                Records.records.remove(i);
                PlTransaction profit_tr;
                // change status in inventory
                profit_tr = new PlTransaction("Rent Collected", amount);
                Account.plAccount.add(profit_tr);
                break;
            }
        }
        return "Sucess";
    }

    public String itemLost(Item cd) {
        String cd_name = cd.getItemName();
        for (int i = 0; i < Records.records.size(); i++) {
            Transaction temp_tr = Records.records.get(i);
            if (temp_tr.getCd_Name().equals(cd_name) == true) {
                int amount = cd.getCostPrice();
                Records.records.remove(i);
                PlTransaction profit_tr;
                // change status in inventory
                profit_tr = new PlTransaction("Fine Collected", amount);
                Account.plAccount.add(profit_tr);
                break;
            }
        }
        return "sucess";
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getAge() {
        return age;
    }

    public Boolean getIsPremium() {
        return isPremium;
    }

    public int getMusic() {
        return music_cds_issued;
    }

    public int getVideo() {
        return video_cds_issued;
    }

    // public M
}
