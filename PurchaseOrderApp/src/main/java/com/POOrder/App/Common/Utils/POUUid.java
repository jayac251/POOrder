package com.POOrder.App.Common.Utils;

import java.util.UUID;

public class POUUid {
	
	public String getUUid ()
	{
		UUID uuid = UUID.randomUUID();
        String randomUUIDString = uuid.toString();
		return randomUUIDString.substring(0, 35);
	}

}
