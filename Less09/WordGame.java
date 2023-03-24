package org.example.game;

import java.util.ArrayList;
import java.util.List;

public class WordGame extends AbstractGame {
    @Override
    List<String> generateCharList() {
        List<String> charList = new ArrayList<String>();
        for (int i = 65; i < 91; ++i) { // список символов с кодами от 65 до 90
            charList.add(Character.toString((char)i));
        }
        return charList;
    }
}
