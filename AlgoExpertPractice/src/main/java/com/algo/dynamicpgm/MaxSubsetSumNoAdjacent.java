//package AlgoExpertPractice.src.main.java.com.algo.dynamicpgm;
//
//public class MaxSubsetSumNoAdjacent {
//    public static void main(String[] args) {
////        int[] array = {75, 105, 120, 75, 90, 135};
//        int[] array = {4, 3, 5, 200, 5, 3};
//        System.out.println(maxSubsetSumNoAdjacent(array));;
//    }
//
//    public static int maxSubsetSumNoAdjacent(int[] array) {
//    	if (array.length==0) {
//			return 0;
//		}
//    	if (array.length==1) {
//    		return array[0];
//    	}
//        int[] storeMax = new int[array.length];
//        storeMax[0] = array[0];
//        storeMax[1] = array[1];
//        for (int i = 2; i < array.length; i++) {
//            storeMax[i] = Math.max(storeMax[i - 1], storeMax[i - 2] + array[i]);
//        }
//        return storeMax[array.length-1];
//    }
//}
