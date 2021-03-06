package org.gdal.gdal;

public class NearblackOptions {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected NearblackOptions(long cPtr, boolean cMemoryOwn) {
    if (cPtr == 0)
        throw new RuntimeException();
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(NearblackOptions obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        gdalJNI.delete_NearblackOptions(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  private Object parentReference;

  protected static long getCPtrAndDisown(NearblackOptions obj) {
    if (obj != null)
    {
        obj.swigCMemOwn= false;
        obj.parentReference = null;
    }
    return getCPtr(obj);
  }

  /* Ensure that the GC doesn't collect any parent instance set from Java */
  protected void addReference(Object reference) {
    parentReference = reference;
  }

  public boolean equals(Object obj) {
    boolean equal = false;
    if (obj instanceof NearblackOptions)
      equal = (((NearblackOptions)obj).swigCPtr == this.swigCPtr);
    return equal;
  }

  public int hashCode() {
     return (int)swigCPtr;
  }


  public NearblackOptions(java.util.Vector options) {
    this(gdalJNI.new_NearblackOptions(options), true);
  }

}
