package com.ford.training.java.maven;

import org.apache.commons.lang3.StringUtils;
import org.opencv.core.Core;
import org.opencv.core.CvType;
import org.opencv.core.Mat;

public class MavenRun {
	public static void main(String[] args) {
		boolean blank = StringUtils.isBlank(" ");
		System.out.println(blank);
		System.out.println("Welcome to OpenCV " + Core.VERSION);
		
		System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
		Mat m = Mat.eye(3, 3, CvType.CV_8UC1);
		System.out.println("m = " + m.dump());

	}
}
