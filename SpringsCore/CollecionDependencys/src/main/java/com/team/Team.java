package com.team;

import java.util.List;
import java.util.Set;

public class Team {
	private String teamname;
	private String captainname;
	private List<String> players;
	private Set<String> coaches;

	public Team(String teamname, String captainname, List<String> players, Set<String> coachs) {
		super();
		this.teamname = teamname;
		this.captainname = captainname;
		this.players = players;
		this.coaches = coachs;
	}

	@Override
	public String toString() {
		return "Team [teamname=" + teamname + ", captainname=" + captainname + ", players=" + players + ", coaches="
				+ coaches + "]";
	}

}
