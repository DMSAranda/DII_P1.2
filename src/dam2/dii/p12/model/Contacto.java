package dam2.dii.p12.model;

public class Contacto {

	private String name;
	private String surname;
	private String email;
	private String phone;
	private String comments;
	
	
		public Contacto(String name, String surname, String email, String phone, String comments) {
			super();
			this.name = name;
			this.surname = surname;
			this.email = email;
			this.phone = phone;
			this.comments = comments;
		}
		
		public String getName() {
			return name;
		}
		
		public void setName(String name) {
			this.name = name;
		}
		
		public String getSurname() {
			return surname;
		}
		
		public void setSurname(String surname) {
			this.surname = surname;
		}
		
		public String getEmail() {
			return email;
		}
		
		public void setEmail(String email) {
			this.email = email;
		}
		
		public String getPhone() {
			return phone;
		}
		
		public void setPhone(String phone) {
			this.phone = phone;
		}
		
		public String getComments() {
			return comments;
		}
		
		public void setComments(String comments) {
			this.comments = comments;
		}

	

	
}