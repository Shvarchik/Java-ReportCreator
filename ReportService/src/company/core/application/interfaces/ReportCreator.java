package company.core.application.interfaces;

import company.core.domain.Report;

public interface ReportCreator extends Creator <Report, Integer> {

    void printReport();
    void saveReporttoFile();

}