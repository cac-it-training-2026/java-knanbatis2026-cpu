package advanced.question07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question07_3 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		// 登録済み商品（値は変更可）
		String[] itemNames = { "ノート", "ボールペン", "消しゴム", "はさみ", "のり" };
		// 単価（値は変更可）
		int[] prices = { 120, 200, 100, 400, 150 };
		// 購入数（変更不可）
		int[] amounts = new int[5];

		// TODO: 実装ここから
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		int[] stocks = new int[5];
		int sum = 0;

		for (int i = 0; i < stocks.length; i++) {
			System.out.print(itemNames[i] + "の在庫数:>");
			stocks[i] = Integer.parseInt(reader.readLine());
		}

		for (int i = 0; i < stocks.length; i++) {
			System.out.print(itemNames[i] + "の購入数:>");
			amounts[i] = Integer.parseInt(reader.readLine());
			if (stocks[i] < amounts[i]) {
				System.err.println("在庫を超えています。もう一度入力してください。");
				i--;
				continue;
			}
			stocks[i] -= amounts[i];
			sum += amounts[i] * prices[i];
		}

		for (int i = 0; i < stocks.length; i++) {
			System.out.println(itemNames[i] + "：購入" + amounts[i] + "個");
			System.out.println("在庫" + stocks[i] + "個");
		}
		System.out.println("合計金額：" + sum + "円");

	}
}
