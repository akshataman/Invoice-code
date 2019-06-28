package com.cg.dao;

import java.util.HashMap;
import java.util.Map;
import com.cg.bean.Invoice;

public class InvoiceRepoImpl implements InvoiceRepo{
	public static Map<Long,Invoice> invoicemap = new HashMap<Long,Invoice>();
		public int saveInvoice(Invoice bean) {
			return 0;
	}
}

