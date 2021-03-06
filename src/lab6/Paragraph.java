package lab6;

public class Paragraph implements Element,Visitee {
    private String name;
    private AlignStrategy alignStrategy;
    Paragraph(String name){
        this.name=name;
    }
    public void setAlignStrategy(AlignStrategy a){
        this.alignStrategy = a;
    }
    public void print(){
        if (alignStrategy == null) {
            System.out.println(this.name);
        }
        else {
            alignStrategy.render(this.name);
        }
    }
    public void accept(BookStatistics stats) {
        stats.visit(this);
    }
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}