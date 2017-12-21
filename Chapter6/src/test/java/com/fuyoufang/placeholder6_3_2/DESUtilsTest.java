package com.fuyoufang.placeholder6_3_2;

import org.testng.annotations.Test;

public class DESUtilsTest {
    @Test
    public void testName() throws Exception {
        String a = DESUtils.getEncryptString("root");
        System.out.println(a);
        String b = DESUtils.getEncryptString("12345");
        System.out.println(b);

        a = DESUtils.getDecryptString(a);
        System.out.println(a);
        b = DESUtils.getDecryptString(b);
        System.out.println(b);
    }
}
