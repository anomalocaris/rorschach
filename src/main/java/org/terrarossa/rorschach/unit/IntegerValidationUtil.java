/*
 * Project Rorschach
 */

package org.terrarossa.rorschach.unit;

public class IntegerValidationUtil {

    public static boolean inRange(long target, long min, long max) {
        if (min > max)
            throw new IllegalArgumentException();

        if (min <= target && target <= max)
            return true;
        else
            return false;
    }

}
