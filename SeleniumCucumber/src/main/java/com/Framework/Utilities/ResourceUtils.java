package com.Framework.Utilities;

public class ResourceUtils {
	
	//return the base path
	public static String getBasePath() {
		String path = ResourceUtils.class.getClassLoader().getResource(".").getPath();
		return path;
	}
	
	//return the path based on resource name
	public static String getResourcePath(String resourceName) {
		String path = getBasePath() + resourceName;
		return path;
	}

}
