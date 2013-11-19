package com.service.pricing;

import java.util.Collection;

import com.domain.Price;
import com.domain.Trade;
import com.repository.pricing.PricingRepository;

public class SimplePricingService implements PricingService {
	private PricingRepository repository;

	public SimplePricingService(PricingRepository pricingRepository) {
		this.repository = pricingRepository;
	}

	@Override
	public Price priceTrade(Trade trade) {
		return repository.getPriceForTrade(trade);
	}

	@Override
	public Price getTotalPriceForTrades(Collection<Trade> trades) {
		Price totalPrice = new Price(0.0);
		for (Trade trade : trades) {
			Price tradePrice = repository.getPriceForTrade(trade);
			totalPrice = totalPrice.add(tradePrice);
		}
		return totalPrice;
	}

	/**
	 * returns the highest priced trade in a collection. if there are more than
	 * one trades equal to the highest price return the first.
	 */
	@Override
	public Price getHighestPricedTrade(Collection<Trade> trades) {
		Price highestPrice = new Price(0.0);
		for (Trade trade : trades) {
			Price tradePrice = repository.getPriceForTrade(trade);
			if (tradePrice.getAmount() > highestPrice.getAmount()) {
				highestPrice = tradePrice;
			}
		}
		return highestPrice;
	}
}
