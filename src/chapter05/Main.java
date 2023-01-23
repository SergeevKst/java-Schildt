package chapter05;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        showChapter();
    }

    private static void showChapter() {
        BreakToLabel.showLabel();
        BreakWhile.showBreakWhile();

        try {
            ChoiceMenu.showChoiceMenu();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Continue.showContinue();
        ContinueLabel.showContinueLabel();
        DoWhile.showDoWhile();
        ForEach.showForEach();
        ForEachDuoArray.showForEachDuoArray();
        NoBody.showNoBody();
        Return.showReturn();
        SampleSwitch.showSampleSwitch();
    }
}
