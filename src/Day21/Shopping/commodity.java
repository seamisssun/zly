package Day21.Shopping;

/**
 * Created by Administrator on 2017/6/16.
 */
public class commodity {
    private int id;
    private String name;
    private double price;

    public commodity(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public commodity() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "commodity{" +
                "商品编号" + id +
                ", 商品名称'" + name + '\'' +
                ", 商品价格" + price +
                '}';
    }
}
