package de.agentbase.gema.match;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MatchTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MatchingService service = new MatchingService();
		
		String titel = "Zieh die Schuh aus";
		String autor = "Roger Cicero";
		String datum = "";
		String dauer = "";
		final String sortorder="ASC";
		
		List<Match> matches = service.getMatchingPort().getMatchings(titel, autor, datum, dauer);
//		for(Match match: matches){
//			System.out.println("Title: "+match.getTitel()+", Relevance: "+match.getRelevanz());
//		}
		
		Collections.sort(matches, new Comparator<Match>() {
			public int compare(Match o1, Match o2) {
				if("ASC".equals(sortorder)){
					return o1.getRelevanz().compareTo(o2.getRelevanz());
				} else {
					return o2.getRelevanz().compareTo(o1.getRelevanz());
				}
			}
		});
			
		for(Match match: matches){
			System.out.println("Title: "+match.getTitel()+", Relevance: "+match.getRelevanz());
		}
	}

}
