package com.nhnent.util;

import com.nhnent.Application;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.IntegrationTest;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.Assert;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes=Application.class)
@IntegrationTest({"server.port=0", "management.port=0"})
public class DatetimeUtilTests {

    @Test
    public void testBeautify() {
        String src = "Wed Dec 24 10:59:26 KST 2014";
        String res = "December 24 10:59:26";
        Assert.isTrue(DatetimeUtil.beautify(src).equals(res));
    }
}
