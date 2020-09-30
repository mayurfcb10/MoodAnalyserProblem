/*  Welcome to the MOOD ANALYSER Problem */

package com.MoodAnalyser.Mood.Analyser;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest 
{
	@Test
	public void print_Welcome_Message() {
		MoodAnalyser mood = new MoodAnalyser();
		mood.PrintWelcomeMessage();
	}
}
