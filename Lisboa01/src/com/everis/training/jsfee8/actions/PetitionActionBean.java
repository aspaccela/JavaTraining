package com.everis.training.jsfee8.actions;

import javax.faces.annotation.ManagedProperty;
import javax.inject.Inject;
import javax.inject.Named;

import com.everis.training.jsfee8.beans.Petition;
import com.everis.training.jsfee8.beans.User;

@Named("petitionAction")
public class PetitionActionBean {
	
	@Inject
	@ManagedProperty("#{petition}")
	private Petition petition;
	
	@Inject
	@ManagedProperty("#{user}")
	private User user;

	public void submitPetition() {
		System.out.println(petition.getEmail1() + " - " + petition.getEmail2());
		System.out.println(user.getName() + " - " + user.getPassword());
	}

	public Petition getPetition() {
		return petition;
	}

	public void setPetition(Petition petition) {
		this.petition = petition;
	}

}
