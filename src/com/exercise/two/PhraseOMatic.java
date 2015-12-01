package com.exercise.two;

public class PhraseOMatic {
	public static void main(String [] args){
		String[] wordListOne = {"24/7", "multi-Tier", "30,000 foot", "B-to-B", "win-win", "front-end", "web-based", "pervasive", "smart", "six-sigma", "critical-path", "dynamic"};
		String[] wordListTwo = {"empowered", "sticky", "value-added", "oriented", "centric", "distributed", "clustered", "branden", "ontside-the-box", "positioned", "networked", "focused", "leveraged", "aligned", "trageted", "shared", "cooperative", "accelerated"};
		String[] wordListThree = {"process", "tipping-point", "solution", "mindshare", "architecture", "core competency", "strategy", "portal", "space", "vision", "paradigm", "mission"};
		
		//计算每一组有多少个名词术语
		int oneLength = wordListOne.length;
		int twoLength = wordListTwo.length;
		int threeLength = wordListThree.length;
		
		//产生随机数
		int rand1 = (int) (Math.random() * oneLength);
		int rand2 = (int) (Math.random() * twoLength);
		int rand3 = (int) (Math.random() * threeLength);
		
		//组合出术语
		String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];
		
//		System.out.println(Math.random());
//		System.out.println(oneLength);
//		System.out.println(rand1);
		
		System.out.println("What we need is a " + phrase);
	}
}
