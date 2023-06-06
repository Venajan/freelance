package ru.netology.services;

import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;
// import ru.netology.FreelanceCalc;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;


public class FreelanceCalcTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/freelance.csv")

    public void testCashTen(int expected, int income, int expenses, int threshold) {

        FreelanceCalc service = new FreelanceCalc();
        //int expected = 3;
        //int income = 10_000; // доход
        //int expenses = 3_000; // расходы
        //int threshold = 20_000; // минимальная сумма для отдыха
        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }

    // @Test

    //public void testCashHundred() {

    //    FreelanceCalc service = new FreelanceCalc();
    //    int expected = 2;
    //    int income = 100_000; // доход
    //    int expenses = 60_000; // расходы
    //    int threshold = 150_000; // минимальная сумма для отдыха
    //    int actual = service.calculate(income, expenses, threshold);

    //   Assertions.assertEquals(expected, actual);
    //}
}