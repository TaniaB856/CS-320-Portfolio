# CS 320 Portfolio Artifact

## About This Repository
This repository contains portfolio artifacts from **CS 320: Software Testing, Automation, and Quality Assurance** at Southern New Hampshire University.  

From **Project One**, I have included the contact service implementation and related unit tests:
- `Contact.java`
- `ContactService.java`
- `ContactTest.java`
- `ContactServiceTest.java`

From **Project Two**, I have included my **Summary and Reflections Report** (`7-2 Project Two.docx`), which describes my testing approach and how I applied different strategies to meet software requirements.

Together, these artifacts demonstrate my ability to:
- Create unit tests using JUnit to uncover and prevent errors  
- Apply automation and testing strategies based on software requirements  
- Ensure software functionality and maintain quality through validation and testing  

---

## Reflection

### How can I ensure that my code, program, or software is functional and secure?
I ensure functionality and security by combining proper design, testing, and validation. Automated unit testing with JUnit allows me to verify that each method behaves correctly under various conditions. I also implement strict input validation to prevent invalid or malicious data from entering the system. For example, in my Contact Service, I limited field lengths, required non-null values, and prohibited editing of immutable fields such as the contact ID. These practices strengthen both software functionality and security.

### How do I interpret user needs and incorporate them into a program?
I start by reviewing requirements and translating them into specific, testable behaviors. For instance, when users needed a way to manage contacts, I broke that down into smaller requirements like “each contact must have a unique ID” and “the phone number must be 10 digits.” I then implemented logic that met those exact needs and wrote JUnit tests to confirm that the program behaves correctly when valid and invalid inputs are used. This approach ensures that user needs are met while keeping the software reliable and consistent.

### How do I approach designing software?
My approach is to design with clarity and testability in mind. I separate responsibilities into different classes, use meaningful method names, and make sure each class does one job well. For example, the `Contact` class defines the data structure, while `ContactService` manages operations like adding, updating, and deleting contacts. I also write my tests while designing to confirm that each function works as expected. This modular design makes it easier to maintain, scale, and test.

---

## Instructor Access
My instructor has been added as a collaborator on this repository for review and grading.  

---

**Author:** Tania B.
**Course:** CS 320 – Software Testing, Automation, and Quality Assurance  
**Instructor:**  Dr. Robert Nardelli
**Term:** October 2025
