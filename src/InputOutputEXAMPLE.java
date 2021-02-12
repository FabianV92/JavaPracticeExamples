import java.io.*;

public class InputOutputEXAMPLE {


    public static void main(String[] args) {

        String message = "Bitte geben Sie Ihre Message ein!";
        String tmp_message = null;
        BufferedWriter bw;
        BufferedReader bwr2;
        String brunhilde;
        StringBuilder sb = new StringBuilder();
        String dateiName = "stream.dat"; //Festlegung des Dateinamens
        int myInk = 0;
        File myDatei = new File(dateiName); //Datei im Programm definiert, wird noch nicht angelegt!!!

        //Lesenden Vorgang
        System.out.println(message);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            tmp_message = br.readLine();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        //Schreibenden Vorgang
        try {
            bw = new BufferedWriter(new FileWriter(myDatei, true));
            bw.write(tmp_message + "\n");
            bw.flush();
            bw.close();
        } catch (IOException exc) {
            exc.printStackTrace();
            try {
                br.close();
            } catch (IOException exe) {
                exe.printStackTrace();
            }
        }

        // Auslesen der Datei und speichern in einem String nummeriert
        try {
            bwr2 = new BufferedReader(new LineNumberReader(new FileReader(myDatei)));
            do {
                brunhilde = bwr2.readLine();
                if ((brunhilde != null)) {
                    sb.append(++myInk).append(" " + brunhilde + "\n");
                }
            } while (brunhilde != null);
        } catch (IOException horst) {

            horst.printStackTrace();
        }
        System.out.println(sb.toString());

    }
}

