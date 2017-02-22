package w5p3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
	public static void main(String[] Args) throws IOException {
		double euro;
		double eurocent;
		FileReader fr = new FileReader("C:/Users/Yannick/workspace/V1OODC1/src/w5p3/prices_usd.txt");
		BufferedReader br = new BufferedReader(fr);
		FileWriter fw = new FileWriter("C:/Users/Yannick/workspace/V1OODC1/src/w5p3/prices_euro.txt");
		PrintWriter pw = new PrintWriter(fw);
		System.out.print("Enter exchangerate:");
		BufferedReader brinput = new BufferedReader(new InputStreamReader(System.in));

		String input = brinput.readLine();
		eurocent = Double.parseDouble(input);

		while (true) {

			String mt = br.readLine();
			if (mt == null) {
				break;
			}

			Scanner scan = new Scanner(mt);
			scan.useDelimiter(":");
			String text = scan.next();
			String prijs = scan.next();
			double pr = Double.parseDouble(prijs);

			euro = pr * eurocent;
			System.out.println("" + text + ": " + String.format("%.2f", euro));
			pw.println(text + ":" + String.format("%.2f", euro));
			scan.close();

		}
		br.close();
		pw.close();
	}
}
