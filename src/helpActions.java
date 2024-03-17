import java.util.Map;

public class helpActions implements file {
    private Map<String, file> fileActions;

    public helpActions(Map<String, file> fileActions) {
        this.fileActions = fileActions;
    }

    @Override
    public void execute() {
        System.out.println("The following commands are supported:");

        int maxCommandLength = getMaxCommandLength();

        for (Map.Entry<String, file> entry : fileActions.entrySet()) {
            String command = entry.getKey();

            String description = switch (command) {
                case "Open" -> "Opening the <file>";
                case "Close" -> "Closing currently opened file";
                case "Save" -> "Saving the currently opened file";
                case "Save as" -> "Saving the currently opened file in <file>";
                case "Help" -> "Printing this information";
                case "Exit" -> "Exiting the program";
                default -> "";
            };

            if (command.equals("Open") || command.equals("Save as")) {
                System.out.printf("%-" + (maxCommandLength + 10) + "s%s%n", command + " <file> ", description);
            } else {
                System.out.printf("%-" + (maxCommandLength + 10) + "s%s%n", command, description);
            }
        }

    }

    private int getMaxCommandLength() {
        int maxCommandLength = 0;

        for (String command : fileActions.keySet()) {
            maxCommandLength = Math.max(maxCommandLength, command.length());
        }
        return maxCommandLength;
    }
}
