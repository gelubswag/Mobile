/*
Код сам не исправится
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        EnglishTranslator translator = new EnglishTranslator();
        System.out.println(translator.translate());
    }

    public static abstract class Translator {

        public Translator() {
        }

        public String translate() {
            return "Я переводчик";
        }
    }

    public static class EnglishTranslator extends Translator {

        public EnglishTranslator() {
            super();
        }

        @Override
        public String translate() {
            return "Я переводчик с английского";
        }
    }
}
