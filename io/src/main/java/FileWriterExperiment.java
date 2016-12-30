import lombok.SneakyThrows;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;

public class FileWriterExperiment {

    @SneakyThrows
    public static void main(String[] args) {
        // JavaSE6 style
        PrintWriter pw = null;
        try {
            // создание потокового объекта (открытие потока)
            FileWriter out = new FileWriter("text.txt");

            // придание потоковому объекту требуемых свойств
            BufferedWriter br = new BufferedWriter(out);

            pw = new PrintWriter(br);

            // работа с потоком через потоковый объект
            pw.println("I'm a sentence in a text-file.");
        } finally {
            if (pw != null) {
                pw.close(); // закрытие потока
            }
        }

    }
}
