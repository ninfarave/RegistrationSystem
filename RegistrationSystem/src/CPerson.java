
public class CPerson {
	private String PersonId;
	private String PersonTypeId;
	private String PersonName;
	private String PersonEmail;
	private String PersonPhone;
	    
	public CPerson(){
		
	}
	
	 public CPerson(String PersonId,String PersonTypeId, String PersonName, String PersonEmail, String PersonPhone ){
         this.PersonId = PersonId;
         this.PersonTypeId = PersonTypeId;
         this.PersonName = PersonName;
         this.PersonEmail = PersonEmail;
         this.PersonPhone = PersonPhone;
	 }
	 
	 public String getPersonId() {
         return PersonId;
	 }
	 
	 public void setPersonId(String PersonId) {
	         this.PersonId = PersonId;
	 }
	 
	 public String getPersonName() {
         return PersonName;
	 }
	 
	 public void setPersonName(String PersonName) {
	         this.PersonName = PersonName;
	 }
	 public String getPersonTypeId() {
         return PersonTypeId;
	 }
	 
	 public void setPersonTypeId(String PersonTypeId) {
	         this.PersonTypeId = PersonTypeId;
	 }
	 
	 public String getPersonEmail() {
         return PersonEmail;
	 }
	 
	 public void setPersonEmail(String PersonEmail) {
	         this.PersonEmail = PersonEmail;
	 }
	 
	 public String getPersonPhone() {
         return PersonPhone;
	 }
	 
	 public void setPersonPhone(String PersonPhone) {
	         this.PersonPhone = PersonPhone;
	 }

}
