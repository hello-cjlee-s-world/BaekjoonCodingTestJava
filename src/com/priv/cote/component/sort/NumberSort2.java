package com.priv.cote.component.sort;

import com.priv.cote.main.BasicInterface;

import java.io.*;

public class NumberSort2 implements BasicInterface {
    @Override
    public void print() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

      int n = Integer.parseInt(br.readLine());
      int[] arr = new int[n];
      for(int i =0; i < n; i++){
        arr[i] = Integer.parseInt(br.readLine());
      }

      sort(arr, 0, n-1);

      for(int i = 0; i < n; i++){
        System.out.print(arr[i] + "\n");
      }

      bw.flush();
      bw.close();
    }
    public static void sort(int[] arr, int left, int right) {
      if (left >= right) return;

      int mid = (left + right) / 2;

      // 1. 나누기
      sort(arr, left, mid);
      sort(arr, mid + 1, right);

      // 2. 합치기
      merge(arr, left, mid, right);
    }

    static void merge(int[] arr, int left, int mid, int right) {
      int[] temp = new int[right - left + 1];

      int i = left;
      int j = mid + 1;
      int k = 0;

      while (i <= mid && j <= right) {
        if (arr[i] <= arr[j]) {
          temp[k++] = arr[i++];
        } else {
          temp[k++] = arr[j++];
        }
      }

      while (i <= mid) temp[k++] = arr[i++];
      while (j <= right) temp[k++] = arr[j++];

      for (int x = 0; x < temp.length; x++) {
        arr[left + x] = temp[x];
      }
    }
}
