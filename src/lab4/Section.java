package lab4;

import java.util.ArrayList;

public class Section implements Element{
    public ArrayList<Element> content=new ArrayList<>();
    private String title;

    public Section(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    int add(Element e)
    {
        content.add(e);
        return content.size();
    }
    void remove(Element e)
    {
        content.remove(e);
    }
    public Element getElement(int index){
        return content.get(index);
    }
    public void print()
    {
        System.out.println(title);
        for(Element e:content)
        {
            e.print();
        }
    }}