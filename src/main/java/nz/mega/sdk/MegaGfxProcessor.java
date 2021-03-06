/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package nz.mega.sdk;

public class MegaGfxProcessor {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected MegaGfxProcessor(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(MegaGfxProcessor obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  protected synchronized void delete() {   
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        megaJNI.delete_MegaGfxProcessor(swigCPtr);
      }
      swigCPtr = 0;
    }
}

  protected void swigDirectorDisconnect() {
    swigCMemOwn = false;
    delete();
  }

  public void swigReleaseOwnership() {
    swigCMemOwn = false;
    megaJNI.MegaGfxProcessor_change_ownership(this, swigCPtr, false);
  }

  public void swigTakeOwnership() {
    swigCMemOwn = true;
    megaJNI.MegaGfxProcessor_change_ownership(this, swigCPtr, true);
  }

  public boolean readBitmap(String path) {
    return (getClass() == MegaGfxProcessor.class) ? megaJNI.MegaGfxProcessor_readBitmap(swigCPtr, this, path) : megaJNI.MegaGfxProcessor_readBitmapSwigExplicitMegaGfxProcessor(swigCPtr, this, path);
  }

  public int getWidth() {
    return (getClass() == MegaGfxProcessor.class) ? megaJNI.MegaGfxProcessor_getWidth(swigCPtr, this) : megaJNI.MegaGfxProcessor_getWidthSwigExplicitMegaGfxProcessor(swigCPtr, this);
  }

  public int getHeight() {
    return (getClass() == MegaGfxProcessor.class) ? megaJNI.MegaGfxProcessor_getHeight(swigCPtr, this) : megaJNI.MegaGfxProcessor_getHeightSwigExplicitMegaGfxProcessor(swigCPtr, this);
  }

  public int getBitmapDataSize(int width, int height, int px, int py, int rw, int rh) {
    return (getClass() == MegaGfxProcessor.class) ? megaJNI.MegaGfxProcessor_getBitmapDataSize(swigCPtr, this, width, height, px, py, rw, rh) : megaJNI.MegaGfxProcessor_getBitmapDataSizeSwigExplicitMegaGfxProcessor(swigCPtr, this, width, height, px, py, rw, rh);
  }

  public boolean getBitmapData(byte[] bitmapData) {
    return (getClass() == MegaGfxProcessor.class) ? megaJNI.MegaGfxProcessor_getBitmapData(swigCPtr, this, bitmapData) : megaJNI.MegaGfxProcessor_getBitmapDataSwigExplicitMegaGfxProcessor(swigCPtr, this, bitmapData);
  }

  public void freeBitmap() {
    if (getClass() == MegaGfxProcessor.class) megaJNI.MegaGfxProcessor_freeBitmap(swigCPtr, this); else megaJNI.MegaGfxProcessor_freeBitmapSwigExplicitMegaGfxProcessor(swigCPtr, this);
  }

  public MegaGfxProcessor() {
    this(megaJNI.new_MegaGfxProcessor(), true);
    megaJNI.MegaGfxProcessor_director_connect(this, swigCPtr, swigCMemOwn, true);
  }

}
