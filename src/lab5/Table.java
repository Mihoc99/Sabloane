package lab5;

public class Table implements Element {
    public String TaTitle;
    String TabTitle;

    public Table(String tabTitle) {
        this.TabTitle = tabTitle;
    }

    public void print(){
        System.out.println(this.TabTitle);
    }
}