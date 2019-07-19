package persistence.domain;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Members {
	
	public Integer getIdMember() {
		return idMember;
	}

	

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMoniker() {
		return moniker;
	}

	public void setMoniker(String moniker) {
		this.moniker = moniker;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Boolean getShowRealName() {
		return showRealName;
	}

	public void setShowRealName(Boolean showRealName) {
		this.showRealName = showRealName;
	}

	@Id
	@GeneratedValue
	private Integer idMember;
	private String firstName;
	private String lastName;
	private String moniker;
	private String email;
	private String password;
	private Boolean showRealName;
	
	public Members() {
		
	}
	


}
