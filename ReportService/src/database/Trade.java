package database;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

import company.core.domain.Report.ReportType;

import java.time.LocalDate;

public class Trade {

    private static int number = 0;
    private Random random = new Random();

    private String tradeId;
    private ReportType type;
    private LocalDate tradeDate;
    private String partnerId;
    private Collection<TradeRecord> records;
    private double amount;
    
    public Trade (ReportType type, LocalDate tradeDate, int partnerId) {

        switch (type){
            case SALES:
                this.tradeId = "sale_" + ++Trade.number;
                break;
            case PURCHASES:
                this.tradeId = "purch_" + ++Trade.number;
                break;
        }
        this.tradeDate = tradeDate;
        this.partnerId = "comp_" + partnerId;
        this.records = getTradeRecords();
        this.amount = getAmount();
    }

    /**
     * Метод генерации списка продуктов одной поставки
     * @return records - список позиций одной поставки
     */
    public Collection<TradeRecord> getTradeRecords() {
        prepareRecords();
        return records;
    }

    private void prepareRecords(){
        if (records == null){
            records = new ArrayList<>();
            int recordsCount =  5  + random.nextInt(11);
            for (int i = 0; i < recordsCount; i++){
                records.add(new TradeRecord(random.nextInt(100),random.nextDouble()*100,100 + random.nextInt(50)));
            }
        }
    }

    public double getAmount(){
    amount = 0;
        if (records == null) return amount;
        else {
            for (TradeRecord record : records){
                amount += record.getPrice(); 
            }
        }
        return amount;
    }
        
    public LocalDate getTradeDate() {
        return tradeDate;
    }

    @Override
    public String toString() {
        return String.format ("   %s, %s,  amount = %f", tradeId, tradeDate.toString(), getAmount());
    }

    public void clear () {}
    
}
