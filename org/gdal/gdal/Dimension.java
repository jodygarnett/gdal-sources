package org.gdal.gdal;

public class Dimension {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected Dimension(long cPtr, boolean cMemoryOwn) {
    if (cPtr == 0)
        throw new RuntimeException();
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Dimension obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        gdalJNI.delete_Dimension(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  private Object parentReference;

  protected static long getCPtrAndDisown(Dimension obj) {
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
    if (obj instanceof Dimension)
      equal = (((Dimension)obj).swigCPtr == this.swigCPtr);
    return equal;
  }

  public int hashCode() {
     return (int)swigCPtr;
  }


  public String GetName() {
    return gdalJNI.Dimension_GetName(swigCPtr, this);
  }

  public String GetFullName() {
    return gdalJNI.Dimension_GetFullName(swigCPtr, this);
  }

  public String GetFieldType() {
    return gdalJNI.Dimension_GetFieldType(swigCPtr, this);
  }

  public String GetDirection() {
    return gdalJNI.Dimension_GetDirection(swigCPtr, this);
  }

  public java.math.BigInteger GetSize() {
    return gdalJNI.Dimension_GetSize(swigCPtr, this);
  }

  public MDArray GetIndexingVariable() {
    long cPtr = gdalJNI.Dimension_GetIndexingVariable(swigCPtr, this);
    return (cPtr == 0) ? null : new MDArray(cPtr, true);
  }

  public boolean SetIndexingVariable(MDArray array) {
    return gdalJNI.Dimension_SetIndexingVariable(swigCPtr, this, MDArray.getCPtr(array), array);
  }

}
