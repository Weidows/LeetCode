/*
 * @Author: Weidows
 * @Date: 2020-09-20 13:48:57
 * @LastEditors: Weidows
 * @LastEditTime: 2020-09-20 23:02:34
 * @FilePath: \Weidowsd:\Game\Demo\Github\LeetCode\Mail.java
 */

import java.util.Scanner;

public class Mail {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int T = in.nextInt();
    for (int i = 0; i < T; i++) {
      int n = in.nextInt();
      int m = in.nextInt();
      int k = in.nextInt();
      int[] map = new int[m];
      for (int j = 0; j < m; j++) {
        map[j] = in.nextInt();
      }
      //找出来最小的
      int min = map[0];
      for (int j = 0; j < map.length; j++) {
        if (map[j] < min)
          min = map[j];
      }
      //计算和
      int cal = 0;
      for (int j = 0; j < map.length; j++) {
        cal += 2 * Math.abs(map[j] - k);
      }
      System.out.println(Math.abs(1 - k) + cal + Math.abs(min - 1) - Math.abs(min - k));
    }
    in.close();
  }
}