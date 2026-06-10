# Cucumber BDD Framework

This repository contains a Cucumber BDD (Behavior-Driven Development) framework for automated testing.
The framework is designed to facilitate the creation and execution of test scenarios using Cucumber's Gherkin syntax.
It consists of feature files, step definitions, and support code to enable efficient test automation.

---

## Tools & Technologies
- Cucumber: BDD framework used to map Gherkin feature files to step definitions and glue code.
- Gherkin: Human-readable language for writing features and scenarios (Given/When/Then).
- Selenium (Java): Browser automation library used to interact with web pages in tests.
- Page Object Model (POM) design: Organizes UI interactions into page classes to keep tests maintainable and readable.

Repository structure (diagram)

```
Cucumber_BDD/
├─ pom.xml
├─ README.md
├─ src/
│  ├─ main/
│  │  ├─ java/
│  │  │  ├─ pages/
│  │  │  │  ├─ AdminPanelPage.java
  │  │  │  ├─ BasePage.java
  │  │  │  ├─ DashboardPage.java
  │  │  │  └─ LoginPage.java
  │  │  ├─ Runner/
+│  │  │  ├─ Steps/
  │  │  │  │  └─ stepDef.java
  │  │  └─ utils/
  │  │     └─ BrowserFactory.java
  │  └─ resources/
  │     └─ Features/
  │        └─ createGroup.feature
  └─ test/
	 └─ java/

```


## Getting started / run

1. Ensure Java JDK and Maven are installed and available on your PATH.
2. From the repository root run (PowerShell / CMD):

```powershell
mvn clean test
```


Summary

This project implements a Cucumber BDD test automation framework in Java using Selenium WebDriver for browser automation.
Feature files are written in Gherkin and mapped to Java step definitions. The code follows the Page Object Model (POM) design pattern:
each page interaction is encapsulated in a page class (located under `src/main/java/pages`) and shared utilities, such as `BrowserFactory`,
are stored under `src/main/java/utils`.



