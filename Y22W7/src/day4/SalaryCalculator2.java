package day4;

import java.text.NumberFormat;
import java.util.Scanner;

public class SalaryCalculator2 {
	final double personalAllowance = 4000;
	final double laborMarketContributionsPercent = 0.08;
	final double salaryPerHour = 200;
	final double overTimeFactor = 1.5;
	final double weekFullTime = 40;
	double hoursWorkedPerWeek = 0;
	double netSalary;
	double grossSalary = 0;
	double grossSalaryTaxable;
	double laborMarketContributions;
	double aTax;
	String municipality;
	Scanner in = new Scanner(System.in);
	NumberFormat fmt = NumberFormat.getCurrencyInstance();
	
	public void userInputHours() {
		while (hoursWorkedPerWeek < weekFullTime) {
			System.out.print("How many hours have you worked: ");
			hoursWorkedPerWeek = in.nextDouble();
			in.nextLine();
			
			if (hoursWorkedPerWeek < weekFullTime) {
				System.out.printf("\nYou need to at least work full-time: %.0fh\n", weekFullTime);
			}
		}
	}
	
	public void calculateGrossSalary() {
		// Gross salary for overwork
		if (hoursWorkedPerWeek > weekFullTime) {
			grossSalary += (hoursWorkedPerWeek - weekFullTime) * salaryPerHour * overTimeFactor;
		}
		// Gross salary for "normal work"
		grossSalary += hoursWorkedPerWeek * salaryPerHour;
	}
	
	public void printWorkerSchedule() {
		System.out.println(" - Weekly gross salary: " + fmt.format(grossSalary));
		System.out.println(" -       Hourly salary: " + fmt.format(salaryPerHour));
		System.out.printf(" -        Hours worked: %.0fh\n", hoursWorkedPerWeek);
		if (hoursWorkedPerWeek > weekFullTime) {
			System.out.printf(" -      hours overtime: %.0fh at %s pr hour\n", (hoursWorkedPerWeek - weekFullTime), fmt.format(salaryPerHour * overTimeFactor));
		}
	}
	
	
	public void printGrossSalary() {
		System.out.println("\n# Your salary #");
		System.out.printf("%-20s%20s\n", "Gross salary:", fmt.format(grossSalary));
	}
	
	public void printNet() {
		System.out.printf("%-20s%20s\n", "Net salary:", fmt.format(netSalary));
		System.out.println("-".repeat(40));
		System.out.printf("%-20s%20s\n", "A-tax:", fmt.format(aTax));
		System.out.printf("%-20s%20s\n", "am-contribution", fmt.format(laborMarketContributions));
	}
	
	public void userInputmunicipality() {
		System.out.print("\nWhich municipality do you belong to? You can choose between [k1], [k2], [k3] with 20%, 25%, 30% tax: ");
		municipality = in.nextLine();
	}
	
	public void calculateNet() {
		// labor market contributions
		laborMarketContributions = grossSalary * laborMarketContributionsPercent;
		
		// --- A-tax ---
		// Only positive numbers
		if (grossSalary >= personalAllowance) {
			grossSalaryTaxable = grossSalary - personalAllowance;
		} else {
			grossSalaryTaxable = 0;
		}
		
		// income tax of A-tax
		if (grossSalary <= 10_000) {
			aTax = 0.05 * grossSalaryTaxable;
		} else if (grossSalary <= 20_000) {
			aTax = 0.10 * grossSalaryTaxable;
		} else { // grossSalary > 40_000
			aTax = 0.15 * grossSalaryTaxable;
		}
		
		// municipality tax of A-tax
		switch (municipality) {
			case "k1" -> aTax += 0.20 * grossSalaryTaxable;
			case "k2" -> aTax += 0.25 * grossSalaryTaxable;
			case "k3" -> aTax += 0.30 * grossSalaryTaxable;
			default -> {
				aTax += 0.30 * grossSalaryTaxable;
				System.out.printf("Selection %S not available defaults to 30%%\n", municipality);
			}
		}
		
		netSalary = grossSalary - (aTax + laborMarketContributions);
	}
	
	public static void main(String[] args) {
		SalaryCalculator2 s = new SalaryCalculator2();
		s.userInputHours();
		s.calculateGrossSalary();
		s.printWorkerSchedule();
		s.userInputmunicipality();
		s.calculateNet();
		s.printGrossSalary();
		s.printNet();
	}
}

