class BigIntegerConverter {

    /**
     * @param number string representing the number
     * @return BigInteger instance
     */
    public static java.math.BigInteger getBigInteger(String number) {
        // Parse the input string into a BigInteger
        java.math.BigInteger bigInteger = new java.math.BigInteger(number);

        // Return the BigInteger instance
        return bigInteger;
    }

}