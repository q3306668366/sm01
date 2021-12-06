package edu.soft2.ioc.print;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class B5Paper extends Paper {
    @Override
    @Value("b5规格")
    public void setSize(String size) {
        super.setSize(size);
    }
}
