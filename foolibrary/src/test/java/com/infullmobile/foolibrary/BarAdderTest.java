package com.infullmobile.foolibrary;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Adam Kobus on 21.06.2016.
 * Copyright (c) 2016, inFullMobile
 * License: MIT, file: /LICENSE
 */
public class BarAdderTest {

    @Test
    public void testAddBar() throws Exception {
        String input = "asdf";
        String expected = "asdfbar";

        Assert.assertEquals(expected, BarAdder.addBar(input));
    }
}