package org.gdal.gnm;

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
        gnmJNI.delete_ProgressCallback(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public int run(double dfComplete, String pszMessage) {
    return gnmJNI.ProgressCallback_run(swigCPtr, this, dfComplete, pszMessage);
  }

  public ProgressCallback() {
    this(gnmJNI.new_ProgressCallback(), true);
  }

}
