package company.presentation_queries.views;

import java.util.ArrayList;

import company.core.application.interfaces.ReportPresenter;

public class ReportConsolePresenter implements ReportPresenter {

    @Override
    public void printReport(ArrayList<String> reportList) {
        for (String line: reportList){
            System.out.println(line);
        }
        
    }

    @Override
    public void saveReportToFile(ArrayList<String> reportList, String path) {
                
    }
}
