import BigInteger;

public class Test {
    
    public static void main(String[] args) {
	
	BigInteger x = new BigInteger("534523452342352345345435342552345234235234534545234523423523453454523452342352345345452345234235234534545234523423523453454523452342352345345452345234235234534545234523423523453454523452342352345345452345234235234534545234523423523453454523452342352345345452345234235234534545234523423523453454523452342352345345452345234235234534545234523423523453454523452342352345345452345234235234534545234523423523453454523452342352345345452345234235234534545234523423523453454523452342352345345452345234235234534545234523423523453454523452342352345345452345234235234534545234523423523453454111");
	BigInteger y = new BigInteger("534523452342352345345435342552345234235234534545234523423523453454523452342352345345452345234235234534545234523423523453454523452342352345345452345234235234534545234523423523453454523452342352345345452345234235234534545234523423523453454523452342352345345452345234235234534545234523");
	BigInteger z = new BigInteger("5345234523423523453454353425523452342352345345452345234235234534545234523423523453454523452342352345345452345234235234534545234523423523453454523452342352345345452345234235234534545234523423523453454523452342352345345452345234235234534545234523423523453454527356750693570693576093709357093576905760957609376093762411");

	System.out.println("0: " + x.divide(y));
	System.out.println("1: " + x.mod(y));
	System.out.println("2: " + x.modInverse(y));
	System.out.println("3: " + x.modPow(y, z));
	System.out.println("4: " + x.remainder(y));

/*
	System.out.println("1: " + z.abs());
	System.out.println("2: " + z.add(y));
	System.out.println("3: " + z.and(y));
	System.out.println("4: " + z.andNot(y));
	System.out.println("5: " + z.bitCount());
	System.out.println("6: " + z.bitLength());
	System.out.println("7: " + z.clearBit(2));
	System.out.println("8: " + z.compareTo(y));
	System.out.println("9: " + x.divide(y));
	System.out.println("A: " + z.equals(y));
	System.out.println("B: " + z.flipBit(3));
	System.out.println("C: " + z.gcd(y));
	System.out.println("D: " + z.getLowestSetBit());
	System.out.println("E: " + z.isProbablePrime(3));
	System.out.println("F: " + x.mod(y));
	System.out.println("G: " + x.modInverse(y));
	System.out.println("H: " + x.modPow(y, z));
	System.out.println("I: " + z.multiply(y));
	System.out.println("J: " + z.not());
	System.out.println("K: " + z.or(y));
	System.out.println("L: " + z.pow(4));
	System.out.println("M: " + x.remainder(y));
	System.out.println("N: " + z.setBit(2));
	System.out.println("O: " + z.shiftLeft(3));
	System.out.println("P: " + z.shiftRight(4));
	System.out.println("Q: " + x.subtract(y));
	System.out.println("R: " + z.testBit(4));
	System.out.println("S: " + z.xor(y));
*/
    }
}

