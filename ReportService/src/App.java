import java.time.LocalDate;

import company.core.application.ConcreteReportCreator;
import company.core.domain.Report.ReportType;
import company.infrastructure.DatabaseReport;
import company.presentation_queries.controllers.ReportsController;
import company.presentation_queries.views.ReportConsolePresenter;
import database.TradesDataBase;

public class App {
    public static void main(String[] args) throws Exception {
        
        ConcreteReportCreator concreteReportCreator = new ConcreteReportCreator 
                (new DatabaseReport(new TradesDataBase(), ReportType.PURCHASES,
                 LocalDate.of(2000,10,1), LocalDate.of(2000,12,30)),
                new ReportConsolePresenter());
        ReportsController reportsController = new ReportsController(concreteReportCreator);
        reportsController.print();

    }
}

