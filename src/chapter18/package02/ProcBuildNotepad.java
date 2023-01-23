package chapter18.package02;

// Продемонстрировать применение класса ProcessBuilder для запуска текстового редактора Notepad
class ProcBuildNotepad {
    public static void main(String[] args) {
        try {
            ProcessBuilder pb = new ProcessBuilder("notepad.exe", "testfile");
            pb.start();
        } catch (Exception e) {
            System.out.println(e.getMessage() + "\nOшибкa запуска Notepad!!!");
        }
    }
}
