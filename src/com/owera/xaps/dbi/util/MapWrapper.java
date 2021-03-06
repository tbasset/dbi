package com.owera.xaps.dbi.util;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import com.owera.common.util.NaturalComparator;

public class MapWrapper<V> {

	private Map<String, V> map = null;

	public MapWrapper(boolean strictOrder) {
		if (strictOrder)
			map = new TreeMap<String, V>(new NaturalComparator());
		else
			map = new HashMap<String, V>();
	}
	
	public Map<String, V> getMap() {
		return map;
	}
}
