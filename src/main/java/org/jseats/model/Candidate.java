package org.jseats.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;

@XmlAccessorType(XmlAccessType.FIELD)
public class Candidate implements Comparable<Candidate> {

	@XmlAttribute
	String name;

	@XmlAttribute
	int votes;

	@XmlAttribute
	boolean hasVotes;

	public Candidate(String name) {

		this.name = name;
		this.hasVotes = false;
	}

	public Candidate(String name, int votes) {

		this.name = name;
		this.hasVotes = true;
		this.votes = votes;
	}

	public int getVotes() {
		return votes;
	}

	public void setVotes(int votes) {
		this.hasVotes = true;
		this.votes = votes;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean hasVotes() {
		return hasVotes;
	}

	public void hasVotes(boolean hasVotes) {
		this.hasVotes = hasVotes;
	}

	public int compareTo(Candidate other) {
		return other.votes - votes;
	}

	public boolean equals(Candidate other) {
		return this.name.contentEquals(other.name);
	}

	@Override
	public String toString() {
		StringBuilder str = new StringBuilder(name);
		str.append(":");
		str.append(votes);
		return str.toString();
	}
}