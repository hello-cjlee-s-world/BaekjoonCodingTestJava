package com.priv.cote.component.setMap;

import com.priv.cote.main.BasicInterface;

import java.io.IOException;
import java.util.*;

public class NumberCard implements BasicInterface {
  @Override
  public void print() throws IOException {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int[] cards = new int[n];

    for (int i = 0; i < n; i++) {
      cards[i] = sc.nextInt();
    }

    Arrays.sort(cards);

    int m = sc.nextInt();
    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < m; i++) {
      int target = sc.nextInt();

      if (binarySearch(cards, target)) {
        sb.append(1).append(" ");
      } else {
        sb.append(0).append(" ");
      }
    }

    System.out.println(sb);
  }
  public static boolean binarySearch(int[] arr, int target) {
    int left = 0;
    int right = arr.length - 1;

    while (left <= right) {
      int mid = (left + right) / 2;

      if (arr[mid] == target) {
        return true;
      } else if (arr[mid] < target) {
        left = mid + 1;
      } else {
        right = mid - 1;
      }
    }

    return false;
  }
}
