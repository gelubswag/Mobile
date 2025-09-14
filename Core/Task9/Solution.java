
import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Коты
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader buf = new BufferedReader(reader);
        String key = buf.readLine();
        while (!key.equals("")) {
            System.out.println(CatFactory.getCatByKey(key));
            key = buf.readLine();
        }
    }

    static class CatFactory {

        static Cat getCatByKey(String key) {
            Cat cat;
            cat = switch (key) {
                case "vaska" ->
                    new MaleCat("Василий");
                case "murka" ->
                    new FemaleCat("Мурочка");
                case "kiska" ->
                    new FemaleCat("Кисюлька");
                default ->
                    new Cat(key);
            };
            return cat;
        }
    }

    static class Cat {

        private final String name;

        protected Cat(String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }

        @Override
        public String toString() {
            return "Я уличный кот " + getName();
        }
    }

    static class MaleCat extends Cat {

        MaleCat(String name) {
            super(name);
        }

        @Override
        public String toString() {
            return "Я - солидный кошак по имени " + getName();
        }
    }

    static class FemaleCat extends Cat {

        FemaleCat(String name) {
            super(name);
        }

        @Override
        public String toString() {
            return "Я - милая кошечка по имени " + getName();
        }
    }
}
