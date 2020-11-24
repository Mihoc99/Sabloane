package lab7;

import java.util.ArrayList;

public class SubChapter {
    private final String name;
    ArrayList<String> paragraph = new ArrayList<>();
    ArrayList<String> images = new ArrayList<>();
    ArrayList<String> table = new ArrayList<>();

    public SubChapter(String name) {
        this.name = name;
    }




    @Override
    public String toString() {
        return
                "SubChapter: " + name  +"\n"+
                        "Paragraph: " + paragraph + "\n"+
                        "Image with name=" + images + "\n"+
                        "Table with title=" + table;
    }

    public void createNewParagraph(String s) {
        paragraph.add(s);

    }

    public void createNewImage(String s) {
        images.add(s);
    }

    public void createNewTable(String s) {
        table.add(s);
    }
}