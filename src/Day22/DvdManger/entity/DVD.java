package Day22.DvdManger.entity;

/**
 * Created by Administrator on 2017/6/20.
 */
public class DVD implements java.io.Serializable {
    private int id;
    private String name;
    private int count;
    private String type;
    private int discount;
    private int haslended;

    public DVD() {
    }

    public DVD(int id, String name, int count, String type, int discount, int haslended) {
        this.id = id;
        this.name = name;
        this.count = count;
        this.type = type;
        this.discount = discount;
        this.haslended = haslended;
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

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public int getHaslended() {
        return haslended;
    }

    public void setHaslended(int haslended) {
        this.haslended = haslended;
    }

    @Override
    public String toString() {
        return "DVD{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", count=" + count +
                ", type='" + type + '\'' +
                ", discount=" + discount +
                ", haslended=" + haslended +
                '}';
    }
}

