package model.AM.client;

import model.AM.common.PropertyBuilding_AM;

import oracle.jbo.client.remote.ApplicationModuleImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Mon Nov 29 14:49:03 IST 2021
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class PropertyBuilding_AMClient extends ApplicationModuleImpl implements PropertyBuilding_AM {
    /**
     * This is the default constructor (do not remove).
     */
    public PropertyBuilding_AMClient() {
    }

    public String BuildUnitInchargeHsty(String buildId, String userName,
                                        String unitCatg, String unitInChrg) {
        Object _ret =
            this.riInvokeExportedMethod(this,"BuildUnitInchargeHsty",new String [] {"java.lang.String","java.lang.String","java.lang.String","java.lang.String"},new Object[] {buildId, userName, unitCatg, unitInChrg});
        return (String)_ret;
    }
}