package edu.soft2.ioc.print;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ColorInk extends Ink {
    @Override
    @Value("彩色")
    public void setType(String type) {
        super.setType(type);
    }
}
