package org.example.util.buttons;

import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;

import java.util.ArrayList;
import java.util.List;

public class InlineKeyboardsStorage {
    public static InlineKeyboardMarkup getApproveRegisterKeyboard() {
        List<List<InlineKeyboardButton>> keyboard = new ArrayList<>();

        List<InlineKeyboardButton> row = null;
        InlineKeyboardButton button = null;

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText(InlineButtonsStorage.ApproveRegister.getTitle());
        button.setCallbackData(InlineButtonsStorage.ApproveRegister.getCallBackData());
        row.add(button);
        keyboard.add(row);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText(InlineButtonsStorage.DisapproveRegister.getTitle());
        button.setCallbackData(InlineButtonsStorage.DisapproveRegister.getCallBackData());
        row.add(button);
        keyboard.add(row);

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        inlineKeyboardMarkup.setKeyboard(keyboard);

        return inlineKeyboardMarkup;
    }
}
