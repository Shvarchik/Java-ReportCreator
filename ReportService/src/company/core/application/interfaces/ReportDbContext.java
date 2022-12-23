package company.core.application.interfaces;

import company.core.domain.Report;

public interface ReportDbContext {
    
        Report getFromDatabase();
        boolean saveChanges();
}

