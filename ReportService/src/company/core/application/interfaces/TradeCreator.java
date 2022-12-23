package company.core.application.interfaces;

import company.core.domain.TradeItem;

public interface TradeCreator extends Creator <TradeItem, Integer> {

    void save ();
}
