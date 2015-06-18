package API;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Problem {
	public static void main(String[] args) throws IOException {
		File f = new File("/home/zemoso01/Downloads/store_data.csv");
		BufferedReader bf = new BufferedReader(new FileReader(f));
		String s;
		String row[] = null;
		String cells[][] = new String[193][4];
		int j = 0;

		while ((s = bf.readLine()) != null) {
			row = s.split(",");

			for (int i = 0; i < 4; i++) {
				cells[j][i] = row[i];
			}
			j++;
		}
		StoreDataPoint[] instances = new StoreDataPoint[193];

		for (int i = 0; i < 193; i++) {
			instances[i] = new StoreDataPoint(cells[i][0], cells[i][1],
					cells[i][2], cells[i][3]);
		}
		StoreMetrics store = new StoreMetrics(instances);
		System.out.println(store.highsales("Noodles", "Jan"));
		System.out.println(store.highmonthwise("Jan"));
		System.out.println(store.averagesales("Noodles"));
		bf.close();

	}
}
