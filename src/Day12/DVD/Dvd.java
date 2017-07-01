package Day12.DVD;

public class Dvd {
	private int id;
	private String name;
	private int lengCount;
	private String lendDate;
	private String status;
	
	public Dvd(int id, String name, int lengCount, String lendDate,
			String status) {
		super();
		this.id = id;
		this.name = name;
		this.lengCount = lengCount;
		this.lendDate = lendDate;
		this.status = status;
	}
	public Dvd() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public  void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLendDate() {
		return lendDate;
	}
	public void setLendDate(String lendDate) {
		this.lendDate = lendDate;
	}
	public int getLengCount() {
		return lengCount;
	}
	public void setLengcount(int lengcount) {
		this.lengCount = lengCount;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return  id + " " +
				 name + " " + lengCount
				+ " " + lendDate + " " + status ;
	}
	
	
}
