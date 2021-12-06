package edu.soft2.ioc.print;

import edu.soft2.ioc.print.Ink;
import edu.soft2.ioc.print.Paper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
public class Printer {

    private Ink ink;
    private Paper paper;

    public Ink getInk() {
        return ink;
    }

    @Autowired
    @Qualifier("colorInk")
    public void setInk(Ink ink) {
        this.ink = ink;
    }

    public Paper getPaper() {
        return paper;
    }
    @Autowired
    @Qualifier("a4Paper")
    public void setPaper(Paper paper) {
        this.paper = paper;
    }

    public void print(){
        System.out.println("用"+ink.getType()+"墨盒打印一张"+paper.getSize()+"纸上面");
    }
}
