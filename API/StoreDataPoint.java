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

	String getbrand() {
		return brand;
	}

	String getsales() {
		return sales;
	}

	String getmonth() {
		return month;
	}

	String getcategory() {
		return category;
	}
}
