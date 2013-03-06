/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package rtcf.commonlib.enumeration;


/**
 *
 * @author sbarbati
 */
public enum TrackStatus implements java.io.Serializable {
    NORMAL("Norm"),
    STALE("Stale"),
    DROP("Drop"),
    DROP_ON_CORRELATION("Drop on correlation");

 private TrackStatus(String abbreviation) {this.abbreviation = abbreviation;}
 public String getAbbreviation() { return abbreviation; }
 private String abbreviation;
}
