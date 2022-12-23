package company.core.domain;

import java.util.ArrayList;
import java.time.LocalDate;

public class Report {
    
    private static int counter = 0;
    private int repId;
    private String title;
    private ReportType type;
    private LocalDate dateFrom;
    private LocalDate dateTill;
    ArrayList <String> reportBody;

    public enum ReportType{
        SALES,
        PURCHASES
    }
    
    public Report(ReportType type, LocalDate dateFrom, LocalDate dateTill) {
        this.repId = ++counter;
        this.type = type;
        switch (type){
            case SALES:
                this.title = "Продажи";
                break;
            case PURCHASES:
                this.title = "Поставки";
                break;
        }
        this.dateFrom = dateFrom;
        this.dateTill = dateTill;
        this.reportBody = new ArrayList<>();
    }
    public String getTitle() {
        return title;
    }
    public ArrayList<String> getReportBody() {
        return reportBody;
    }
    
    public LocalDate getDateFrom() {
        return dateFrom;
    }
    public int getRepId() {
        return repId;
    }
    
    public LocalDate getDateTill() {
        return dateTill;
    }
    
    public ReportType getType() {
        return type;
    }
    public void setDateFrom(LocalDate dateFrom) {
        this.dateFrom = dateFrom;
    }
    
}


