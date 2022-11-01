package org.myjunit2;

import java.util.Objects;

/**
 * Set of assertion methods.
 */
public class Assert {

    /**
     * Assert two ints are equal.
     * @param expected expected value.
     * @param actual actual value.
     */
    public static void assertEquals(int expected, int actual) {
        if (Objects.isNull(expected) && Objects.isNull(actual)) return;
        if (!Objects.isNull(expected) && !Objects.isNull(actual) && expected == actual) return;
        throw new AssertFailedException("Expected " + Integer.toString(expected) +
                ", but actual " + Integer.toString(actual));
    }
}
