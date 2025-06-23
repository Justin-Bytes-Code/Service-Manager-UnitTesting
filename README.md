# Service Manager Unit Testing
This was a medium-level assignment where I took on the role of a back-end software engineer developing part of a mobile application. In this project, I independently built and tested three of the client’s core services: Contact, Task, and Appointment; using Junit Testing. Each service is modular, allowing it to be swapped or modified easily, while consistently following standard validation procedures to ensure data integrity.

---
**It Includes:**

- Documentation going behind the scenes talking about the thought process.
- Modular testing for each service offered
- Comments inside code explaining each line
- Junit Testing 

*Contact Service*
- Unique Identfication
- Immutatable Contact ID
- Create Contacts
- Changes Contacts
- Erases Contacts
- Input Validation
- Data Storage
- OOP
- Modular
- JUnit Testing

*Task Service* 
- Data Storage
- Input Validation
- Updatable Information
- Immutatable Task ID
- Create Task
- Create Task Descriptions
- Delete Task
- OOP
- Modular
- JUnit Testing

*Appointment Service*
- Unique Identfication
- Immutatable Appointment ID
- Input Validation
- Create Appointments
- Create Appointment Descriptions
- Create Appointment Dates
- Delete Appointments
- OOP
- Modular
- JUnit Testing

---
**Rubric 1**

Competency
In this project, you will demonstrate your mastery of the following competency:

Create unit tests using code to uncover errors
Scenario
You are a software engineer for Grand Strand Systems, a software engineering company that focuses on developing and testing back-end services. You’ve been given an assignment to develop a mobile application for a customer. The customer will provide you with the requirements. Your job is to code up the application and provide unit tests to verify that it meets the customer’s requirements. You will be delivering the contact, task, and appointment services. The purpose of these services is to add, update, and delete contact, task, and appointment objects within the application.

Directions
ContactService, TaskService, and AppointmentService Files
For this assignment, you will incorporate the code and unit tests that you have developed for the mobile application. First, you developed the contact service and contact object, which you completed in the Module Three milestone. Second, you developed the task service and task object, which you completed in the Module Four milestone. Last, you developed the appointment service and appointment object, which you completed in Module Five milestone. Any feedback received on these assignments should be incorporated prior to submitting the files for this final project.

You have been asked to code up a mobile application for a client and provide unit tests to verify that it meets the customer’s requirements. In order to do so, you must complete the following:

Contact Service: In the Module Three milestone, you developed the contact service. The contact service used in-memory data structures to support storing contacts (no database required). In addition, there was no UI for this assignment. You verified the contact service through JUnit tests. The contact service contained a contact object along with the contact service. The requirements were as follows:
Contact Class Requirements
The contact object shall have a required unique contact ID String that cannot be longer than 10 characters. The contact ID shall not be null and shall not be updatable.
The contact object shall have a required firstName String field that cannot be longer than 10 characters. The firstName field shall not be null.
The contact object shall have a required lastName String field that cannot be longer than 10 characters. The lastName field shall not be null.
The contact object shall have a required phone String field that must be exactly 10 digits. The phone field shall not be null.
The contact object shall have a required address field that must be no longer than 30 characters. The address field shall not be null.
Contact Service Requirements
The contact service shall be able to add contacts with unique ID.
The contact service shall be able to delete contacts per contactId.
The contact service shall be able to update contact fields per contactId. The following fields are updatable:
firstName
lastName
PhoneNumber
Address
Task Service: In the Module Four milestone, you developed the task service. The task service used in-memory data structures to support storing tasks (no database required). In addition, there was no UI for this assignment. You verified the task service through JUnit tests. The task service contained a task object along with the task service. The requirements were as follows:
Task Requirements
The task object shall have a required unique task ID String that cannot be longer than 10 characters. The task ID shall not be null and shall not be updatable.
The task object shall have a required name String field that cannot be longer than 20 characters. The name field shall not be null.
The task object shall have a required description String field that cannot be longer than 50 characters. The description field shall not be null.
Task Service Requirements
The task service shall be able to add tasks with a unique ID.
The task service shall be able to delete tasks per taskId.
The task service shall be able to update task fields per taskId. The following fields are updatable:
name
description
Appointment Service: In the Module Five milestone, you developed the appointment service. The appointment service used in-memory data structures to support storing appointments (no database required). In addition, there was no UI for this assignment. You verified the appointment service through JUnit tests. The appointment service contained an appointment object along with the appointment service. The requirements were as follows:
Appointment Requirements
The appointment object shall have a required unique appointment ID String that cannot be longer than 10 characters. The appointment ID shall not be null and shall not be updatable.
The appointment object shall have a required appointment Date field. The appointmentDate field cannot be in the past. The appointmentDate field shall not be null. Note: Use java.util.Date for the appointmentDate field and use before(new Date()) to check if the date is in the past.
The appointment object shall have a required description String field that cannot be longer than 50 characters. The description field shall not be null.
Appointment Service Requirements
The appointment service shall be able to add appointments with a unique appointmentId.
The appointment service shall be able to delete appointments per appointmentId.
Specifically, the following rubric criteria must be addressed:

