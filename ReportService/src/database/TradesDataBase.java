package database;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

import company.core.domain.Report.ReportType;
import company.infrastructure.Database;

/**
 * Поставка: поставщик, дата, список поставки records
 */

public class TradesDataBase implements Database {

    
    private Collection<Trade> sales;
    private Collection<Trade> purchases;
    

    /**
     * метод, создающий коллекцию продаж - для имитации БД
     */
    public Collection<Trade> getSales(){
        Collection <Trade> sales = getTrades(ReportType.SALES);
        return sales;
    }

    /**
     * метод, создающий коллекцию поставок - для имитации БД
     */

    public Collection<Trade> getPurchases(){
        Collection <Trade> purchases = getTrades(ReportType.PURCHASES);
        return purchases;
        
    };

    private Collection<Trade> getTrades(ReportType type){
        Collection <Trade> trades = new ArrayList<>();
        Random r = new Random();
        int recordsCount =  5  + r.nextInt(11);
        for (int i = 0; i < recordsCount; i++){
            trades.add(new Trade(type, LocalDate.of(2000,r.nextInt(12)+1,r.nextInt(29)+1), r.nextInt(10)));
        }
        return trades;
    }

    public void clearAll(){}

}
