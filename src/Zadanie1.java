public class Zadanie1 {

    public static final int FROM = 0, TO = 100;
    public static final String FILE_NAME = "fibseq100.txt";

    public static void main(String[] args) {

        System.out.println("Fibonacci wersja 2");

        boolean ok = SequenceTools.writeToFile(new FibonacciGenerator(), FROM, TO, FILE_NAME);

<<<<<<< HEAD
            BufferedWriter writer
                    = new BufferedWriter(new FileWriter(fileName));
            for(int i=0; i<=100; i++)
                writer.write(Fibonacci(i).toString() + "\n");
            writer.close();

        }catch (IOException ex)
        { System.out.println("Błąd");return; }

        System.out.println("Wynik zapisany do pliku: "
                + fileName);
=======
        if (ok)
            System.out.println("Wynik zapisany do pliku: " + FILE_NAME);
        else
            System.out.println("Błąd");
>>>>>>> zad1v2
    }
}