Verify the Contact class meets the requirements through JUnit tests.
Verify the ContactService class meets the requirements through JUnit tests.
Verify the Task class meets the requirements through JUnit tests.
Verify the TaskService class meets the requirements through JUnit tests.
Verify the Appointment class meets the requirements through JUnit tests.
Verify the AppointmentService class meets the requirements through JUnit tests.
Ensure the test coverage for the java files has 80% coverage or higher.
What to Submit
To complete this project, you must submit a ZIP folder containing the following deliverables:

ContactService, TaskService, and AppointmentService Files

ContactService
Contact.java
ContactService.java
ContactTest.java
ContactServiceTest.java
TaskService
Task.java
TaskService.java
TaskTest.java
TaskServiceTest.java
AppointmentService
Appointment.java
AppointmentService.java
AppointmentTest.java
AppointmentServiceTest.java

---
**Rubric 2**

Competencies
In this project, you will demonstrate your mastery of the following competencies:

Analyze various approaches to software testing based on requirements
Apply appropriate testing strategies to meet requirements
Scenario
You are a software engineer for Grand Strand Systems, a software engineering company that focuses on developing and testing back-end services. You recently completed an assignment in which you developed a mobile application for a customer and delivered the contact, task, and appointment services (Project One).

You will now construct a summary and reflections report to be submitted to your supervisor that summarizes your unit testing approach, your experience writing the JUnit tests, and the overall quality of your JUnit tests. This report will also highlight testing techniques and the mindset you adopted while working on this project.

Directions
Summary and Reflections Report
Your supervisor has asked that you submit a follow-up summary and reflections report to explain how you analyzed various approaches to software testing based on requirements and applied appropriate testing strategies to meet requirements while developing the mobile application for the customer. This report should be based on your experience completing Project One. You must complete the following:

Summary
Describe your unit testing approach for each of the three features.
To what extent was your approach aligned to the software requirements? Support your claims with specific evidence.
Defend the overall quality of your JUnit tests. In other words, how do you know your JUnit tests were effective based on the coverage percentage?
Describe your experience writing the JUnit tests.
How did you ensure that your code was technically sound? Cite specific lines of code from your tests to illustrate.
How did you ensure that your code was efficient? Cite specific lines of code from your tests to illustrate.
Reflection
Testing Techniques
What were the software testing techniques that you employed in this project? Describe their characteristics using specific details.
What are the other software testing techniques that you did not use for this project? Describe their characteristics using specific details.
For each of the techniques you discussed, explain the practical uses and implications for different software development projects and situations.
Mindset
Assess the mindset that you adopted working on this project. In acting as a software tester, to what extent did you employ caution? Why was it important to appreciate the complexity and interrelationships of the code you were testing? Provide specific examples to illustrate your claims.
Assess the ways you tried to limit bias in your review of the code. On the software developer side, can you imagine that bias would be a concern if you were responsible for testing your own code? Provide specific examples to illustrate your claims.
Finally, evaluate the importance of being disciplined in your commitment to quality as a software engineering professional. Why is it important not to cut corners when it comes to writing or testing code? How do you plan to avoid technical debt as a practitioner in the field? Provide specific examples to illustrate your claims.
What to Submit
To complete this project, you must submit the following:

Summary and Reflections Report
Your summary and reflections report should be a 3- to 4-page Word document with 12-point Times New Roman font, double spacing, and one-inch margins. Sources should be cited according to APA style.

---
**Questions**

(You don't have to read this. This is only for a homework assignment with this repository) 

How can I ensure that my code, program, or software is functional and secure?

- Write thotough Unit Test that cover all inputs and edge cases.
- Sanatize user input to avoid malicious data.
- Follow standard coding practices.
- Use Immutability for fields like IDS to prevent changes.
- Plugins like OWASP to ensure no vunerabilities would be found.
- Have others check your code as well as refactor your own code often.

How do I interpret user needs and incorporate them into a program?

- First I gather all requirements of the client as they need to be happy with the final product for it to be accepted.
- I then clarify the requirements and ask questions that I have to ensure that I have the correct requirements they want.
- Breakdown the requirements into smaller features.
- Translate those needs into functionalities.
- Iterate with the feedback they provide me so I can refine the program.

How do I approach designing software?

- First understand and be open to ask questions to the client about requirements of the software. Thoughout the creation project this will be a constant back and forth asking what requirements they will like as well as to ensure they are satified.
- Modularlity should always be the goal so if a issue arrives in the future it can quickly be dealt with and swapped out or disabled.
- Security should be thought of as early as possible as well as using plugins like OWASP.
- Reusing code will save time and save on resources if able too.
- Planning for expandabilty. Every Line should be able to be expanded on.
- Unit testing to speed up delievery of products. 
