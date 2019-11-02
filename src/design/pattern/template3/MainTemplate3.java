package design.pattern.template3;

import java.util.Arrays;

public class MainTemplate3 {
    public static void main(String[] args) {
        Number n1 = new Number(5);
        Number n2 = new Number(6);
        Number n3 = new Number(6);
        Number n4 = new Number(2);
        Number n5 = new Number(1);
        Number n6 = new Number(8);
        Number n7 = new Number(3);
        Number[] nums = {n1,n2,n3,n4,n5,n6,n7};
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
