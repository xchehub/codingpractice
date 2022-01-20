package com.joeho;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

/**
 * Demonstrate how to convert Date to LocalDateTime class in
 * The equivalent class of Date in new Date and Time API is not LocalDateTime but the Instant.
 *
 * Ref. https://www.java67.com/2016/03/how-to-convert-date-to-localdatetime-in-java8-example.html#ixzz7IUJsDYnF
 */
public class Main {

    public static void main(String[] args) {
	// write your code here
        Date now = new Date();
        Instant current = now.toInstant();
        LocalDateTime ldt = LocalDateTime.ofInstant(current, ZoneId.systemDefault());

        System.out.println("value of Date: " + now);
        System.out.println("value of LocalDateTime: " + ldt);

        ZonedDateTime zdt = ldt.atZone(ZoneId.systemDefault());
        Date output = Date.from(zdt.toInstant());

        System.out.println("value of LocalDateTime: " + ldt);
        System.out.println("value of Date: " + output);
    }
}
