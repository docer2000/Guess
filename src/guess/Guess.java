package guess;

    public class Guess {
        public static void main(String[] args) throws java.io.IOException{


            char ch, ignore, answer;
            int i = 1;
            System.out.println("Игрок 1, задумай букву английского алфавита от A до Z");
            answer = (char) System.in.read();
            System.out.println ();
            System.out.println("Задумана буква из диапазона A-Z");
            System.out.println("Игрок 2, попытайтесь её угадать");
            do {
                ignore = (char) System.in.read();
            } while (ignore != '\n');


            do{
                ch = (char) System.in.read();

                do {
                    ignore = (char) System.in.read();
                } while (ignore != '\n');


                if (ch == answer) System.out.println("Правильно! Ты красавчик!");
                else {
                    i = i+1;
                    System.out.println ("Вы не угадали, нужная буква находится ");
                    if (ch < answer) System.out.println("ближе к концу алфавита");
                    else System.out.println("ближе к началу алфавита");
                }


            } while (answer != ch);
            System.out.println("Количество попыток " + i);
        }
    }


