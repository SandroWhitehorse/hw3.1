package com.trylabs;

import java.util.Scanner;

import static java.lang.Math.*;

public class Main {

    public static void main(String[] args) {
	System.out.println("введите граничные значения интервала [a;b] и шаг h");
	Scanner scanner = new Scanner(System.in);
	int a = scanner.nextInt();
	int b = scanner.nextInt();
	int h = scanner.nextInt();
	double x;
	for (x=a;x<=b;x+=h)
    { System.out.println(x+" " +(x- sin(x)));
    }
    for (x=a;x<=b;x+=h)
	{ System.out.println(sin(x)*sin(x));
	}
	for (x=a;x<=b;x+=h)
		{ System.out.println(2*cos(x)-1	);
		}







	}
}
