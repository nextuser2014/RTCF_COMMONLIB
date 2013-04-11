/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rtcf.commonlib.commands.com.rtcf;

import java.io.Serializable;
import rtcf.commonlib.commands.RtcfCommandMessage;

/**
 *
 * @author atanzi
 */
public class CmdUpdateAisSettings extends RtcfCommandMessage implements Serializable{
    private static final long serialVersionUID = 3246939151160508940L;

    private double longitudeCentre;		//rad
    private double latitudeCentre;		//rad
    private double range;				//m

    public CmdUpdateAisSettings(double longitudeCentre, double latitudeCentre, double range) {
        super();
        this.longitudeCentre = longitudeCentre;
        this.latitudeCentre = latitudeCentre;
        this.range = range;
    }

    public double getLongitudeCentre() {
        return longitudeCentre;
    }

    public double getLatitudeCentre() {
        return latitudeCentre;
    }

    public double getRange() {
        return range;
    }
}
