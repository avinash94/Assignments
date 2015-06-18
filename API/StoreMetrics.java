package API;

public class StoreMetrics {
private	int[] values = new int[4];
	StoreDataPoint arr[];

	public StoreMetrics(StoreDataPoint arr[]) {
		this.arr = arr;
	}

	String highsales(String category, String month) {
		int highest = 100;
		String cat = "";
		for (int i = 1; i < 193; i++) {
			if ((arr[i].getcategory()).equals(category)
					&& (arr[i].getmonth().equals(month))) {
				if (Integer.parseInt((arr[i].getsales())) > highest) {
					highest = (Integer.parseInt(arr[i].getsales()));
					cat = arr[i].getbrand();
				}
			}

		}
		return cat;

	}

	String highmonthwise(String month) {
		int highest = 100;
		String ca = "";
		for (int j = 0; j < 4; j++) {
			values[j] = 0;
		}
		for (int i = 1; i < 193; i++) {
			if ((arr[i].getmonth()).equals(month)) {
				if ((arr[i].getbrand()).equals("Reliance")) {

					values[0] = values[0] + Integer.parseInt(arr[i].getsales());
				}
				if (arr[i].getbrand().equals("Heritage")) {

					values[1] = values[1] + Integer.parseInt(arr[i].getsales());
				}
				if (arr[i].getbrand().equals("More")) {

					values[2] = values[2] + Integer.parseInt(arr[i].getsales());
				}
				if (arr[i].getbrand().equals("Walmart")) {

					values[3] = values[3] + Integer.parseInt(arr[i].getsales());
				}
			}
		}

		for (int k = 0; k < 4; k++) {
			if (values[k] > highest) {
				highest = values[k];
				if (k == 0)
					ca = "Reliance";
				if (k == 1)
					ca = "Heritage";
				if (k == 2)
					ca = "More";
				if (k == 3)
					ca = "Walmart";
			}
		}
		return (ca);
	}

	int averagesales(String category) {
		int sum = 0;
		for (int i = 1; i < 193; i++) {
			if (arr[i].getcategory().equals(category)) {
				sum = sum + Integer.parseInt(arr[i].getsales());
			}
		}
		return (sum / 12);
	}
}
