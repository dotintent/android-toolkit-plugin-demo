package com.infullmobile.toolkitdemo;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Adam Kobus on 20.06.2016.
 * Copyright (c) 2016, inFullMobile
 * License: MIT, file: /LICENSE
 */
public class FooBarTest {

    private FooBar instance;

    @Before
    public void setUp() {
        this.instance = new FooBar();
    }

    @Test
    public void testGetFoo() throws Exception {
        Assert.assertEquals(1, instance.getFoo());
    }

    @Test
    public void testDoBar() {
        instance.doBar();
    }
}