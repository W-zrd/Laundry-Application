

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import Model.Transaksi;

public class TransaksiTest {
    @Test
    void testKiloanRegular() {
        Transaksi trans = new Transaksi("Kiloan", "Regular", 5);
        int expected = 30000;
        int actual = trans.getBiaya();
        assertEquals(expected, actual);
    }

    @Test
    void testKiloanExpress() {
        Transaksi trans = new Transaksi("Kiloan", "Express", 2);
        int expected = 20000;
        int actual = trans.getBiaya();
        assertEquals(expected, actual);
    }

    @Test
    void testKiloanKilat() {
        Transaksi trans = new Transaksi("Kiloan", "Kilat", 2);
        int expected = 24000;
        int actual = trans.getBiaya();
        assertEquals(expected, actual);
    }

    @Test
    void testSatuanRegular() {
        Transaksi trans = new Transaksi("Satuan", "Regular", 4);
        int expected = 20000;
        int actual = trans.getBiaya();
        assertEquals(expected, actual);
    }

    @Test
    void testSatuanExpress() {
        Transaksi trans = new Transaksi("Satuan", "Express", 4);
        int expected = 28000;
        int actual = trans.getBiaya();
        assertEquals(expected, actual);
    }

    @Test
    void testSatuanKilat() {
        Transaksi trans = new Transaksi("Satuan", "Kilat", 4);
        int expected = 36000;
        int actual = trans.getBiaya();
        assertEquals(expected, actual);
    }

}
