package org.gdal.ogr;

public class ProgressCallback {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected ProgressCallback(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ProgressCallback obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ogrJNI.delete_ProgressCallback(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public int run(double dfComplete, String pszMessage) {
    return ogrJNI.ProgressCallback_run(swigCPtr, this, dfComplete, pszMessage);
  }

  public ProgressCallback() {
    this(ogrJNI.new_ProgressCallback(), true);
  }

}
