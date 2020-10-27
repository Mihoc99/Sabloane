package lab1_2_3;

import java.util.ArrayList;

public class Section implements Element{
    public String title;
    public ArrayList<Element> chapters= new ArrayList<>();
    public Section(String t){
        this.title=t;
    }
    public int add(Element el){
        chapters.add(el);
        return chapters.size();
    }

    public void remove(Element el){
        chapters.remove(el);
    }

    public Element getElement(int i){
        return chapters.get(i);
    }

    @Override
    public void print() {
        System.out.println(this.title);
        for(Element e:chapters){
            e.print();
        }
    }
}