/*
 * [y] hybris Platform
 *
 * Copyright (c) 2000-2016 hybris AG
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of hybris
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with hybris.
 *
 *  
 */
package my.bookstore.fulfilmentprocess.jalo;

import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import my.bookstore.fulfilmentprocess.constants.BookstoreFulfilmentProcessConstants;

@SuppressWarnings("PMD")
public class BookstoreFulfilmentProcessManager extends GeneratedBookstoreFulfilmentProcessManager
{
	public static final BookstoreFulfilmentProcessManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (BookstoreFulfilmentProcessManager) em.getExtension(BookstoreFulfilmentProcessConstants.EXTENSIONNAME);
	}
	
}
