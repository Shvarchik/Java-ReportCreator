package company.presentation_queries.controllers;

import company.core.application.interfaces.ReportCreator;

public class ReportsController extends Controller{

    private final ReportCreator reportCreator;
    
    public ReportsController(ReportCreator reportCreator){
        this.reportCreator = reportCreator;
    }
    
    public void print(){
        this.reportCreator.printReport();
    }
    
}

