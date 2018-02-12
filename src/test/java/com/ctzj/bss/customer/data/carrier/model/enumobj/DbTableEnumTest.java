package com.ctzj.bss.customer.data.carrier.model.enumobj;

import org.junit.Assert;
import org.junit.Test;

public class DbTableEnumTest{

	@Test
	public void testGetEnumByName() {
		DbTableEnum A=DbTableEnum.A;
		DbTableEnum newA= DbTableEnum.getEnumByName(A.name());
		Assert.assertTrue(A.equals(newA));
	}
}
