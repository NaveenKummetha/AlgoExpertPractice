package com.algo.bst;

import java.util.*;

class Program1 {
    public static BST minHeightBst(List<Integer> array) {
        return minHeightBstValue(array,null, 0, array.size()-1);
    }

    public static BST minHeightBstValue(List<Integer> array,BST bst, int left, int right) {
        if (left > right) return null;
        int mid = (right + left) / 2;
        int val = array.get(mid);
        if (bst==null){
            bst = new BST(array.get(mid));
        } else {
            bst.insert(val);
        }
        minHeightBstValue(array,bst,left,mid-1);
        minHeightBstValue(array,bst,mid+1,right);
        return bst;
    }


    static class BST {
        public int value;
        public BST left;
        public BST right;

        public BST(int value) {
            this.value = value;
            left = null;
            right = null;
        }

        public void insert(int value) {
            if (value < this.value) {
                if (left == null) {
                    left = new BST(value);
                } else {
                    left.insert(value);
                }
            } else {
                if (right == null) {
                    right = new BST(value);
                } else {
                    right.insert(value);
                }
            }
        }
    }
}
