class convert {
    public static void main(String[] args) {
        String bin = "1101";
        int decimal = Integer.parseInt(bin, 2);
        String octal = Integer.toOctalString(decimal);
        System.out.print("Decimal = " + decimal);
        System.out.print(" Octal = " + octal);
    }
}
