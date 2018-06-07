package com.qinjun.autotest.tstest.test;

import java.util.List;

public enum TestResult {
    PASS("Case pass"),FAIL("Case fail"), SKIP("Case skip");
    ThreadLocal<String> resultMsg;
    ThreadLocal<List<String>> resultExtrInfo = new ThreadLocal<List<String>>();
    private TestResult(final String resultMsg) {
        this.resultMsg= new ThreadLocal<String>() {
            protected String initValue() {return resultMsg;}
        };
    }

    public String getResultMsg() {
        return resultMsg.get();
    }

    public void setResultMsg(String resultMsg) {
        this.resultMsg.set(resultMsg);
    }

    public List<String> getResultExtrInfo() {
        return resultExtrInfo.get();
    }

    public void setResultExtrInfo(List<String> resultExtrInfo) {
        this.resultExtrInfo.set(resultExtrInfo);
    }
}
