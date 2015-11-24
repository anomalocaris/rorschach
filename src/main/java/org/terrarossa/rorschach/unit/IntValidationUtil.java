/*
 * Project Rorschach
 */

package org.terrarossa.rorschach.unit;

public class IntValidationUtil {

    public static boolean inRange(int target, int min, int max) {
        if (min > max)
            throw new IllegalArgumentException();

        if (min <= target && target <= max)
            return true;
        else
            return false;
    }

}
