package com.qinjun.autotest.tstest.base;

import com.qinjun.autotest.tstest.test.TestException;
import com.qinjun.autotest.tstest.test.TestResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.SkipException;
import org.testng.annotations.*;
import org.testng.remote.strprotocol.TestResultMessage;

import java.io.File;

public class BaseCase extends BaseSuite {
    private final static Logger logger = LoggerFactory.getLogger(BaseCase.class);
    protected String testData;

    @BeforeClass
    public void setup() {
    }

    @Test
    public void baseTest() throws TestException {
        TestResult result = TestResult.PASS;
        logger.info("==========[Start Case]==========");
        logger.info("Request data path:[{}]", testData);
        try {
            logger.info("==========[Send Request]==========");
            result = send(url, testData);
            logger.info("==========[End Send]==========");
            if (result == TestResult.PASS) {
                logger.info("==========[Wait]==========");
                result = wait(result);
                logger.info("==========[End Wait]==========");
                if (result == TestResult.PASS) {
                    logger.info("==========[Verify]==========");
                    result = verify(result);
                    logger.info("==========[End Verify]==========");
                }
            }
        } catch (Exception e) {
            result = TestResult.FAIL;
            String errMsg = "Get exception when send request:" + e;
            result.setResultMsg(errMsg);
            logger.error(errMsg);
        }

        if (result == TestResult.FAIL) {
            logger.error("==========[End Case:FAIL]==========");
            String errMsg = result.getResultMsg();
            logger.error(errMsg);
            assert false : errMsg;
        } else if (result == TestResult.SKIP) {
            logger.warn("==========[End Case:SKIP]==========");
            throw new SkipException("Skip the case");
        } else {
            logger.info("==========[End Case:PASS]==========");
        }
    }


    private TestResult send(String url, String testDataPath) throws Exception {
        TestResult result = TestResult.PASS;
        File testDataPathFile = new File(testDataPath);
        if (testDataPathFile.isDirectory()) {

        }


        return result;
    }


    private TestResult wait(TestResult requestResult) {
        TestResult result = TestResult.PASS;

        return result;
    }


    private TestResult verify(TestResult waitResult) {
        TestResult result = TestResult.PASS;


        return result;
    }





    @AfterClass
    public void cleanup() {
        logger.info("==========[End Case]==========");
    }
}