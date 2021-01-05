public class TypeDataNumber {
    public static void main(String[] args) {

      byte iniByte = 127;  // -128 Sampai  127
      short iniShort = 1000; // -32768 sampai 32767
      int iniInteger = 32334; // -2147483648 sampai 2147483647
      long iniLong = 12345678934234L;  // -9223372036854775808   sampai 9223372036854775807


        int decimalInt = 34;
        int hexDecimal = 0x23FF;
        int binarDecimal = 0b10100011;


        // Literasi Under Scor

        int amount = 1_000_000;

        // Widening Casting = byte -> short -> int -> long -> float -> doubel

        byte iniBytes = 10;
        short iniShorts = iniBytes;

        // nowring Casting Kebalikan nya dari Widenning Casting

        float iniFloat2 = (float) iniInteger;


      System.out.println(iniShort);
    }
}
