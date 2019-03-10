package com.services;

import com.Constants;
import com.google.gson.Gson;
import com.models.Day;
import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Calendar;

public class MessageAnswerService {
    public static String getAnswer(String message) throws IOException {
        Day day;

        switch (message) {
            case (Constants.MONDAY):
                day = getDay(Constants.MONDAY);
                return day.getAnswerDayForm();

            case (Constants.TUESDAY):
                day = getDay(Constants.TUESDAY);
                return day.getAnswerDayForm();

            case (Constants.WEDNESDAY):
                day = getDay(Constants.WEDNESDAY);
                return day.getAnswerDayForm();

            case (Constants.THURSDAY):
                day = getDay(Constants.THURSDAY);
                return day.getAnswerDayForm();

            case (Constants.FRIDAY):
                day = getDay(Constants.FRIDAY);
                return day.getAnswerDayForm();

            case (Constants.WEEK):
                return getWeek();

            case (Constants.NOW_DAY):
                return getNowDay();
        }
        return null;
    }

    private static Day getDay(String day) throws IOException {
        String answer = null;
        Gson gson = new Gson();
        InputStream resourceAsStream = MessageAnswerService.class
                .getClassLoader().getResourceAsStream(day + ".json");
        String schedule = IOUtils.toString(resourceAsStream, answer);
        return gson.fromJson(schedule, Day.class);
    }

    private static String getWeek() throws IOException {
        String answer = "";
        Day day;

        answer = answer
                + "\n--------------------------\n"
                + Constants.MONDAY +
                "\n--------------------------\n";
        day = getDay(Constants.MONDAY);
        answer = answer + day.getAnswerDayForm();

        answer = answer
                + "\n--------------------------\n"
                + Constants.TUESDAY +
                "\n--------------------------\n";
        day = getDay(Constants.TUESDAY);
        answer = answer + day.getAnswerDayForm();

        answer = answer
                + "\n--------------------------\n"
                + Constants.WEDNESDAY +
                "\n--------------------------\n";
        day = getDay(Constants.WEDNESDAY);
        answer = answer + day.getAnswerDayForm();

        answer = answer
                + "\n--------------------------\n"
                + Constants.THURSDAY +
                "\n--------------------------\n";
        day = getDay(Constants.THURSDAY);
        answer = answer + day.getAnswerDayForm();

        answer = answer
                + "\n--------------------------\n"
                + Constants.FRIDAY +
                "\n--------------------------\n";
        day = getDay(Constants.FRIDAY);
        answer = answer + day.getAnswerDayForm();

        return answer;
    }

    private static String getNowDay() throws IOException {
        Calendar calendar = Calendar.getInstance();
        int i = calendar.get(Calendar.DAY_OF_WEEK);
        Day day;

        switch (i) {
            case (2):
                day = getDay(Constants.MONDAY);
                return day.getAnswerDayForm();
            case (3):
                day = getDay(Constants.TUESDAY);
                return day.getAnswerDayForm();
            case (4):
                day = getDay(Constants.WEDNESDAY);
                return day.getAnswerDayForm();
            case (5):
                day = getDay(Constants.THURSDAY);
                return day.getAnswerDayForm();
            case (6):
                day = getDay(Constants.FRIDAY);
                return day.getAnswerDayForm();
            default:
                return Constants.FREE;
        }
    }
}
