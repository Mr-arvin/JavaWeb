package jdbc;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

/**
 * junit
 */
public class CaculateTest01 {

    /**
     * 使用junit时候要注意以下要求：
     * 1.方法不能有返回值
     * 2.方法不能有参数
     */

    @Test
    public void test1() {
        System.out.println ("monkey1024");
    }

    @Test
    public void test2() {
        Caculate c = new Caculate ();
//        Assert.assertEquals (115,c.add (10,5));
        Assert.assertEquals (15,c.add (10,5));
        TestCase.assertEquals (15,c.add (10,5));

    }

    @Test
    public void test3() {
        Caculate c = new Caculate ();
//        Assert.assertEquals (55,c.devide (10,3),0.4);
        Assert.assertEquals (3,c.devide (10,3),0.4); //0.4是 10/3 的结果和3的偏差范围

    }
}
