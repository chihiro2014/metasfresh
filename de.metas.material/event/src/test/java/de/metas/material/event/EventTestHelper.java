package de.metas.material.event;

import java.math.BigDecimal;
import java.util.Date;

import org.adempiere.util.time.SystemTime;

/*
 * #%L
 * metasfresh-material-event
 * %%
 * Copyright (C) 2017 metas GmbH
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as
 * published by the Free Software Foundation, either version 2 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public
 * License along with this program. If not, see
 * <http://www.gnu.org/licenses/gpl-2.0.html>.
 * #L%
 */

public class EventTestHelper
{
	public static final Date NOW = SystemTime.asDate();
	
	public static final int CLIENT_ID = 10;
	
	public static final int ORG_ID = 20;
	
	public static final int TRANSACTION_ID = 60;

	public static final int WAREHOUSE_ID = 51;

	public static final int PRODUCT_ID = 24;

	public static final int ATTRIBUTE_SET_INSTANCE_ID = 28;

	public static final String STORAGE_ATTRIBUTES_KEY = "StorageAttributesKey";

	public static MaterialDescriptor createMaterialDescriptor()
	{
		return MaterialDescriptor
				.builderForCandidateOrQuery()
				.productDescriptor(createProductDescriptor())
				.warehouseId(WAREHOUSE_ID)
				.quantity(BigDecimal.TEN)
				.date(SystemTime.asTimestamp())
				.build();
	}

	public static ProductDescriptor createProductDescriptor()
	{
		return ProductDescriptorFactory.TESTING_INSTANCE
				.forProductAndAttributes(PRODUCT_ID, STORAGE_ATTRIBUTES_KEY, ATTRIBUTE_SET_INSTANCE_ID);
	}

	public static ProductDescriptor createProductDescriptorWithOffSet(final int offset)
	{
		return ProductDescriptorFactory.TESTING_INSTANCE
				.forProductAndAttributes(
						PRODUCT_ID + offset,
						STORAGE_ATTRIBUTES_KEY + offset,
						ATTRIBUTE_SET_INSTANCE_ID + offset);
	}

}
