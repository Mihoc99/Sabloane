package lab1_2_3;

public class Paragraph implements Element {
    public String text;
    String para;
    public Paragraph(String p){
        this.para=p;
    }

    public void print(){
        System.out.println(this.para);
    }

}