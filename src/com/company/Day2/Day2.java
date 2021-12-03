package com.company.Day2;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Day2 {

    public static void solve1(){
        try (Scanner sc = new Scanner(new FileReader("res/Day2.txt"));) {
            String input;
            int depth = 0;
            int distance = 0;
            while (sc.hasNextLine()) {
                input = sc.nextLine();
                String[] inputs = (input.split(" "));
                if (inputs[0].contains("forward")){
                    distance += Integer.parseInt(inputs[1]);
                }else if (inputs[0].contains("up")){
                    depth -= Integer.parseInt(inputs[1]);
                }else {
                    depth += Integer.parseInt(inputs[1]);
                }
            }
            System.out.println(depth);
            System.out.println(distance);
            System.out.println(distance*depth);
        } catch (IOException e) {
            System.out.println("ERROR 404");
        }
    }
    public static void solve2(){
        try (Scanner sc = new Scanner(new FileReader("res/Day2.txt"));) {
            String input;
            int aim = 0;
            int depth = 0;
            int distance = 0;
            while (sc.hasNextLine()) {
                input = sc.nextLine();
                String[] inputs = (input.split(" "));
                if (inputs[0].contains("forward")){
                    distance += Integer.parseInt(inputs[1]);
                    depth += Integer.parseInt(inputs[1]) * aim;
                }else if (inputs[0].contains("up")){
                    aim -= Integer.parseInt(inputs[1]);
                }else {
                    aim += Integer.parseInt(inputs[1]);
                }
            }
            System.out.println(depth);
            System.out.println(distance);
            System.out.println(distance*depth);
        } catch (IOException e) {
            System.out.println("ERROR 404");
        }
    }
}
