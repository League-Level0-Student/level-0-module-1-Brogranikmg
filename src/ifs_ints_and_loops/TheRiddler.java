package ifs_ints_and_loops;

import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0



public class TheRiddler {
	static int score = 0;
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Hey, kids! Are you ready for some \"riddles\"? No? TOO BAD!");
		ridddle("I can tear down mountains, but without me, you'll die. What am I?","water");
		ridddle("EAT DIRT YES, ME DO. WHAT AM","a worm");
		ridddle("I can't tear down mountains, but with me, you'll die. What am I?","cyanide");
		ridddle("What has four legs in the morning, two legs in the afternoon, and three legs in the evening?","an abomination");
		ridddle("Riddle riddle riddle riddle riddle. What word do I use the most?","what");
		ridddle("He who takes it oft is cruel, he who eats it is a fool. He who uses it as a currency is using it correctly. What is it?","money");
		JOptionPane.showMessageDialog(null, "Alright, that was terrible. No joke, those could win an award for worst riddles in the world.");
		JOptionPane.showMessageDialog(null, "But anyway, you got " + score + " of them right!");
		if (score >= 6) {
			JOptionPane.showMessageDialog(null, "Uh, actually... that's all of them. I mean, you clearly cheated or have played this before given how improbable and weird these answers are, but props to you for the dedication.");
		} else if (score >= 4) {
			JOptionPane.showMessageDialog(null, "Nice. You missed a few of them. That's actually unforgivable, try again.");
		} else if (score >= 2) {
			JOptionPane.showMessageDialog(null, "YOU FOOL. YOU ABSOLUTE BUFFOON. YOUR RIDDLE-SOLVING ABILITY IS A DISGRACE. LEAVE MY PRESENCE AT ONCE");
		} else {
			JOptionPane.showMessageDialog(null, "How... dare... you. I poured my HEART and SOUL into writing these riddles, and THIS is how I'm repaid? NEVER talk to me again. NEVER!!!");
		}
	}
	
	public static void ridddle(String riddle, String corrong) {
		String ranswer = JOptionPane.showInputDialog(riddle);
		if (ranswer.equalsIgnoreCase(corrong)) {
			JOptionPane.showMessageDialog(null, "I mean... I guess. Fine, I'll count that answer.");
			score++;
		} else {
			JOptionPane.showMessageDialog(null, "Incorrect, hahahahahahahahahahahahahahahahahahahahahahahahahaha! Ha! The answer was, in fact, " + corrong + ".");
		}
	}
}

