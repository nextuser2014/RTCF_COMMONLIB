/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rtcf.commonlib.enumeration;

/**
 *
 * @author atanzi
 */
public enum AISRotSide {

    ROT_RIGHT(0, "ROT RIGHT"),
    ROT_LEFT(1, "ROT LEFT"),
    ROT_NOT_VALID(2, "ROT NOT VALID"),
    ROT_NOT_TURNING(3, "ROT NOT TURNING");

    private AISRotSide(int value, String abbreviation) {
        this.abbreviation = abbreviation;
        this.int_value = value;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public int getIntValue() {
        return int_value;
    }
    private String abbreviation;
    private int int_value;
}
