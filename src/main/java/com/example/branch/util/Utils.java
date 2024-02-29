package com.example.branch.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Utils {
    /**
     * Converts 2011-01-25T18:44:36Z -> 2011-01-25 18:44:36
     * @param originalFormat - original format
     * @return Date time format in "yyyy-MM-dd HH:mm:ss"
     */
    public static String dateFormatter(String originalFormat) {
        return LocalDateTime.parse(originalFormat, DateTimeFormatter.ISO_DATE_TIME).format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    }
}
