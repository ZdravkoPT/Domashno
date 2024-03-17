import java.util.Map;

public class fileMenu implements menuChoice {
    private Map<String, file> fileActions;

    public fileMenu(Map<String, file> fileActions) {
        this.fileActions = fileActions;
    }

    @Override
    public void input(String choice) {
        file fileAction = fileActions.get(choice);
        if (fileAction != null) {
            System.out.println("You selected   " + choice + "option!");
            fileAction.execute();
        } else {
            System.out.println("Invalid option. Please choose a valid option:");
        }
    }
}
