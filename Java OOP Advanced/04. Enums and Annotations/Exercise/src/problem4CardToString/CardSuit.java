package problem4CardToString;

enum CardSuit {
    CLUBS(0),
    DIAMONDS(13),
    HEARTS(26),
    SPADES(39);

    private Integer power;

    private CardSuit(Integer power) {
        this.setPower(power);
    }

    Integer getPower() {
        return this.power;
    }

    private void setPower(Integer power) {
        this.power = power;
    }
}