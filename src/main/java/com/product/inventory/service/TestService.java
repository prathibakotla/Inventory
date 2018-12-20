package com.product.inventory.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.product.inventory.db.InventoryData;
import com.product.inventory.db.ItemQuality;
import com.product.inventory.model.ItemInput;
import com.product.inventory.model.Result;

public class TestService {
	
	/**
	 * Get the list of products registered currently
	 * 
	 * @param reportDate
	 * @return List<ResultItem>
	 */
	public List<Result> getProducts(String reportDate) {
		
		Date inputDate = getDate(reportDate);
		
		List<Result> productsList = new ArrayList<Result>();
		for (ItemInput item : InventoryData.getProductsList()) {
			productsList.add(getProcessedItem(item, inputDate));
		}
		
		return productsList;
	}
	
	public static Date getDate(String date) {
		try {
			return new SimpleDateFormat("dd-MM-yyyy").parse(date);
		} catch (ParseException e) {
			return null;
		}
	}
	
	public Result getProcessedItem(ItemInput item, Date reportDate) {
		Result processedItem = new Result();

		ItemQuality qualityDetails = getQualityDetails(item);

		return processedItem;
	}
	
	public ItemQuality getQualityDetails(ItemInput item)
	{
		
		
		
		return null;
	}

}
