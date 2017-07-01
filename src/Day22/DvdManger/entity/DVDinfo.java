package Day22.DvdManger.entity;

/**
 * Created by Administrator on 2017/6/20.
 */
public class DVDinfo implements java.io.Serializable{
    private int id;
    private int bid;
    private String state;

    public DVDinfo() {
    }

    public DVDinfo(int id, int did, String state) {
        this.id = id;
        this.bid = did;
        this.state = state;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBid() {
        return bid;
    }

    public void setBid(int did) {
        this.bid = did;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "DVDinfo{" +
                "id=" + id +
                ", bid=" + bid +
                ", state='" + state + '\'' +
                '}';
    }
}
