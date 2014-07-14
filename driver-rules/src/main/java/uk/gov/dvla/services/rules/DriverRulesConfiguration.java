package uk.gov.dvla.services.rules;

import java.util.ArrayList;
import java.util.List;

public class DriverRulesConfiguration {

    private static DriverRulesConfiguration instance;

    public static synchronized DriverRulesConfiguration getInstance() {
        if (instance == null) {
            instance = new DriverRulesConfiguration();
        }
        return instance;
    }

    public List<String> getDummyPostcodes() {
        return new ArrayList<String>();
    }

    public List<String> getAllNonEndorsableOffenceCodes() {
        return new ArrayList<String>();
    }

    public List<String> getAlwaysSuppressedNonEndorsables() {
        return new ArrayList<String>();
    }

    public List<String> getSuppressedOnExpiredNonEndorsables() {
        return new ArrayList<String>();
    }

    public List<String> getJoyrideCodes() {
        return new ArrayList<String>();
    }

    public List<String> getMibSharedRestrictionCodes() {
        return new ArrayList<String>();
    }

    public List<String> getMibWithholdRestrictionCodes() {
        return new ArrayList<String>();
    }

    public List<String> getAllowedOtherOffences() {
        return new ArrayList<String>();
    }

    public List<String> getEntitlementStatusesToBeRemoved() {
        return new ArrayList<String>();
    }

    public List<String> getCustodialSentenceCodes() {
        return new ArrayList<String>();
    }
}
