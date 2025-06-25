package JavaBasicCodes;
import java.math.BigInteger;

public class IBANGenerator {
    public static void main(String[] args) {
        IBANGenerator ig = new IBANGenerator();
        System.out.println(ig.generateIBANNummer("1234567890","70090100"));
    }

    public String generateCheckSum(String kontoNummer, String bankleitZahl){
        kontoNummer = String.format("%10s", kontoNummer).replace(' ', '0');
        String combined=  bankleitZahl + kontoNummer+ "131400";
        long remained = new BigInteger(combined).mod(java.math.BigInteger.valueOf(97)).longValue();
        long checksum= 98 -remained;
        return (checksum<10? "0" : " ")+checksum;

    }

    public String generateIBANNummer(String kontoNummer, String bankleitZahl){
        String checkSum= generateCheckSum(kontoNummer, bankleitZahl);
        return "DE"+checkSum+bankleitZahl+kontoNummer;
    }
}
