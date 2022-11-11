package com.java.LeetCode;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
class LongestConsecutiveSequenceTest {

        private final LongestConsecutiveSequence longestConsecutiveSequence;

        LongestConsecutiveSequenceTest() {
            longestConsecutiveSequence = new LongestConsecutiveSequence();
        }

        @Test
        void testLongestConsecutive1() {
            int[] nums = {100, 4, 200, 1, 3, 2};

            int expectedLength = 4;
            int actualLength = longestConsecutiveSequence.longestConsecutive(nums);

            assertEquals(expectedLength, actualLength);
        }

        @Test
        void testLongestConsecutive2() {
            int[] nums = {100, 4, 200, 1};

            int expectedLength = 1;
            int actualLength = longestConsecutiveSequence.longestConsecutive(nums);

            assertEquals(expectedLength, actualLength);
        }

        @Test
        void testLongestConsecutive3() {
            int[] nums = {0, 3, 7, 2, 5, 8, 4, 6, 0, 1};

            int expectedLength = 9;
            int actualLength = longestConsecutiveSequence.longestConsecutive(nums);

            assertEquals(expectedLength, actualLength);
        }

        @Test
        void testLongestConsecutive4() {
            int[] nums = {1, 0, -1};

            int expectedLength = 3;
            int actualLength = longestConsecutiveSequence.longestConsecutive(nums);

            assertEquals(expectedLength, actualLength);
        }
}
