import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class RandomSelectFile {

    public static void main(String[] args) throws IOException {

        List<String> nameList = new ArrayList<>();
        List<String> chosenList = new ArrayList<>();
        Random random = new Random();

        try {
            File file = new File("src\\names.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                nameList.add(scanner.nextLine());
            }

            int nrPersonSelected = random.nextInt(nameList.size());
            System.out.println(nrPersonSelected);

            file = new File("src\\chosen.txt");
            scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                chosenList.add(scanner.nextLine());
            }


            int occurences = Collections.frequency(chosenList, nameList.get(nrPersonSelected));
            int nrPersonSelectedFinal = nrPersonSelected;


            if (occurences > 0)
                for (int i = 0; i <= occurences; i++) {
                    nrPersonSelectedFinal = random.nextInt(nameList.size());
                    if (nrPersonSelected != nrPersonSelectedFinal) {
                        break;
                    }
                    if (i==occurences){
                        if (nrPersonSelected==nrPersonSelectedFinal){
                            i=0;
                        }
                    }
                }

            file = new File("src\\lastPicked.txt");
            new FileWriter("src\\lastPicked.txt", false).close();
            FileWriter fileWriterLastPicked = new FileWriter(file, true);
            fileWriterLastPicked.write(nameList.get(nrPersonSelectedFinal));

            file = new File("src\\chosen.txt");
            FileWriter fileWriterListChosen = new FileWriter(file, true);
            fileWriterListChosen.write(nameList.get(nrPersonSelectedFinal) + "\r\n");

            System.out.println("First selected: " + nameList.get(nrPersonSelected));
            System.out.println("Final select:" + nameList.get(nrPersonSelectedFinal));
            System.out.println("Already chosen:" + chosenList);

            fileWriterLastPicked.close();
            fileWriterListChosen.close();
            scanner.close();

        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }


    }
}
