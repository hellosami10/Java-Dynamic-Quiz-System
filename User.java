class User extends Score {

		// User Class
		private String name;
		private String userid;
		private String userpass;

        
        public User() { }

        public User(String n, String uid, String upass) {
            this.name = n;
            this.userid = uid;
            this.userpass = upass;
        }



        public String getName() {
            return name;
        }

        public String getPass() {
            return userpass;
        }

        public String getId() {
            return userid;
        }               

}