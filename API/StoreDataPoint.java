package API;

public class StoreDataPoint {
	private String brand;
	private String sales;
	private String month;
	private String category;

	public StoreDataPoint(String brand, String category, String month,
			String sales) {
		this.brand = brand;
		this.category = category;
		this.month = month;
		this.sales = sales;
	}

	public String getbrand() {
		return brand;
	}

	public String getsales() {
		return sales;
	}

	public String getmonth() {
		return month;
	}

	public String getcategory() {
		return category;
	}
}
