package com.encapsulation;
import com.encapsulation.sport.*;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Sports sport = new Sports();
    Scanner scanner = new Scanner(System.in);
    System.out.print("enter the game id:");
    sport.setSportId(scanner.nextInt());
    System.out.print("enter game name:");
    sport.setSportName(scanner.next());
    System.out.print("enter total players:");
    sport.setTotalPlayer(scanner.nextInt());

    System.out.println();
    System.out.println("Sports Details:");
    System.out.println("Sport id:" + sport.getSportId());
    System.out.println("Sport Name:" + sport.getSportName());
    System.out.println("total Player:" + sport.getTotalPlayer());
  }


}

