import model.Human;
import service.FileService;
import service.HumanService;

public class Main {
    public static final String URL = "text.txt";

    public static void main(String[] args) throws Exception {
    String [] data = FileService.read(URL);
    Human [] humans = HumanService.convert(data);
    Human [] sortedHumans = HumanService.sortedHumans(humans);
        for (int i = 0; i < sortedHumans.length; i++) {
            FileService.write(URL,"\nHuman = " + sortedHumans[i].toString());
        }

    }
}
