package advanced.question07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question07_4 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		// 登録済み商品（値は変更可）
		String[] itemNames = { "ノート", "ボールペン", "消しゴム", "はさみ", "のり" };
		// 単価（値は変更可）
		int[] prices = { 120, 200, 100, 400, 150 };
		// 購入数（変更不可）
		int[] amounts = new int[5];

		// TODO: 実装ここから
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		int sum = 0;

		for (int i = 0; i < amounts.length; i++) {
			System.out.print(itemNames[i] + "の購入数:>");
			amounts[i] = Integer.parseInt(reader.readLine());
			sum += prices[i] * amounts[i];
		}

		System.out.println();
		System.out.println("割引前合計：" + sum + " 円");
		if (sum >= 5000) {
			sum *= .9;
			System.out.println("割引適用（10%OFF）：" + (int) sum + " 円");
		}
		sum *= 1.1;
		System.out.println("税込合計：" + (int) sum + " 円");
	}

}
