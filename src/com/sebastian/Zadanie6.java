package com.sebastian;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Zadanie6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LocalDate nowDate = LocalDate.now();
        System.out.println("Podaj rok kursu");
        int year = scanner.nextInt();
        System.out.println("Podaj miesiac kursu");
        int month = scanner.nextInt();
        System.out.println("Podaj dzien kursu");
        int day = scanner.nextInt();

        LocalDate blockDate = LocalDate.of(year, month , day);

        Period timeToExam = Period.between(nowDate , blockDate);



        System.out.println("Czas do kursu to: " + timeToExam.toTotalMonths());
    }

    }

