package com.product.inventory.db;

public class ItemQuality {
	
	public ItemQuality(String name, Integer decrementAtEndOfEachDay, Integer decrementWhen10DaysOrLess, Integer decrementAfterSellDate,
			boolean zeroAfterSellDate, boolean neverSold) {
		super();
		this.name = name;
		this.decrement = decrementAtEndOfEachDay;
		this.decrementBefore10 = decrementWhen10DaysOrLess;
		this.decrementAfterSellDate = decrementAfterSellDate;
		this.zeroAfterSellDate = zeroAfterSellDate;
		this.neverSold = neverSold;
	}

	private String name;
	private Integer decrement;
	private Integer decrementBefore10;
	private Integer decrementAfterSellDate;
	private boolean zeroAfterSellDate;
	private boolean neverSold;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getDecrement() {
		return decrement;
	}

	public void setDecrement(Integer decrement) {
		this.decrement = decrement;
	}

	public Integer getDecrementBefore10() {
		return decrementBefore10;
	}

	public void setDecrementBefore10(Integer decrementBefore10) {
		this.decrementBefore10 = decrementBefore10;
	}

	public Integer getDecrementAfterSellDate() {
		return decrementAfterSellDate;
	}

	public void setDecrementAfterSellDate(Integer decrementAfterSellDate) {
		this.decrementAfterSellDate = decrementAfterSellDate;
	}

	public boolean isZeroAfterSellDate() {
		return zeroAfterSellDate;
	}

	public void setZeroAfterSellDate(boolean zeroAfterSellDate) {
		this.zeroAfterSellDate = zeroAfterSellDate;
	}

	public boolean isNeverSold() {
		return neverSold;
	}

	public void setNeverSold(boolean neverSold) {
		this.neverSold = neverSold;
	}

}
