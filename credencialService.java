package employeemodel;

import java.util.Random;

public class credencialService {
 public static String generateEmailAdress(Employee employee) {
	 String department=employee.getDepartment().toLowerCase();
	 String firstname=employee.getFirstName().toLowerCase();
	 String lastname=employee.getLastName().toLowerCase();
	 String company="gl.com";
	 return firstname+lastname+"@"+department+company;
 }
 public static String setPassword() {
	 String Uppercase="ABCDEFGHIJKLMOPQRSTUVXYZ";
	 String lowercase="abcdefghijklmopqrstuvxyz";
	 String numbers="0123456789";
	 String specialChars = "!@#$%^&*()_+";
     String allChars = Uppercase + lowercase + numbers + specialChars;
     StringBuilder password = new StringBuilder();
     Random rand = new Random();
     password.append(Uppercase.charAt(rand.nextInt(Uppercase.length())));
     password.append(lowercase.charAt(rand.nextInt(lowercase.length())));
     password.append(numbers.charAt(rand.nextInt(numbers.length())));
     password.append(specialChars.charAt(rand.nextInt(specialChars.length())));
	 for (int i=4;i<12;i++) {
		 password.append(allChars.charAt(rand.nextInt(allChars.length())));
	 }
	 return password.toString();
 }
 public static void showCredentials(Employee employee) {
     String email = generateEmailAdress(employee);
     String password = setPassword();
     employee.setEmail(email);
     employee.setPassword(password);

     System.out.println("Employee Name: " + employee.getFirstName() + " " + employee.getLastName());
     System.out.println("Department: " + employee.getDepartment());
     System.out.println("Email: " + employee.getEmail());
     System.out.println("Password: " + employee.getPassword());
 }
}

