package com.cg.hibernate_demo1;

public class Employee {
		private int id;
		private String name;
		private String email;
		public int getId() {
			return id;
		}
		
		public Employee() {
			super();
			// TODO Auto-generated constructor stub
		}

		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		@Override
		public String toString() {
			return "Employee [id=" + id + ", name=" + name + ", email=" + email + "]";
		}
		
		
		
		
}
