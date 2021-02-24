package com.pavsevaibhav.notedown.service.utils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class TimeStamp {

    public static String getTimeStamp() {
        SimpleDateFormat dateTime = new SimpleDateFormat("EEEE, dd MMMM yyyy hh:mm a", Locale.getDefault());
        return dateTime.format(new Date());
    }
}
