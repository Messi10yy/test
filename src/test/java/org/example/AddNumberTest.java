package org.example;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class AddNumberTest extends TestCase {

    @Test
    public void testAddNumber()
    {
        System.out.println("执行 AddNumber 类 add()方法");
        int n1 = 20;
        int n2 = 30;
        int res = 0;
        AddNumber test=new AddNumber();
        res = test.add(n1,n2);
        // 期望值，实际值
        Assert.assertEquals(50,res);
    }

}