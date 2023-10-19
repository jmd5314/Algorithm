package org.example;
public class Main {
    private static int divideAndConquer(int[] arr, int target){
        int start = 0;
        int end = arr.length;
        while(end>start){
            int mid = (start + end) / 2;
            int value = arr[mid];
            if(value == target)
                return mid;
            else if(value<target)
                start = mid+1;
            else
                end = mid;

        }
        return -1; //배열안에 target 없을 경우
    }
    public static void main(String[] args) {

    }
}