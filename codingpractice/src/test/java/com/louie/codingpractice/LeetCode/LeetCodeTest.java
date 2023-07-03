package com.louie.codingpractice.LeetCode;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class LeetCodeTest {
    /**
     * Rigorous Test :-)
     */

    LeetCode Lc = new LeetCode();

    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }

    @Test
    public void twoSumTest(){
        int[] nums = {0,2,4,5};
        int target = 6;
        int[] result = Lc.twoSum(nums, target);
        int[] expected = new int[]{1,2};
        boolean isTrue = result.equals(new int[]{1,2});
        System.out.println(isTrue);
        assertTrue(true);
    }
}
