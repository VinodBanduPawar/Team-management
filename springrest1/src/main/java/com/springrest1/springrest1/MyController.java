package com.springrest1.springrest1;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

//import com.fasterxml.jackson.databind.deser.DataFormatReaders.Match;

public class MyController {
	@RequestMapping("firstservice")
	int hii() {
		return 150;

	}

	@RequestMapping("secondservice")
	ArrayList Vinod() {
		ArrayList<String> al = new ArrayList<>();
		al.add("rushi");
		al.add("yash");
		return al;
	}

	@RequestMapping("thirdservice")
	String abc() {
		return "acghh";

	}

	@RequestMapping("fourthservice")
	int hello() {
		return 23;
	}

	@RequestMapping("matchdetails")
	ArrayList<Match> detailAboutMatches() {
		ArrayList<Match> al = new ArrayList<>();
		Match match = new Match(32, 50, 2);
		Match match1 = new Match(32, 50, 2);
		Match match2 = new Match(32, 50, 2);
		al.add(match);
		al.add(match1);
		al.add(match2);
		return al;
	}

	@GetMapping("playerlist/{Ctry}")
	ArrayList<String> givePlayerNamesOfAnyCountry(@PathVariable String Ctry) {
		if (Ctry.equals("india")) {
			ArrayList<String> al = new ArrayList<String>();
			al.add("kholi");
			al.add("dhoni");
			al.add("raina");
			return al;
		} else {
			ArrayList<String> al = new ArrayList<String>();
			al.add("pointing");
			al.add("warne");
			al.add("watson");
			return al;
		}

	}


	
}

