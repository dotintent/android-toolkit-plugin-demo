package com.infullmobile.toolkitdemo;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Adam Kobus on 20.06.2016.
 * Copyright (c) 2016, inFullMobile
 * License: MIT, file: /LICENSE
 */
public class BazTest {

    @Test
    public void testGetBaz() throws Exception {
        Assert.assertEquals("baz", Baz.getBaz());
    }
}