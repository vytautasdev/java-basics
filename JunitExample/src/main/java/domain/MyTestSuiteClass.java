package domain;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses(
        {TestOne.class,
                TestTwo.class,
                TestThree.class,
                TestFour.class
        })
public class MyTestSuiteClass {

}
