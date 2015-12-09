/*******************************************************************************
 * Copyright (c) 2015 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
import java.util.HashMap;


public class NullInHashMap
{

	public static void main(String[] args)
	{
		HashMap  hm=new HashMap();
		hm.put(null, null);
		hm.put("a", null);
		System.out.println(hm);
	}

}
