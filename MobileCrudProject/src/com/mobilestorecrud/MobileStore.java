package com.mobilestorecrud;

import java.util.Scanner;

public class MobileStore {

	static Scanner sc = new Scanner(System.in);
	static int mobileCount;

	public static void addMoblie(Mobile m) {
		System.out.println("Enter moblie Id:");
		m.setMid(sc.nextInt());
		System.out.println("Enter moblie name:");
		m.setName(sc.next());

		System.out.println("Enter moblie Brand:");
		m.setBrand(sc.next());

		System.out.println("Enter Price:");

		m.setPrice(sc.nextFloat());
	}

	public static void deleteMoblie(Mobile m[], int rid) {
		boolean flag = false;

		for (int i = 0; i < mobileCount; i++) {
			if (m[i].getMid() == rid) {
				flag = true;

				System.out.println(m[i].getName());

				for (int j = i; j < mobileCount - 1; j++) {
					m[j] = m[j + 1];

				}
				m[mobileCount - 1] = null;
				mobileCount = mobileCount - 1;
				System.out.println("moblie deleted succesfully");
				break;
			}
		}

		if (!flag)
			System.out.println("moblie not found");

	}

	public static void updateMoblie(Mobile m[], int rid) {
		boolean flag = false;

		for (int i = 0; i < mobileCount; i++) {
			if (m[i].getMid() == rid) {
				flag = true;
				System.out.println("enter updated price");
				m[i].setPrice(sc.nextFloat());
				System.out.println(m[i]);

				System.out.println("Moblie updated succesfully");
				break;

			}
		}

		if (!flag)
			System.out.println("Mobile is not found");
	}

	public static void viewAllMobile(Mobile[] m) {

		/*
		 * for (int i = 0; i < mobileCount; i++) { System.out.println(m[i]); }
		 */
		System.out.println("================================================");
		System.out.println("--------------Mobile List-----------------");
		System.out.println("//////////////////////////////////////////////////");

		for (Mobile a : m) {

			System.out.println(a);

		}
	}

	public static void viewMobliceByBrand(Mobile m[], String rname) {
		boolean flag = false;

		for (int i = 0; i < mobileCount; i++) {
			if (m[i].getBrand().equals(rname)) {
				flag = true;
				System.out.println("mobile details are:");
				System.out.println(m[i]);

			}
		}

		if (!flag)
			System.out.println("mobile not found");
	}

	public static void main(String[] args) {

		Mobile m1[] = new Mobile[3];
		int choice;
		String ch;
		do {
			System.out.println("---------------Moblile Store-----------------------");
			System.out.println("1.Add a Mobile");
			System.out.println("2.Delete a Mobile");
			System.out.println("3.Update a Mobile");
			System.out.println("4.View Mobile by Brand");
			System.out.println("5.View All moblile");

			choice = sc.nextInt();
			switch (choice) {
			case 1:
				if (mobileCount < m1.length) {
					m1[mobileCount] = new Mobile();
					addMoblie(m1[mobileCount]);
					mobileCount++;
				} else {
					System.out.println("No more registrations can be done");
				}
				break;
			case 2:
				System.out.println("Enter moblile id to be deleted:");
				int rid = sc.nextInt();
				deleteMoblie(m1, rid);
				break;
			case 3:
				System.out.println("Enter the moblile id to be updated:");
				rid = sc.nextInt();
				updateMoblie(m1, rid);
				break;
			case 4:
				System.out.println("Enter the Brand :");
				String rname = sc.next();
				viewMobliceByBrand(m1, rname);
				break;
			case 5:
				viewAllMobile(m1);
				break;

			default:
				System.out.println("Please input valid case");

			}
			System.out.println("Do you want to perform more operation(yes/no)");
			ch = sc.next();
		} while (ch.equalsIgnoreCase("yes"));
		while (ch.equalsIgnoreCase("no")) {
			System.out.println("Thamku for mobile operation");
			break;
		}
	}
}
