package monzter.adventurescraft.plugin.network.PrisonGamemode.shared.GUIs.mainMenu.quests;

public enum QuestGiver {
    WIZARD(QuestArea.TOWN, "Wizard", 1, "ewogICJ0aW1lc3RhbXAiIDogMTYxMTE4NDM0MTA1MCwKICAicHJvZmlsZUlkIiA6ICI5NGMzZGM3YTdiMmQ0NzQ1YmVlYjQzZDc2ZjRjNDVkYyIsCiAgInByb2ZpbGVOYW1lIiA6ICJUaGVRdWFzb24iLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZDViYTkxNDBhMWMzZDVkOWE4YzBkYzM3NTAwN2QwYjgyYmFiZDhkYWNlYmFmOWI1ZTRmZTliNmM4ZjViNDlkZCIKICAgIH0KICB9Cn0="),
    JOY(QuestArea.TOWN, "Joy", 1, "eyJ0aW1lc3RhbXAiOjE1MTQ5MTIyNzQ3NDksInByb2ZpbGVJZCI6ImI0NDkxZGI5NmU4MjQ0MTRiMjRiZmZmZDlhNzU3MDJkIiwicHJvZmlsZU5hbWUiOiJOdXJzZV9Kb3kiLCJzaWduYXR1cmVSZXF1aXJlZCI6dHJ1ZSwidGV4dHVyZXMiOnsiU0tJTiI6eyJ1cmwiOiJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzRlNzYyMjg1NDBjYjc1ZWFhMmY4Yzc2OWM4OGJkY2E1YmM2YzllZThlNGI3NjQzNjgwYTJlNGFmYzEwZGY4MSJ9fX0="),
    FINBUR(QuestArea.TOWN, "Finbur", 2, "eyJ0aW1lc3RhbXAiOjE1ODc4OTg4Njg4NTEsInByb2ZpbGVJZCI6IjQ4YTVlODJkODNkZjQyMDliZmNiYjNjYmZiZWI5NDY5IiwicHJvZmlsZU5hbWUiOiJraW5nbG9sMTIzNDUiLCJzaWduYXR1cmVSZXF1aXJlZCI6dHJ1ZSwidGV4dHVyZXMiOnsiU0tJTiI6eyJ1cmwiOiJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzRmMTg0MDEyYzU5NDMxYjM3NGMzY2UyZGUwOTlkYWQ0ZDg2ZDJhOGFmYWNhODY3NmQ2ZWE4YzlkYzUyZTliM2IifX19"),
    ;

    private QuestArea area;
    private final String name;
    private final int questAmount;
    private final String head;



    QuestGiver(QuestArea area, String name, int questAmount, String head) {
        this.area = area;
        this.name = name;
        this.questAmount = questAmount;
        this.head = head;
    }

    public QuestArea getArea() {
        return area;
    }

    public String getName() {
        return name;
    }

    public int getQuestAmount() {
        return questAmount;
    }

    public String getHead() {
        return head;
    }
}