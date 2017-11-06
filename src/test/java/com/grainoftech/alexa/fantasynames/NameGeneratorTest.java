package com.grainoftech.alexa.fantasynames;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

public class NameGeneratorTest {

    NameGenerator target;

    @Before
    public void setUp() throws Exception {
        target = new NameGenerator();
    }

    @Test
    public void defaultName() throws Exception {
        String result = target.generateName(null);
        Assertions.assertThat(result).isNotEmpty();
        System.out.println(result);
    }
}