/*
 * Project Rorschach
 */

package org.terrarossa.rorschach.unit;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
import org.junit.Test;

public class IntegerValidationUtilTest {

    @Test
    public void inRange_returns_true_when_giving_in_range_value() throws Exception {
        assertTrue(IntegerValidationUtil.inRange(0, 0, 10));
        assertTrue(IntegerValidationUtil.inRange(10,0,10));
    }

    @Test
    public void inRange_returns_false_when_giving_out_of_range_value() throws Exception {
        assertFalse(IntegerValidationUtil.inRange(-1, 0, 10));
        assertFalse(IntegerValidationUtil.inRange(11, 0, 10));
    }

    @Test(expected = IllegalArgumentException.class)
    public void inRange_throws_if_min_value_is_larger_than_max_value() throws Exception {
        IntegerValidationUtil.inRange(0, 1, 0);
    }
}
