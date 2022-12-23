package company.core.application;

import java.util.Date;
import java.util.Optional;

import company.core.application.interfaces.ReportCreator;
import company.core.application.interfaces.ReportDbContext;
import company.core.application.interfaces.ReportPresenter;
import company.core.domain.Report;

public class ConcreteReportCreator implements ReportCreator {

    private final ReportDbContext reportDbContext;
    private final ReportPresenter reportPresenter;
    public Date dateFrom;
    public Date dateTill;
    public String title;
    
    public ConcreteReportCreator(ReportDbContext reportDbContext, ReportPresenter reportPresenter){
      

        this.reportDbContext = reportDbContext;
        this.reportPresenter = reportPresenter;
        // this.dateFrom = dateFrom;
        // this.dateTill = dateTill;
        // this.title = title;
    }

    @Override
    public void printReport() {
        reportPresenter.printReport(create().getReportBody());
    }

    @Override
    public void saveReporttoFile() {
        reportPresenter.saveReportToFile(create().getReportBody(), title);
    }

    @Override
    public Report create () {
        Report report = get();
        report.getReportBody().add (0, String.format("%s dateFrom: %s, dateTill: %s",
                                    report.getTitle(), report.getDateFrom().toString(),
                                    report.getDateFrom().toString())); 
        return report;
    }

    public Report get () {
        return reportDbContext.getFromDatabase();
    }

    @Override
    public boolean edit(Report item) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public Optional<Report> getById(Integer id) {
        // TODO Auto-generated method stub
        return Optional.empty();
    }

    @Override
    public boolean remove(Report item) {
        // TODO Auto-generated method stub
        return false;
    }

    
    
}
