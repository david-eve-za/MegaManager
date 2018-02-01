/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package nz.mega.sdk;

public class MegaContactRequestList {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected MegaContactRequestList(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(MegaContactRequestList obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  protected synchronized void delete() {   
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        megaJNI.delete_MegaContactRequestList(swigCPtr);
      }
      swigCPtr = 0;
    }
}

   MegaContactRequestList copy() {
    long cPtr = megaJNI.MegaContactRequestList_copy(swigCPtr, this);
    return (cPtr == 0) ? null : new MegaContactRequestList(cPtr, true);
  }

  public MegaContactRequest get(int i) {
    long cPtr = megaJNI.MegaContactRequestList_get(swigCPtr, this, i);
    return (cPtr == 0) ? null : new MegaContactRequest(cPtr, false);
  }

  public int size() {
    return megaJNI.MegaContactRequestList_size(swigCPtr, this);
  }

  public MegaContactRequestList() {
    this(megaJNI.new_MegaContactRequestList(), true);
  }

}