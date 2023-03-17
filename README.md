# Enhanced Employee Hierarchy

This project is a Java implementation of an enhanced employee hierarchy system. It consists of a set of classes that represent different types of employees, each with its own compensation model. The project demonstrates the use of inheritance, polymorphism, and interfaces in Java programming.

## Getting Started

To get started with the project, you need to have NetBeans and the Java Development Kit (JDK) installed on your computer. You can download NetBeans from the official website. JDK can be downloaded from the Oracle website.

## Usage

To use the project, simply clone the repository and open it in NetBeans. You can then run the EnhancedEmployeeHierarchy.java file to see the results.

The project consists of several classes:

Compensation: An interface that defines the earnings() and raise() methods.

CompensationModel: An abstract class that implements the Compensation interface and provides default implementations of the earnings() and raise() methods.

CommissionCompensationModel: A class that extends CompensationModel and represents an employee with a commission-based compensation model.

BasePlusCommissionCompensationModel: A class that extends CompensationModel and represents an employee with a base salary and commission-based compensation model.

SalariedCompensationModel: A class that extends CompensationModel and represents an employee with a fixed salary.

HourlyCompensationModel: A class that extends CompensationModel and represents an employee with an hourly wage.

The Employee class represents an employee and contains a reference to a compensation model object.

## Academic Integrity Statement
Please note that all work included in this project is the original work of the author, and any external sources or references have been properly cited and credited. It is strictly prohibited to copy, reproduce, or use any part of this work without permission from the author.

If you choose to use any part of this work as a reference or resource, you are responsible for ensuring that you do not plagiarize or violate any academic integrity policies or guidelines. The author of this work cannot be held liable for any legal or academic consequences resulting from the misuse or misappropriation of this work.

In summary, any unauthorized copying or use of this work may result in serious consequences, including but not limited to academic penalties, legal action, and damage to personal and professional reputation. Therefore, please use this work only as a reference and always ensure that you properly cite and attribute any sources or references used.
