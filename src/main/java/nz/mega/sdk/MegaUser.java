/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package nz.mega.sdk;

public class MegaUser {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected MegaUser(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(MegaUser obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  protected synchronized void delete() {   
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        megaJNI.delete_MegaUser(swigCPtr);
      }
      swigCPtr = 0;
    }
}

   MegaUser copy() {
    long cPtr = megaJNI.MegaUser_copy(swigCPtr, this);
    return (cPtr == 0) ? null : new MegaUser(cPtr, true);
  }

  public String getEmail() {
    return megaJNI.MegaUser_getEmail(swigCPtr, this);
  }

  public long getHandle() {
    return megaJNI.MegaUser_getHandle(swigCPtr, this);
  }

  public int getVisibility() {
    return megaJNI.MegaUser_getVisibility(swigCPtr, this);
  }

  public long getTimestamp() {
    return megaJNI.MegaUser_getTimestamp(swigCPtr, this);
  }

  public boolean hasChanged(int changeType) {
    return megaJNI.MegaUser_hasChanged(swigCPtr, this, changeType);
  }

  public int getChanges() {
    return megaJNI.MegaUser_getChanges(swigCPtr, this);
  }

  public int isOwnChange() {
    return megaJNI.MegaUser_isOwnChange(swigCPtr, this);
  }

  public MegaUser() {
    this(megaJNI.new_MegaUser(), true);
  }

  public final static int VISIBILITY_UNKNOWN = -1;
  public final static int VISIBILITY_HIDDEN = 0;
  public final static int VISIBILITY_VISIBLE = 1;
  public final static int VISIBILITY_INACTIVE = 2;
  public final static int VISIBILITY_BLOCKED = 3;

  public final static int CHANGE_TYPE_AUTHRING = 0x01;
  public final static int CHANGE_TYPE_LSTINT = 0x02;
  public final static int CHANGE_TYPE_AVATAR = 0x04;
  public final static int CHANGE_TYPE_FIRSTNAME = 0x08;
  public final static int CHANGE_TYPE_LASTNAME = 0x10;
  public final static int CHANGE_TYPE_EMAIL = 0x20;
  public final static int CHANGE_TYPE_KEYRING = 0x40;
  public final static int CHANGE_TYPE_COUNTRY = 0x80;
  public final static int CHANGE_TYPE_BIRTHDAY = 0x100;
  public final static int CHANGE_TYPE_PUBKEY_CU255 = 0x200;
  public final static int CHANGE_TYPE_PUBKEY_ED255 = 0x400;
  public final static int CHANGE_TYPE_SIG_PUBKEY_RSA = 0x800;
  public final static int CHANGE_TYPE_SIG_PUBKEY_CU255 = 0x1000;
  public final static int CHANGE_TYPE_LANGUAGE = 0x2000;
  public final static int CHANGE_TYPE_PWD_REMINDER = 0x4000;
  public final static int CHANGE_TYPE_DISABLE_VERSIONS = 0x8000;

}