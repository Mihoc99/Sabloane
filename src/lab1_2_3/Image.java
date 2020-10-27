package lab1_2_3;

public class Image implements Element {
    public String ImageName;
    String Iindex;
    public Image(String ind){
        this.Iindex=ind;
    }

    public void print(){
        System.out.println(this.Iindex);
    }
}