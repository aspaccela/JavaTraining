package main.java.org.lisboa.actions;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

import main.java.org.lisboa.beans.Petition;

@ManagedBean(name="petitionAction")
public class PetitionActionBean {
	
	@ManagedProperty(value="#{petition}")
	private Petition petition;
	
	public void submitPetition() {
		
	}

	public Petition getPetition() {
		return petition;
	}

	public void setPetition(Petition petition) {
		this.petition = petition;
	}

}
