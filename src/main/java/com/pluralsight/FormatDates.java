package com.pluralsight;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class FormatDates {
    public static void main(String[] args) {

        LocalDateTime today = LocalDateTime.now();

        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        DateTimeFormatter format2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter format3 = DateTimeFormatter.ofPattern("EEEE, MMMM d, yyyy");
        DateTimeFormatter format4 = DateTimeFormatter.ofPattern("EEEE, MMM d, yyyy HH:mm");

        System.out.println(today.format(format1));
        System.out.println(today.format(format2));
        System.out.println(today.format(format3));
        System.out.println(today.format(format4));
    }
}
