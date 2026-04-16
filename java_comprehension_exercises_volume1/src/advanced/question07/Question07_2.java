package advanced.question07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question07_2 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		// 登録済み商品（値は変更可）
		String[] itemNames = { "ノート", "ボールペン", "消しゴム", "はさみ", "のり" };
		// 単価（値は変更可）
		int[] prices = { 120, 200, 100, 400, 150 };

		// TODO: 実装ここから
		int[] amounts = new int[5];
		int sum = 0;

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		for (int i = 0; i < amounts.length; i++) {
			System.out.print(itemNames[i] + "の購入数:>");
			amounts[i] = Integer.parseInt(reader.readLine());
			sum += prices[i] * amounts[i];
		}

		System.out.println();
		for (int i = 0; i < amounts.length; i++) {
			System.out.println(itemNames[i] + "：" + prices[i] * amounts[i] + " 円");
		}
		System.out.println("合計金額：" + sum + " 円");

	}
}
