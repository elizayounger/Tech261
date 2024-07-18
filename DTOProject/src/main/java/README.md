# Employee Data Processing and Storage

## Project Overview

This project involves reading employee data from a corrupted CSV file, parsing and cleaning the data, and then storing it in a MySQL database. Additionally, the project includes the creation of a Data Access Object (DAO) class for performing CRUD operations on the employee records in the database.

## Project Requirements

### Data Format

The employee data should adhere to the following format:
- **Emp ID**: Up to 6 digits
- **Prefix**
- **First Name**
- **Middle Initial**
- **Last Name**
- **Gender**: Stored as 'M' or 'F'
- **E Mail**: In standard email format
- **Date of Birth**: MM/DD/YYYY
- **Date of Joining**: MM/DD/YYYY
- **Salary**

### Data Corruption Handling

The following are considered data corruption and should be handled appropriately:
- Gender marked as 'X'
- Negative salary values
- Dates that are unrealistically far in the future
- Dates with incorrect leading zeros
- Invalid email formats

### Steps to Implement

1. **Read and Parse CSV File**:
    - Implement File I/O to read the CSV file.
    - Parse the data into a suitable data structure.

2. **Data Validation and Cleaning**:
    - Validate Emp ID, Prefix, First Name, Middle Initial, Last Name, Gender, Email, Date of Birth, Date of Joining, and Salary.
    - Log the number of corrupted records using a suitable logging mechanism.

3. **Database Setup**:
    - Create a new MySQL database and a table to store the employee data.
    - Choose appropriate data types for each column.

4. **Data Insertion**:
    - Insert the cleaned data into the MySQL database.

5. **DAO Class**:
    - Implement a DAO class to interact with the database and perform CRUD operations.

6. **Performance Optimization (Bonus)**:
    - Investigate methods to optimize the data insertion process for speed.

7. **Testing**:
    - Plan and execute tests for each component of the project.

## Detailed Implementation

### Step 1: Read and Parse CSV File

Implement file I/O operations to read the CSV file and parse the data. Use Python's built-in CSV module for reading and processing the file.

### Step 2: Data Validation and Cleaning

- **Gender**: Ensure gender is either 'M' or 'F'. Log any other values.
- **Salary**: Ensure salary is a non-negative value.
- **Dates**: Verify dates are in MM/DD/YYYY format and not unrealistically far in the future.
- **Emails**: Use regex to ensure emails are in a valid format. The pattern should allow dots in the first part of the email address.

### Step 3: Database Setup

- Create a MySQL database named `EmployeeDB`.
- Create a table named `Employees` with the following columns:
    - `EmpID`: INT(6)
    - `Prefix`: VARCHAR(5)
    - `FirstName`: VARCHAR(50)
    - `MiddleInitial`: CHAR(1)
    - `LastName`: VARCHAR(50)
    - `Gender`: CHAR(1)
    - `Email`: VARCHAR(100)
    - `DateOfBirth`: DATE
    - `DateOfJoining`: DATE
    - `Salary`: DECIMAL(10, 2)

### Step 4: Data Insertion

Use the MySQL connector for Python to insert the cleaned data into the database.

### Step 5: DAO Class

Implement a DAO class with methods for the following CRUD operations:
- **Create**: Insert a new employee record.
- **Read**: Retrieve employee records.
- **Update**: Update existing employee records.
- **Delete**: Delete employee records.

### Step 6: Performance Optimization (Bonus)

Investigate batch inserts and other optimizations to improve data insertion performance.

### Step 7: Testing

Develop a comprehensive testing plan that includes unit tests for:
- CSV file reading and parsing
- Data validation and cleaning
- Database operations (CRUD)

## Logging

Implement a logging mechanism to track:
- The number of corrupted records
- Errors encountered during file I/O, data validation, and database operations

## Conclusion

This project aims to efficiently read, clean, and store employee data from a corrupted CSV file into a MySQL database, ensuring data integrity and providing robust database interaction through a DAO class. Proper validation, logging, and testing are crucial for the successful implementation of this project.