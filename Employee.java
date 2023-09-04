package employeemodel;

public class Employee {
        
			private String FirstName;
			private String LastName;
			private String Department;
			private String Email;
			private String Password;
			
			public Employee(String firstname,String lastname) {
				// TODO Auto-generated constructor stub
				this.FirstName=firstname;
				this.LastName=lastname;
				
			} 
			public String getFirstName() {
				return FirstName;
			}
			public void setFirstName(String firstName) {
				this.FirstName = firstName;
			}
			public String getLastName() {
				return LastName;
			}
			public void setLastName(String lastName) {
				this.LastName = lastName;
			}
			public String getDepartment() {
				return Department;
			}
			public void setDepartment(String department) {
				this.Department = department;
			}
			public String getEmail() {
				return Email;
			}
			public void setEmail(String email) {
				this.Email = email;
			}
			public String getPassword() {
				return Password;
			}
			public void setPassword(String password) {
				this.Password = password;
			}
			
			
}
