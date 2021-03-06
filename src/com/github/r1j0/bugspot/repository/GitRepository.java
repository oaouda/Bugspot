package com.github.r1j0.bugspot.repository;

import java.util.List;

public class GitRepository implements Repository {

	@SuppressWarnings("unused")
	private final String url;
	@SuppressWarnings("unused")
	private final String username;
	@SuppressWarnings("unused")
	private final String password;


	public GitRepository(String url, String username, String password) {
		this.url = url;
		this.username = username;
		this.password = password;
	}


	public List<LogEntries> checkout(long startRevision) {
		throw new IllegalArgumentException("Not implemented yet.");
	}


	public List<LogEntries> checkout(long startRevision, long endRevision) {
		throw new IllegalArgumentException("Not implemented yet.");
	}
}
