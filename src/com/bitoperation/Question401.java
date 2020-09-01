package com.bitoperation;

import java.util.ArrayList;
import java.util.List;

/*
 * 	二进制手表顶部有 4 个 LED 代表 小时（0-11），底部的 6 个 LED 代表 分钟（0-59）。
 *	每个 LED 代表一个 0 或 1，最低位在右侧。
 */
public class Question401 {

	public List<String> readBinaryWatch(int num) {
		ArrayList<List<Integer>> tmp = new ArrayList<>();
		search(0, num, new ArrayList<Integer>(), tmp);

		ArrayList<String> result = new ArrayList<>();
		for (List<Integer> list : tmp) {
			int hour = 0;
			int minute = 0;
			for (Integer i : list) {
				if (i <= 3) {
					hour += 1 << i;
				} else {
					minute += 1 << (i-4);
				}
			}

			if (hour > 11 || minute > 59)
				continue;
			String reString = minute < 10 ?hour +":0" + minute : hour+":"+minute;
			result.add(reString);
		}
		return result;
	}

	// 9 8 7 6 5 4 代表分钟 3 2 1 0 代表小时
	public void search(int start, int num, List<Integer> cur, List<List<Integer>> tmp) {
		if (num == 0) {
			tmp.add(new ArrayList<>(cur));
			return;
		}

		for (int i = start; i <= 9; i++) {
			cur.add(i);
			search(i + 1, num - 1, cur, tmp);
			cur.remove(cur.size() - 1);
		}
	}
}
/**
 class Solution {
 List<String> result;
 int[] time;
 int[] clock;

 public List<String> readBinaryWatch(int num) {
 result = new ArrayList<>();
 time = new int[2];
 clock = new int[]{1, 2, 4, 8, 1, 2, 4, 8, 16, 32}; // 前四位代表时针，后六位代表分针

 dfs(0, num);
 return result;
 }

 // num表示还剩下几个灯 从clock[pos:]进行分析
 private void dfs(int pos, int num){
 if(num == 0){
 result.add(getTime(time));
 }
 for(int i = pos; i < 10; i ++){
 if(i < 4){
 // 表示时针
 if(time[0]+clock[i] > 11){
 continue;
 }
 time[0] += clock[i];
 dfs(i+1, num-1);
 time[0] -= clock[i];
 }
 else {
 // 表示分针
 if(time[1]+clock[i] > 59){
 break;
 }
 time[1] += clock[i];
 dfs(i+1, num-1);
 time[1] -= clock[i];
 }

 }
 }

 // 得到时间
 private String getTime(int[] time){
 StringBuilder res = new StringBuilder();
 res.append(time[0]);
 res.append(":");
 if(time[1] < 10) {
 res.append("0");
 }
 res.append(time[1]);
 return res.toString();
 }

 }
 */