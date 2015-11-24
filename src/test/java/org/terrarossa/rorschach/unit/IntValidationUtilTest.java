/*
 * Project Rorschach
 */

package org.terrarossa.rorschach.unit;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
import org.junit.Test;

public class IntValidationUtilTest {

    @Test
    public void inRange_returns_true_when_giving_in_range_value() throws Exception {
        assertTrue(IntValidationUtil.inRange(0, 0, 10));
        assertTrue(IntValidationUtil.inRange(10,0,10));
    }

    @Test
    public void inRange_returns_false_when_giving_out_of_range_value() throws Exception {
        assertFalse(IntValidationUtil.inRange(-1, 0, 10));
        assertFalse(IntValidationUtil.inRange(11, 0, 10));
    }

    @Test(expected = IllegalArgumentException.class)
    public void inRange_throws_if_min_value_is_larger_than_max_value() throws Exception {
        IntValidationUtil.inRange(0, 1, 0);
    }
}
