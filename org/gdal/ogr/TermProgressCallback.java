package org.gdal.ogr;

public class TermProgressCallback extends ProgressCallback {
  private transient long swigCPtr;

  protected TermProgressCallback(long cPtr, boolean cMemoryOwn) {
    super(ogrJNI.TermProgressCallback_SWIGUpcast(cPtr), cMemoryOwn);
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
        ogrJNI.delete_TermProgressCallback(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public TermProgressCallback() {
    this(ogrJNI.new_TermProgressCallback(), true);
  }

  public int run(double dfComplete, String pszMessage) {
    return ogrJNI.TermProgressCallback_run(swigCPtr, this, dfComplete, pszMessage);
  }

}
