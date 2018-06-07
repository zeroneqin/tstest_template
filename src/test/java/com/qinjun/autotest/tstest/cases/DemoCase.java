package com.qinjun.autotest.tstest.cases;

import com.qinjun.autotest.tstest.annotation.DemoTestData;
import com.qinjun.autotest.tstest.base.BaseCase;
import org.testng.annotations.Test;

//Case related info like test data
@DemoTestData(path="data/testdata.json")
public class DemoCase extends BaseCase {

    @Test
    public void test() {
    }
}