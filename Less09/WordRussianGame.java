package org.example.game;

import java.util.ArrayList;
import java.util.List;

public class WordRussianGame extends AbstractGame {
    @Override
    List<String> generateCharList() {
        List<String> charList = new ArrayList<String>();
        String sStr = "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ";
        for (int i = 0; i < sStr.length(); ++i) { // строка - русский алфавит 33 буквы
            charList.add(Character.toString(sStr.charAt(i)));
        }
        return charList;
    }
}
