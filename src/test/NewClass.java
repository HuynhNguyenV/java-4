/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nguyenducthao
 */
public class NewClass {
    public static void main(String[] args) {
        ArrayList<Integer> dataList = new ArrayList<>();
        dataList.add(1);
        dataList.add(2);
        dataList.add(3);
        dataList.add(4);
        dataList.add(5);
        dataList=(ArrayList<Integer>) dataList.subList(1, 4);
        for (Integer integer : dataList) {
            System.out.println(integer);
        }
        }
    }

