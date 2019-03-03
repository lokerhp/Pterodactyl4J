package com.mattmalec.pterodactyl4j.application.entities;

import com.mattmalec.pterodactyl4j.PteroAction;

import java.util.List;

public interface Location extends ISnowflake {

	String getShortCode();
	String getDescription();
	PteroAction<List<Node>> retrieveNodes();

	@Override
	String toString();
}
