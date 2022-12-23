package company.infrastructure;

import company.core.application.interfaces.ReportDbContext;
import company.core.domain.Report;
import company.core.domain.Report.ReportType;
import database.Trade;
import database.TradesDataBase;
import java.time.LocalDate;
import java.util.Collection;

public class DatabaseReport implements Database, ReportDbContext {

    private Database database;

    ReportType type;
    LocalDate dateFrom;
    LocalDate dateTill;

    public DatabaseReport(Database database, ReportType type, LocalDate dateFrom, LocalDate dateTill) {
        this.database = database;
        this.type = type;
        this.dateFrom = dateFrom;
        this.dateTill = dateTill;
    }

    /**
     * Кастинг якобы БД к типу Report
     */
    @Override
    public Report getFromDatabase() {
        Report report = new Report(type, dateFrom, dateTill);
        Collection <Trade> trades;
        switch (type){
            case SALES:
                trades = ((TradesDataBase) database).getSales();
                break;
            case PURCHASES:
                trades = ((TradesDataBase) database).getPurchases();
                break;
            default:
                return null;
        }

        for (Trade trade : trades){
            if ((trade.getTradeDate().isAfter(dateFrom) && trade.getTradeDate().isBefore(dateTill)) ||
                    trade.getTradeDate().isEqual(dateFrom) ||  trade.getTradeDate().isEqual(dateTill)){
                
                report.getReportBody().add(trade.toString());
            }
        }
        return report;
    }

    @Override
    public boolean saveChanges() {
        
        return false;
    }
    
}
