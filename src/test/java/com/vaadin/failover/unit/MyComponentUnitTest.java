package com.vaadin.failover.unit;

import org.junit.Test;
import static org.junit.Assert.*;
import com.vaadin.failover.MyComponent;

public class MyComponentUnitTest {

    @Test
    public void testMaxClickCount() {
        MyComponent myComponent = new MyComponent();
        myComponent.setMaxClickCount(2);
        assertEquals(2, myComponent.getMaxClickCount());
    }
    
}
