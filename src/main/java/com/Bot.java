package com;

import com.services.MessageAnswerService;
import org.telegram.telegrambots.api.methods.send.SendMessage;
import org.telegram.telegrambots.api.objects.Update;
import org.telegram.telegrambots.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.api.objects.replykeyboard.buttons.KeyboardRow;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.exceptions.TelegramApiException;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Bot extends TelegramLongPollingBot {
    public static final String BotToken = "644635978:AAG3d0K23ICLxI8am9n18sKWgLzFXugu7KA";
    public static final String BotUserName = "ONPUScheduleBot";

    public void onUpdateReceived(Update update) {
        String message = update.getMessage().getText();
        String answer = null;
        try {
            answer = MessageAnswerService.getAnswer(message);
        } catch (IOException e) {
            sendMsg(update.getMessage().getChatId().toString(), message);
        }

        if("/start".equals(message)){
            sendMsg(update.getMessage().getChatId().toString(), "HI!");
        }

        sendMsg(update.getMessage().getChatId().toString(), answer);
    }

    public String getBotUsername() {
        return BotUserName;
    }

    public String getBotToken() {
        return BotToken;
    }

    public synchronized void sendMsg(String chatId, String s) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.enableMarkdown(true);
        sendMessage.setChatId(chatId);
        sendMessage.setText(s);
        setButtons(sendMessage);

        try {
            sendMessage(sendMessage);
        } catch (TelegramApiException e) {
        }
    }

    public synchronized void setButtons(SendMessage sendMessage) {
        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        replyKeyboardMarkup.setSelective(true);
        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setOneTimeKeyboard(false);

        List<KeyboardRow> keyboard = new ArrayList<>();

        KeyboardRow keyboardFirstRow = new KeyboardRow();
        keyboardFirstRow.add(new KeyboardButton(Constants.NOW_DAY));
//        keyboardFirstRow.add(new KeyboardButton(Constants.NOW_LESSON));
        keyboard.add(keyboardFirstRow);

        List<String> rowsContent = Arrays.asList(
                Constants.MONDAY, Constants.TUESDAY,
                Constants.WEDNESDAY, Constants.THURSDAY,
                Constants.FRIDAY, Constants.WEEK
        );

        for (String row : rowsContent) {
            KeyboardRow keyboardRow = new KeyboardRow();
            keyboardRow.add(new KeyboardButton(row));
            keyboard.add(keyboardRow);
        }

        replyKeyboardMarkup.setKeyboard(keyboard);
    }
}
