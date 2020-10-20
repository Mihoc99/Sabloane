import java.util.ArrayList;

public class Book {
    String title;
    Author author;
    ArrayList<Element> elements= new ArrayList<>();
    public Book(String t){
        this.title=t;
    }

    public void addAuthor(Author a) {
        author=a;
    }

    public void addContent(Element e){
        elements.add(e);
    }

    public void print(){
        System.out.println(this.title);
        author.print();
        for(Element e:elements){
            e.print();
        }
    }
}