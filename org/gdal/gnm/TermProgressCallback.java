package org.gdal.gnm;

public class TermProgressCallback extends ProgressCallback {
  private transient long swigCPtr;

  protected TermProgressCallback(long cPtr, boolean cMemoryOwn) {
    super(gnmJNI.TermProgressCallback_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(TermProgressCallback obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        gnmJNI.delete_TermProgressCallback(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public TermProgressCallback() {
    this(gnmJNI.new_TermProgressCallback(), true);
  }

  public int run(double dfComplete, String pszMessage) {
    return gnmJNI.TermProgressCallback_run(swigCPtr, this, dfComplete, pszMessage);
  }

}
