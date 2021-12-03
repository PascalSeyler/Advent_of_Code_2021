package com.company.Day1;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Day1 {
    public static void solve1() {
        try (Scanner sc = new Scanner(new FileReader("res/Day1.txt"));) {
            ArrayList<Integer> depth = new ArrayList<>();
            while (sc.hasNextLine()) {
                depth.add(sc.nextInt());
            }
            boolean first = true;
            int last = -1;
            int count = 0;
            for (int current : depth) {
                if (first) {
                    first = false;
                    last = current;
                    continue;
                }
                if (last <= current) {
                    count++;
                }
                last = current;
            }
            System.out.println(count);
        } catch (IOException e) {
            System.out.println("ERROR 404");
        }
    }

    public static void solve2() {
        try (Scanner sc = new Scanner(new FileReader("res/Day1.txt"));) {
            ArrayList<Integer> depth = new ArrayList<>();
            while (sc.hasNextLine()) {
                depth.add(sc.nextInt());
            }
            int count = 0;
            for (int i = 0; i <= depth.size()-4; i++) {
                if (depth.get(i) < depth.get(i+3)){
                    count++;
                }
            }
            System.out.println(count);
        } catch (IOException e) {
            System.out.println("ERROR 404");
        }
    }
}
