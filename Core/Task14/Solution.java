
import java.util.ArrayList;
import java.util.List;

/* 
Синхронизированные заметки 2
 */
public class Solution {

    public static void main(String[] args) throws InterruptedException {
        Note note = new Note();

        ArrayList<NoteThread> threads = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            NoteThread thread = new NoteThread(note, 0 , "Note Thread " + i);
            threads.add(thread);
        }

        for (NoteThread thread : threads) {
            thread.start();
        }

        for (NoteThread thread : threads) {
            thread.join();
        }
    }

    public static class Note {

        public final List<String> notes = new ArrayList<>();

        public synchronized void addNote(int index, String note) {
            System.out.println("Сейчас будет добавлена заметка [" + note + "] На позицию " + index);
            notes.add(index, note);
            System.out.println("Уже добавлена заметка [" + note + "]");
        }

        public synchronized void removeNote(int index) {
            System.out.println("Сейчас будет удалена заметка с позиции " + index);
            try {
                String note = notes.remove(index);
                System.out.println("Уже удалена заметка [" + note + "] с позиции " + index);
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Ошибка: Заметка с позицией " + index + " не найдена");
            }
        }
    }

    public static class NoteThread extends Thread {

        private final Note note;
        private final int index;
        private final String noteText;

        public NoteThread(Note note, int index, String noteText) {
            this.note = note;
            this.index = index;
            this.noteText = noteText;
        }

        @Override
        public void run() {
            note.addNote(index, noteText);
            note.removeNote(index);
        }
    }
}
