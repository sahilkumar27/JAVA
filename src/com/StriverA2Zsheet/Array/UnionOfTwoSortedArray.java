package com.StriverA2Zsheet.Array;

import com.sun.source.tree.Tree;

import java.util.*;

public class UnionOfTwoSortedArray {

    public static ArrayList<Integer> findUnion(int a[], int b[]){
//        HashMap<Integer, Integer> mp = new HashMap<>();
//
//
//        for (int i=0; i<a.length; i++){
//            mp.put(a[i], mp.getOrDefault(a[i], 0) + 1);
//        }
//
//        for (int i=0; i<b.length; i++){
//            mp.put(b[i], mp.getOrDefault(b[i], 0) + 1);
//        }
//
//        ArrayList<Integer> ans = new ArrayList<>();
//
//        for (Map.Entry<Integer, Integer> entry : mp.entrySet()){
//            ans.add(entry.getKey());
//        }
//
//        return ans;


        // Second Approach using HashSet
        TreeSet<Integer> set = new TreeSet<>();

        for (int num : a){
            set.add(num);
        }

        for (int num : b){
            set.add(num);
        }

        return new ArrayList<>(set);

    }

    public static void main(String[] args) {
        UnionOfTwoSortedArray union = new UnionOfTwoSortedArray();
        int a[] = {1, 2, 3, 4, 5};
        int b[] = {4, 5, 6, 7, 8};
        System.out.println(union.findUnion(a, b));
    }
}
