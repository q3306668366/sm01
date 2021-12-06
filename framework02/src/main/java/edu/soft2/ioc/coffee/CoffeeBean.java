package edu.soft2.ioc.coffee;

public class CoffeeBean {
    /**
     * 定义name属性，该属性的值将通过Spring框架进行设置
     */
    private String flavor;

    public String getFlavor(){
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    /**
     * 定义打印方法，输出完整的一句自然语句。
     */
    public void drink(){
        System.out.println("喝" + this.getFlavor() + "口味的咖啡！");
    }
}
