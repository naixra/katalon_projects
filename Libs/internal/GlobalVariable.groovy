package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.main.TestCaseMain


/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p></p>
     */
    public static Object URL
     
    /**
     * <p></p>
     */
    public static Object OUTPUT_PATH
     
    /**
     * <p></p>
     */
    public static Object Reseau
     
    /**
     * <p></p>
     */
    public static Object testCaseName
     
    /**
     * <p></p>
     */
    public static Object testCase
     
    /**
     * <p></p>
     */
    public static Object runtest_info
     
    /**
     * <p></p>
     */
    public static Object HostName
     
    /**
     * <p></p>
     */
    public static Object OS
     
    /**
     * <p></p>
     */
    public static Object driver
     
    /**
     * <p></p>
     */
    public static Object driverVersion
     
    /**
     * <p></p>
     */
    public static Object ExecutionDirectory
     
    /**
     * <p></p>
     */
    public static Object startTime
     
    /**
     * <p></p>
     */
    public static Object testSuiteName
     
    /**
     * <p></p>
     */
    public static Object TestSuite_Info
     
    /**
     * <p></p>
     */
    public static Object TestSuite_TC
     
    /**
     * <p></p>
     */
    public static Object pathSuite
     

    static {
        try {
            def selectedVariables = TestCaseMain.getGlobalVariables("default")
			selectedVariables += TestCaseMain.getGlobalVariables(RunConfiguration.getExecutionProfile())
            selectedVariables += RunConfiguration.getOverridingParameters()
    
            URL = selectedVariables['URL']
            OUTPUT_PATH = selectedVariables['OUTPUT_PATH']
            Reseau = selectedVariables['Reseau']
            testCaseName = selectedVariables['testCaseName']
            testCase = selectedVariables['testCase']
            runtest_info = selectedVariables['runtest_info']
            HostName = selectedVariables['HostName']
            OS = selectedVariables['OS']
            driver = selectedVariables['driver']
            driverVersion = selectedVariables['driverVersion']
            ExecutionDirectory = selectedVariables['ExecutionDirectory']
            startTime = selectedVariables['startTime']
            testSuiteName = selectedVariables['testSuiteName']
            TestSuite_Info = selectedVariables['TestSuite_Info']
            TestSuite_TC = selectedVariables['TestSuite_TC']
            pathSuite = selectedVariables['pathSuite']
            
        } catch (Exception e) {
            TestCaseMain.logGlobalVariableError(e)
        }
    }
}
