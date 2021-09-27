package gongju;

/*@ClassName：shangpin
@date：2021/9/23 14:57
@作者：李磊
@Version：1.0
@Description：
*/
public class Commodity {
    private String name;
    private String type;//类型：奶茶、果汁、咖啡、欧包；
    private int Price;
    private int integral;//积分

    public Commodity() {
    }

    public Commodity(String name, String type, int price, int integral) {
        this.name = name;
        this.type = type;
        Price = price;
        this.integral = integral;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }

    public int getIntegral() {
        return integral;
    }

    public void setIntegral(int integral) {
        this.integral = integral;
    }
}
