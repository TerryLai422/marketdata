package com.terrylai.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.terrylai.entity.Quote;
import com.terrylai.entity.Symbol;

public interface DataController {

	public static final String CONSTANT_SYMBOL_ALL = "ALL";

	@RequestMapping(method = RequestMethod.GET, value = "/reset")
	public Symbol[] resetAll();

	@RequestMapping(method = RequestMethod.GET, value = "/reset/{symbol}")
	public Symbol reset(@PathVariable("symbol") String symbol);
	
	@RequestMapping(method = RequestMethod.GET, value = "/info/{symbol}")
	public Symbol getSymbolInfo(@PathVariable("symbol") String symbol);
	
	@RequestMapping(method = RequestMethod.GET, value = "/info")
	public Symbol[] getSymbolsInfo();

	@RequestMapping(method = RequestMethod.GET, value = "/list/{symbol}")
	public Quote[] getQuote(@PathVariable("symbol") String symbol);
	
	@RequestMapping(method = RequestMethod.GET, value ="/add/{symbol}")
	public String retrieveQuote(@PathVariable("symbol") String symbol);
}
