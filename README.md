# Contact Manager Application

## Description
The Contact Manager application allows users to manage their contacts. Users can register, log in, view their contacts, and add, update, or delete them. Administrators have the ability to manage all users and their contacts.

## Features ✨
- User registration and login 🔑
- Admin dashboard for managing users 🛠️
- Users can view, add, update, and delete their contacts 📱
- Role-based access control (Admin/User) 🔐
- Secure login system with session management 🛡️

## Technologies Used ⚙️
- **Backend**: Spring MVC, Spring JDBC
- **Frontend**: JSP, HTML, Bootstrap
- **Database**: MySQL 🗄️
- **Session Management**: HTTP session for user authentication and authorization.

## Setup Instructions 📝

```bash
git clone https://github.com/ShubhamKashyap45/contact-manager.git
```

### 2. Set up MySQL Database 🛠️

1. **Create MySQL Database `contact_manager`**: 

Example:

```sql
CREATE DATABASE contact_manager;
USE contact_manager;

-- Add the necessary tables
```

2. **Create the `users` Table**:  
This table stores user login details.

```sql
CREATE TABLE users (
    uid INT NOT NULL AUTO_INCREMENT,
    username VARCHAR(50) NOT NULL,
    password VARCHAR(50) NOT NULL,
    role VARCHAR(50) NOT NULL,
    PRIMARY KEY (uid)
)

```

3. **Create the `contact_details` Table**:  
This table stores contact information for each user.

```sql
CREATE TABLE contact_details (
    cid INT NOT NULL AUTO_INCREMENT,
    name VARCHAR(50) DEFAULT NULL,
    phoneno BIGINT DEFAULT NULL,
    email VARCHAR(30) NOT NULL,
    user_id INT DEFAULT NULL,
    PRIMARY KEY (cid),
    KEY fk_user_id (user_id),
    CONSTRAINT fk_user_id FOREIGN KEY (user_id) REFERENCES users (uid) ON DELETE CASCADE
) 
```

4. **Create the `user_details` Table**:  
This table stores additional details about the users, such as their name, age, gender, and phone number.

```sql
CREATE TABLE user_details (
    rid INT NOT NULL AUTO_INCREMENT,
    name VARCHAR(100) NOT NULL,
    age INT NOT NULL,
    gender VARCHAR(10) NOT NULL,
    userphone BIGINT NOT NULL,
    PRIMARY KEY (rid),
    UNIQUE KEY userphone (userphone)
) 
```

### 3. Configuration ⚙️

1. In your project, set up the `web.xml` and `spring-sevlet.xml` for Spring configuration, and connect to your MySQL database.

2. Update the `data.properties` (or a similar file for JDBC) with the correct database connection details:

```properties
jdbc.url=jdbc:mysql://localhost:3306/contact_manager
jdbc.username=root
jdbc.password=password
jdbc.driver=com.mysql.cj.jdbc.Driver
```
## 4. Views (JSP) 📄

- **loginpage.jsp**: Login page for user authentication.
- **contactlist.jsp**: Displays a list of contacts for the logged-in user.
- **addcontact.jsp**: Form to add a new contact.
- **editcontact.jsp**: Form to edit an existing contact.
- **registerationform.jsp**: Form for user registration.
- **userlist.jsp**: Admin page to manage users.
- **edituser.jsp**: Admin can edit/delete users.
- **index.jsp**: Displays the index page.

## 5. Web.xml Configuration 🖥️

Configure your `web.xml` for Spring MVC DispatcherServlet and servlet mapping:

```xml
<web-app ...>
    <servlet>
        <servlet-name>spring</servlet-name>
        <servlet-class>org.springframework.web.servlet.DispatcherServlet</servlet-class>
        <load-on-startup>1</load-on-startup>
    </servlet>

    <servlet-mapping>
        <servlet-name>spring</servlet-name>
        <url-pattern>/</url-pattern>
    </servlet-mapping>
    
    <welcome-file-list>
		<welcome-file>index.jsp</welcome-file>
	</welcome-file-list>

</web-app>
```

## 6. Controllers Overview

### 1. **LoginController**
Handles user authentication and login.

- **GET /security/login**: Displays the login page.
- **POST /security/validate**: Authenticates the user and redirects based on their role (admin/user).

### 2. **ContactController**
Manages contacts for users.

- **GET /contacts/getcontacts**: Retrieves and displays contacts for the logged-in user.
- **GET /contacts/addnewcontact**: Displays the form to add a new contact.
- **POST /contacts/insertcontact**: Adds a new contact to the user's contact list.
- **GET /contacts/editcontact/{cid}**: Displays the form to edit a contact.
- **POST /contacts/updatecontact**: Updates an existing contact.
- **GET /contacts/deletecontact/{cid}**: Deletes a contact.

### 3. **AdminController**
Manages user accounts for the admin.

- **GET /admin/dashboard**: Displays all users for the admin to manage.
- **GET /admin/edituser/{uid}**: Displays the form to edit a user.
- **POST /admin/updateuser**: Updates user details.
- **GET /admin/deleteuser/{uid}**: Deletes a user.

### 4. **RegisterController**
Handles user registration.

- **GET /registeration/register**: Displays the registration form.
- **POST /registeration/registeruser**: Registers a new user.

### 5. **LogoutController**
Handles user and admin logouts.

- **GET /logout/userlogout**: Logs out the user.
- **GET /logout/adminlogout**: Logs out the admin.

### 6. **TestController**
Displays a welcome page and a test message.

- **GET /**: Displays the welcome page.
- **GET /message**: Displays a test message.

## 7. Usage 🔧

### 1. Register a New User 📝
- Go to the registration page (`/registeration/register`).
- Fill in the registration form and submit.
- Login using your newly registered credentials.

### 2. User Dashboard 🖥️
After logging in, users are redirected to the contact list (`/contacts/getcontacts`).

Users can:
- View their contacts 📱
- Add new contacts ➕
- Edit existing contacts ✏️
- Delete contacts ❌

### 3. Admin Dashboard 🔧
Admins can access the dashboard at `/admin/dashboard`.

Admins can:
- View all users 👀
- Edit user details ✏️
- Delete users ❌

### 4. Login 🔑
- Use the login page (`/security/login`) to authenticate.
- Users and admins have different access levels based on their roles.

## Contributing 🤝

Feel free to fork the repository and create issues for bugs or feature requests. However, please note that pull requests will not be accepted, as this project is intended for personal use only.
