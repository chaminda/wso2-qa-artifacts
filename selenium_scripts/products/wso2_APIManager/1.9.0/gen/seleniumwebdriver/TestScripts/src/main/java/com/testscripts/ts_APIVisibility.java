package com.testscripts;

import java.util.HashMap;
import java.util.List;

import com.virtusa.isq.vtaf.aspects.VTAFRecoveryMethods;
import com.virtusa.isq.vtaf.runtime.SeleniumTestBase;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import com.virtusa.isq.vtaf.runtime.VTAFTestListener;


/**
 *  Class ts_APIVisibility implements corresponding test suite
 *  Each test case is a test method in this class.
 */

@Listeners (VTAFTestListener.class)
public class ts_APIVisibility extends SeleniumTestBase {



    /**
     * Test case tc_Visible_To_Everyone.
     *
     * @throws Exception the exception
     */
    @VTAFRecoveryMethods(onerrorMethods = {}, recoveryMethods = {})
    @Test
    public final void tc_Visible_To_Everyone() throws Exception {
    } 
    	

    /**
     * Test case tc_Visible_To_All_Users_In_specific_Domain.
     *
     * @throws Exception the exception
     */
    @VTAFRecoveryMethods(onerrorMethods = {}, recoveryMethods = {})
    @Test
    public final void tc_Visible_To_All_Users_In_specific_Domain() throws Exception {
    } 
    	

    /**
     * Test case tc_Visible_Only_To_Specified_Roles_In_Tenant_Domain.
     *
     * @throws Exception the exception
     */
    @VTAFRecoveryMethods(onerrorMethods = {}, recoveryMethods = {})
    @Test
    public final void tc_Visible_Only_To_Specified_Roles_In_Tenant_Domain() throws Exception {
    } 
    	

    public final Object[][] getDataTable(final String... tableNames) {
        String[] tables = tableNames;
        return this.getTableArray(getVirtualDataTable(tables));
    }

}