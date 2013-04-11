/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package rtcf.commonlib.dto.rtcf;

import java.io.Serializable;
import rtcf.commonlib.enumeration.AISRotSide;

/**
 *
 * @author atanzi
 */
public class AisRot implements Serializable{
    private static final long serialVersionUID = 2702943488726574309L;
    
    private AISRotSide side = AISRotSide.ROT_NOT_TURNING;
    private float module;		//deg/sec

    public AisRot(){
    }

    public AisRot(AISRotSide side, float module){
        this.side = side;
        this.module = module;
    }

  /**
   * @return the side
   */
  public AISRotSide getSide() {
    return side;
  }

  /**
   * @param side the side to set
   */
  public void setSide(AISRotSide side) {
    this.side = side;
  }

  /**
   * @return the module
   */
  public float getModule() {
    return module;
  }

  /**
   * @param module the module to set
   */
  public void setModule(float module) {
    this.module = module;
  }

}
