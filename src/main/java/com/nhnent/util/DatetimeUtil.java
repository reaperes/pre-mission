package com.nhnent.util;

import org.springframework.util.Assert;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DatetimeUtil {

    private static final Pattern beautifyPattern = Pattern.compile(
            ".*[Jan|Feb|Mar|Apr|May|Jun|Jul|Aug|Sep|Oct|Nov|Dec]\\s(.*)\\sKST.*"
    );

    private static final Map<String, String> monthMap = new HashMap<>();

    static {
        monthMap.put("Jan", "January");
        monthMap.put("Feb", "February");
        monthMap.put("Mar", "March");
        monthMap.put("Apr", "April");
        monthMap.put("May", "May");
        monthMap.put("Jun", "June");
        monthMap.put("Jul", "July");
        monthMap.put("Aug", "August");
        monthMap.put("Sep", "September");
        monthMap.put("Oct", "October");
        monthMap.put("Nov", "November");
        monthMap.put("Dec", "December");
    }

    /**
     * Beautify mysql datetime
     * @param datetime datetime format ex. Wed Dec 24 10:59:26 KST 2014
     * @return ex. December 24, 10:59:26
     */
    public static String beautify(String datetime) {
        String[] result = datetime.split("\\s");
        String month = monthMap.get(result[1]);

        Matcher matcher = beautifyPattern.matcher(datetime);
        Assert.isTrue(matcher.matches());
        return month + " " + matcher.group(1);
    }
}
