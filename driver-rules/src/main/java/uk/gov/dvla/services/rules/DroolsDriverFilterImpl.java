package uk.gov.dvla.services.rules;

import uk.gov.dvla.domain.Driver;
import uk.gov.dvla.domain.RulesDriver;
import uk.gov.dvla.services.ManagedService;
import uk.gov.dvla.services.filter.FilterService;

public class DroolsDriverFilterImpl implements FilterService<Driver>, ManagedService {
    @Override
    public RulesDriver filter(Driver objectToFilter, String context) {
        return new RulesDriver();
    }

    @Override
    public void start() throws Exception {
    }

    @Override
    public void stop() {
    }

    @Override
    public boolean isAlive() {
        return true;
    }

    @Override
    public String getName() {
        return "drools-driver-filter-service";
    }
}