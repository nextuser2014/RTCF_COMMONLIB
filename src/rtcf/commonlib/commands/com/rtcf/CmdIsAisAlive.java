package rtcf.commonlib.commands.com.rtcf;

import java.io.Serializable;
import rtcf.commonlib.enumeration.CssState;

/**
 *
 * @author mcappellanti
 */
public class CmdIsAisAlive extends CmdIsAlive implements Serializable {
  private static final long serialVersionUID = 6580925325123215771L;

  public CmdIsAisAlive(String name, CssState status, Long progId) {
		super(name, status, progId);
	}
}
