import java.util.LinkedHashMap;
import java.util.Map;

public class fileManage {
    public static Map<String, file> createFileActions() {
        Map<String, file> fileActions = new LinkedHashMap<>();
        fileActions.put("Open", new openFile());
        fileActions.put("Close", new closeFile());
        fileActions.put("Save", new saveFile());
        fileActions.put("Save as", new saveAsFile());
        fileActions.put("Help", new helpActions(fileActions));
        fileActions.put("Exit", new exit());
        return fileActions;
    }

    public static menuChoice createFileMenu(Map<String, file> fileActions) {
        return new fileMenu(fileActions);
    }
}

