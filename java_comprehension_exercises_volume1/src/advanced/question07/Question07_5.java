package advanced.question07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question07_5 {

	public static void main(String[] args) throws IOException {

		// 登録商品（値は変更可）
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
		System.out.println("購入内容一覧：");
		for (int i = 0; i < amounts.length; i++) {
			System.out.println(itemNames[i] + "：単価" + prices[i] + " 円 （税込" + (int) (prices[i] * 1.1) + " 円） × "
					+ amounts[i] + "個 = " + (int) (prices[i] * 1.1 * amounts[i]) + " 円");
			sum += (int) (prices[i] * 1.1 * amounts[i]);
		}
		System.out.println("合計（税込）：" + sum + " 円");
		System.out.println("割引後合計（税込）：" + (int) (sum * .9) + " 円");
	}
}